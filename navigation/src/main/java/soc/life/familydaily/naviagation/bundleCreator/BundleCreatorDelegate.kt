package soc.life.familydaily.naviagation.bundleCreator

import android.os.Bundle
import soc.life.familydaily.naviagation.params.screen.ScreenParams

inline fun <T: ScreenParams> bundleCreatorDelegate(
    crossinline bundleCreator: ((T) -> Bundle?)
) = object : BundleCreator() {

    @Suppress("UNCHECKED_CAST")
    override fun createBundle(data: Any): Bundle? {
        return bundleCreator(data as T)
    }
}