import soc.life.familydaily.Deps
import soc.life.familydaily.Base

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
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

    api(Deps.javax)

    implementation(Deps.Ktx.fragment)
    implementation(Deps.Ktx.navigationFragment)
    implementation(Deps.Ktx.navigationUi)
}