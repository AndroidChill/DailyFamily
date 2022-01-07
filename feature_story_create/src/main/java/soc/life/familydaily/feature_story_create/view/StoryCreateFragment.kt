package soc.life.familydaily.feature_story_create.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import soc.life.familydaily.core.base.BaseFragment
import soc.life.familydaily.core.di.BaseViewModelFactory
import soc.life.familydaily.feature_story_create.viewModel.StoryViewModel
import soc.life.familydaily.naviagation.params.screen.StoryCreateParams
import javax.inject.Inject
import soc.life.familydaily.feature_story_create.databinding.FragmentStoryCreateBinding as Binding

@AndroidEntryPoint
class StoryCreateFragment :
    BaseFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory<StoryViewModel>

    private val viewModel: StoryViewModel by viewModels(
        factoryProducer = { viewModelFactory }
    )

    override fun initUI() {

    }

    override fun initUX() {
        with(binding) {
            ivClose.setOnClickListener {
                viewModel.onBaskToListStory()
            }
        }
    }

    override fun initViewModel() {

    }

    companion object {
        fun createBundle(data: StoryCreateParams): Bundle = Bundle().apply {

        }
    }
}