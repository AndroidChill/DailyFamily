package soc.life.familydaily.feature_story_create_bottom

import soc.life.familydaily.core_adapter.createRecyclerBindingAdapterDelegate
import soc.life.familydaily.core_views.setOnClickWith
import soc.life.familydaily.feature_story_create_bottom.StoryCreateBottomViewData as ViewData
import soc.life.familydaily.feature_story_create_bottom.databinding.ItemStoryCreateBottomBinding as Binding

fun storyCreateBottomAdapterDelegate(
    onItemClick: ((ViewData) -> Unit)? = null
) = createRecyclerBindingAdapterDelegate<ViewData, Binding>(
    Binding::inflate
) { binding, item, _ ->
    with(binding) {
        item as ViewData

//        if (item is ViewData.Image) {
            ivContent.setImageResource(item.name)
//        }

        onItemClick?.let { root.setOnClickWith(item, onItemClick) }
    }

}