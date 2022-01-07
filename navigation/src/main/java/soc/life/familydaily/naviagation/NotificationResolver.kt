package soc.life.familydaily.naviagation

import android.app.Activity
import soc.life.familydaily.naviagation.params.notification.NotificationParams

interface NotificationResolver {

    fun show(activity: Activity?, data: NotificationParams, anchor: Any?)

}