package soc.life.familydaily.naviagation

import androidx.fragment.app.Fragment
import soc.life.familydaily.naviagation.params.screen.ScreenParams

interface ScreenFactory {

    fun getFragment(data: ScreenParams): Fragment?

}