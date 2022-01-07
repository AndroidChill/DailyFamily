package soc.life.familydaily.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import soc.life.familydaily.R
import soc.life.familydaily.feature_story_create.view.StoryCreateFragment
import soc.life.familydaily.naviagation.NavigationData
import soc.life.familydaily.naviagation.bundleCreator.bundleCreatorDelegate
import soc.life.familydaily.naviagation.params.screen.StoryCreateParams

@Module
@InstallIn(SingletonComponent::class)
class NavigationScreenMapModule {

    @IntoMap
    @Provides
    @ScreenKey(StoryCreateParams::class)
    fun storyCreate() : NavigationData {
        return NavigationData(
            navId = R.id.story_create,
            bundleCreatorDelegate(StoryCreateFragment::createBundle)
        )
    }

}