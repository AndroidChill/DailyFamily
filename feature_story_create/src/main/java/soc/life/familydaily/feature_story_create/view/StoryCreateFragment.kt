package soc.life.familydaily.feature_story_create.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import soc.life.familydaily.core.base.BaseFragment
import soc.life.familydaily.core.di.BaseViewModelFactory
import soc.life.familydaily.core_adapter.BaseRecyclerAdapter
import soc.life.familydaily.core_adapter.ViewHolderType
import soc.life.familydaily.core_views.setOnClick
import soc.life.familydaily.feature_story_create.R
import soc.life.familydaily.feature_story_create.viewModel.StoryViewModel
import soc.life.familydaily.feature_story_create_bottom.StoryCreateBottomViewData
import soc.life.familydaily.feature_story_create_bottom.storyCreateBottomAdapterDelegate
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

    private val bottomAdapter: BaseRecyclerAdapter by lazy {
        BaseRecyclerAdapter(
            storyCreateBottomAdapterDelegate(viewModel::onClickBottomMenu)
        )
    }

    override fun initUI(): Unit = with(binding) {

    }

    override fun initUX(): Unit = with(binding) {
        ivClose.setOnClick(viewModel::onBaskToListStory)
        btnSave.setOnClick(viewModel::onBaskToListStory)
        rvBottom.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            adapter = bottomAdapter
        }
    }


    override fun initViewModel() {
        bottomAdapter.replaceAsNew(
            mutableListOf<ViewHolderType>(
                StoryCreateBottomViewData.List(R.drawable.ic_list_bottom),
                StoryCreateBottomViewData.Sticker(R.drawable.ic_sticker_bottom),
                StoryCreateBottomViewData.Smile(R.drawable.ic_smile_bottom),
                StoryCreateBottomViewData.Image(R.drawable.ic_image_bottom),
                StoryCreateBottomViewData.Microphone(R.drawable.ic_microphone_bottom),
                StoryCreateBottomViewData.Paint(R.drawable.ic_paint_bottom),
                StoryCreateBottomViewData.Tag(R.drawable.ic_tag_bottom),
                StoryCreateBottomViewData.Text(R.drawable.ic_text_bottom),
            )
        )
    }

    companion object {
        fun createBundle(data: StoryCreateParams): Bundle = Bundle().apply {

        }
    }
}