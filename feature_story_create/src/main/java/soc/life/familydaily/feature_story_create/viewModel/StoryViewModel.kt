package soc.life.familydaily.feature_story_create.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import soc.life.familydaily.feature_story_create_bottom.StoryCreateBottomViewData
import soc.life.familydaily.naviagation.Router
import javax.inject.Inject

class StoryViewModel @Inject constructor(
    private val router: Router
) : ViewModel() {

    fun onBaskToListStory() {
        router.back()
    }

    fun onClickBottomMenu(item: StoryCreateBottomViewData) {
        Log.d("qwerty", "onClickBottomMenu: ")
    }

}