package soc.life.familydaily.naviagation.params.action

data class OpenFileParams(
    val notHandleCallback: (() -> Unit)
) : ActionParams