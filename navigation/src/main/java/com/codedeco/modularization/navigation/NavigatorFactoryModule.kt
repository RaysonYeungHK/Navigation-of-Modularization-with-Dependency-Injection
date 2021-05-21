package com.codedeco.modularization.navigation

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface NavigatorFactoryModule {
    @Binds
    fun bindNavigatorFactory(viewModelFactory: DaggerNavigatorFactory): NavigatorFactory
}