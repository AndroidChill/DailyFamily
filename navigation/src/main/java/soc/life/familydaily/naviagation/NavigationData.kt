package soc.life.familydaily.naviagation

import soc.life.familydaily.naviagation.bundleCreator.BundleCreator

data class NavigationData(
    val navId: Int,
    val bundleCreator: BundleCreator
)