package soc.life.familydaily.di

import dagger.MapKey
import soc.life.familydaily.naviagation.params.screen.ScreenParams
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ScreenKey(val value: KClass<out ScreenParams>)