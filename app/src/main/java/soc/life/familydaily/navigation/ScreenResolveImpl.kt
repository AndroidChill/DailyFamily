package soc.life.familydaily.navigation

import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigator
import androidx.navigation.fragment.FragmentNavigator
import soc.life.familydaily.naviagation.NavigationData
import soc.life.familydaily.naviagation.ScreenResolver
import soc.life.familydaily.naviagation.params.screen.ScreenParams
import javax.inject.Inject

class ScreenResolveImpl @Inject constructor(
    private val navigationDataMap: Map<Class<out ScreenParams>, NavigationData>
) : ScreenResolver {

    override fun navigate(
        navController: NavController?,
        data: ScreenParams,
        sharedElements: Map<Any, String>?
    ) {
        val navExtras = toNavExtras(sharedElements)

        navigationDataMap[data::class.java]
            ?.let {
                navController?.navigate(
                    it.navId,
                    it.bundleCreator.createBundle(data),
                    null,
                    navExtras
                )
            }
    }

    private fun toNavExtras(sharedElements: Map<Any, String>?) : Navigator.Extras {
        return FragmentNavigator.Extras.Builder().apply {
            sharedElements?.forEach { (key, value) ->
                (key as? View)?.let { view ->
                    addSharedElement(view, value)
                }
            }
        }.build()
    }

}