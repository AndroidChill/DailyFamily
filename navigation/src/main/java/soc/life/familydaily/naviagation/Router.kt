package soc.life.familydaily.naviagation

import android.app.Activity
import android.content.Intent
import androidx.activity.ComponentActivity
import soc.life.familydaily.naviagation.params.action.ActionParams
import soc.life.familydaily.naviagation.params.notification.NotificationParams
import soc.life.familydaily.naviagation.params.screen.ScreenParams

interface Router {

    fun onCreate(activity: ComponentActivity)

    fun bind(activity: Activity)

    fun navigate(
        data: ScreenParams,
        sharedElements: Map<Any, String>? = null
    )

    fun execute(
        data: ActionParams
    )

    fun show(
        data: NotificationParams,
        anchor: Any? = null
    )

    fun setResultListener(
        key: String, listener:
        ResultListener
    )

    fun sendResult(
        key: String,
        data: Any?
    )

    fun back()

    fun getMainStartIntent(): Intent

}