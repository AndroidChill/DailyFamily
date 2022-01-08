import soc.life.familydaily.Base
import soc.life.familydaily.Deps

plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdkVersion(Base.currentSDK)

    defaultConfig {
        minSdkVersion(Base.minSDK)
        targetSdkVersion(Base.currentSDK)
        versionCode = Base.versionCode
        versionName = Base.versionName
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    api(project(":core"))

    implementation(Deps.Androidx.recyclerView)
    implementation(Deps.Androidx.cardView)
}