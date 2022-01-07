package soc.life.familydaily.naviagation

import androidx.navigation.NavController
import soc.life.familydaily.naviagation.params.screen.ScreenParams

interface ScreenResolver {

    fun navigate(
        navController: NavController?,
        data: ScreenParams,
        sharedElements: Map<Any, String>?
    )

}