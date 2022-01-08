package soc.life.familydaily.core_views

import android.content.res.Resources
import android.util.TypedValue
import kotlin.math.roundToInt

fun Float.dpToPx(): Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, getDisplayMetrics()).roundToInt()

fun Int.dpToPx(): Int = this.toFloat().dpToPx()

fun Float.pxToDp(): Int = (this / Resources.getSystem().displayMetrics.density).roundToInt()

fun Int.pxToDp(): Int = this.toFloat().pxToDp()

fun Float.spToPx(): Int = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this, getDisplayMetrics()).roundToInt()

fun Int.spToPx(): Int = this.toFloat().spToPx()

private fun getDisplayMetrics() = Resources.getSystem().displayMetrics