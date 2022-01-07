import soc.life.familydaily.Deps
import soc.life.familydaily.Base

plugins {
    id("com.android.library")
}

android {
    compileSdkVersion(Base.currentSDK)

    defaultConfig {
        minSdkVersion(Base.minSDK)
        targetSdkVersion(Base.currentSDK)
        versionCode = Base.versionCode
        versionName = Base.versionName
    }
}

dependencies {
    api(Deps.Androidx.appcompat)
}