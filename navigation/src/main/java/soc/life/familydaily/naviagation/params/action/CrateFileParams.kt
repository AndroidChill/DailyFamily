package soc.life.familydaily.naviagation.params.action

data class CrateFileParams(
    val notHandleCallback: (() -> Unit)
) : ActionParams