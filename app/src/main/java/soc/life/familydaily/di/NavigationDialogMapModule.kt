package soc.life.familydaily.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import soc.life.familydaily.R
import soc.life.familydaily.naviagation.NavigationData
import soc.life.familydaily.naviagation.bundleCreator.bundleCreatorDelegate

@Module
@InstallIn(SingletonComponent::class)
class NavigationDialogMapModule {

    fun storyCreateBottomDialog() : NavigationData =
        NavigationData(
            navId = R.id.dialog_story_create_bottom,
            bundleCreatorDelegate()
        )

}