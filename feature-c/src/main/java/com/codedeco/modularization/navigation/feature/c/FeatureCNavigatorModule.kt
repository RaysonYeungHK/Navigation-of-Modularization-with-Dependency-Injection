package com.codedeco.modularization.navigation.feature.c

import com.codedeco.modularization.navigation.Navigator
import com.codedeco.modularization.navigation.NavigatorKey
import com.codedeco.modularization.navigation.navigator.FeatureCNavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureCNavigatorModule {
    @Binds
    @IntoMap
    @NavigatorKey(FeatureCNavigator::class)
    abstract fun bindFeatureCNavigator(navigator: FeatureCNavigatorImpl): Navigator
}