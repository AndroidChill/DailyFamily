package soc.life.familydaily.feature_main.viewModel

import androidx.lifecycle.ViewModel
import soc.life.familydaily.naviagation.Router
import soc.life.familydaily.naviagation.params.screen.StoryCreateParams
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val router: Router
) : ViewModel() {

    fun onStoryClick() {
        router.navigate(
            data = StoryCreateParams()
        )
    }

}