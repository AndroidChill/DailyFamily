package soc.life.familydaily.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import soc.life.familydaily.naviagation.*
import soc.life.familydaily.navigation.*
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NavigationModule {

    @Binds
    @Singleton
    fun ScreenResolveImpl.bindScreenResolver(): ScreenResolver

    @Binds
    @Singleton
    fun ScreenFactoryImpl.bindScreenFactory(): ScreenFactory

    @Binds
    @Singleton
    fun ActionResolverImpl.bindActionResolver(): ActionResolver

    @Binds
    @Singleton
    fun NotificationResolverImpl.bindNotificationResolver(): NotificationResolver

    @Binds
    @Singleton
    fun RouterImpl.bindRouter(): Router

}