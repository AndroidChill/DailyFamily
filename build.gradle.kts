// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath(soc.life.familydaily.BuildPlugins.gradle)
        classpath(soc.life.familydaily.BuildPlugins.kotlin)
        classpath(soc.life.familydaily.BuildPlugins.ktlint)
        classpath(soc.life.familydaily.BuildPlugins.hilt)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }

    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
