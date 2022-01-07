package soc.life.familydaily.navigation

import android.app.Activity
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import soc.life.familydaily.naviagation.ActionResolver
import soc.life.familydaily.naviagation.RequestCode
import soc.life.familydaily.naviagation.ResultContainer
import soc.life.familydaily.naviagation.params.action.ActionParams
import javax.inject.Inject

class ActionResolverImpl @Inject constructor(
    private val resultContainer: ResultContainer
) : ActionResolver {

    private var createFileResultLauncher: ActivityResultLauncher<Intent>? = null
    private var openFileResultLauncher: ActivityResultLauncher<Intent>? = null

    override fun registerResultListener(activity: ComponentActivity) {
//        createFileResultLauncher = activity.registerForActivityResult(RequestCode.REQUEST_CODE_CREATE_FILE)
//        openFileResultLauncher = activity.registerForActivityResult(RequestCode.REQUEST_CODE_OPEN_FILE)
    }

    override fun execute(activity: Activity?, data: ActionParams) {

    }
}