package soc.life.familydaily.naviagation

import android.app.Activity
import androidx.activity.ComponentActivity
import soc.life.familydaily.naviagation.params.action.ActionParams

interface ActionResolver {

    fun registerResultListener(activity: ComponentActivity)

    fun execute(activity: Activity?, data: ActionParams)

}