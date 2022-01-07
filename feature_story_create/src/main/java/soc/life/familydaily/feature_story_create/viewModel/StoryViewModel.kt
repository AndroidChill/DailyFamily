package soc.life.familydaily.feature_story_create.viewModel

import androidx.lifecycle.ViewModel
import soc.life.familydaily.naviagation.Router
import javax.inject.Inject

class StoryViewModel @Inject constructor(
    private val router: Router
) : ViewModel() {

    fun onBaskToListStory() {
        router.back()
    }

}