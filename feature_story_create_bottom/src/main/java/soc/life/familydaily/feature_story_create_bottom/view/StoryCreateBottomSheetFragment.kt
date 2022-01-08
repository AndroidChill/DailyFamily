package soc.life.familydaily.feature_story_create_bottom.view

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import soc.life.familydaily.core.base.BaseBottomSheetFragment
import soc.life.familydaily.feature_story_create_bottom.databinding.DialogStoryCreateBottomBinding as Binding

@AndroidEntryPoint
class StoryCreateBottomSheetFragment
    : BaseBottomSheetFragment<Binding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> Binding =
        Binding::inflate

    override fun initDialog() {

    }

    override fun initUI() {

    }

    override fun initUX() {

    }

    companion object {

        private const val ARGS_PARAMS = "ARGS_PARAMS"

        fun createBundle(data:)

    }

}