package soc.life.familydaily.feature_story_create_bottom

import soc.life.familydaily.core_adapter.ViewHolderType

sealed class StoryCreateBottomViewData : ViewHolderType {

    abstract val name: Int

    override fun getUniqueId(): Long = name.toLong()

    data class Image(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Image
    }

    data class Sticker(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Sticker
    }

    data class Smile(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Sticker
    }
    data class List(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Image
    }

    data class Microphone(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Sticker
    }

    data class Paint(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Sticker
    }
    data class Tag(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Image
    }

    data class Text(
        override val name: Int
    ) : StoryCreateBottomViewData() {
        override fun isValidType(other: ViewHolderType): Boolean = other is Sticker
    }

}