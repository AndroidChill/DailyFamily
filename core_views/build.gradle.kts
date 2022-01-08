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

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(Deps.Androidx.appcompat)
    implementation(Deps.Androidx.recyclerView)
    implementation(Deps.Androidx.constraintLayout)
    implementation(Deps.Androidx.cardView)
    implementation(Deps.Androidx.material)
    implementation(Deps.Emoji.emojiCompat)
}