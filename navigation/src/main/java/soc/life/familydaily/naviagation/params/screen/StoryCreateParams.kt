package soc.life.familydaily.naviagation.params.screen

import android.os.Parcelable
import androidx.annotation.ColorInt
import kotlinx.parcelize.Parcelize
import soc.life.familydaily.naviagation.params.action.ActionParams

//
//sealed class StoryCreateParams : ScreenParams, Parcelable {
//
//    abstract val sizePreview: SizePreview
//
//    @Parcelize
//    data class Create(
//        val transitionName : String,
////        val id: Long,
////        override val sizePreview: SizePreview,
//        val preview: Preview? = null
//    ) : Parcelable, StoryCreateParams() {
//
//        @Parcelize
//        data class Preview(
//            val name: String,
////            val iconId: R --- мб добавить какие-то иконки
//        ) : Parcelable
//
//    }
//
//    @Parcelize
//    data class SizePreview(
//        val width: Int? = null,
//        val height: Int? = null,
//        val asRow: Boolean = false
//    ) : Parcelable
//
//}

@Parcelize
data class StoryCreateParams(
    val transitionName: String = "",
//    val filter: TypesFilterParams = TypesFilterParams(),
    val preview: Preview? = null
) : Parcelable, ScreenParams {

    @Parcelize
    data class Preview(
        val name: String,
//        val iconId: RecordTypeIconParams? = null,
//        @ColorInt val color: Int
    ) : Parcelable
}
