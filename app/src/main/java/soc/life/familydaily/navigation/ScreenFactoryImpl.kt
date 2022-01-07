package soc.life.familydaily.navigation

import androidx.fragment.app.Fragment
import soc.life.familydaily.naviagation.ScreenFactory
import soc.life.familydaily.naviagation.params.screen.ScreenParams
import javax.inject.Inject

class ScreenFactoryImpl @Inject constructor() : ScreenFactory {

    override fun getFragment(data: ScreenParams): Fragment? = null

}