package soc.life.familydaily

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FamilyDailyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initLog()
        initLibraries()
    }

    private fun initLog() {
//        if (BuildConfig.DEBUG) {
//            Timber.plant(DebugTree())
//        }
    }

    private fun initLibraries() {
//        val config = BundledEmojiCompatConfig(applicationContext)
//            .setReplaceAll(true)
//        EmojiCompat.init(config)
    }

}