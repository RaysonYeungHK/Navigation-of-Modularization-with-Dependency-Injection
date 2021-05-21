package com.codedeco.modularization.navigation.feature.a

import com.codedeco.modularization.navigation.Navigator
import com.codedeco.modularization.navigation.NavigatorKey
import com.codedeco.modularization.navigation.navigator.FeatureANavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureANavigatorModule {
    @Binds
    @IntoMap
    @NavigatorKey(FeatureANavigator::class)
    abstract fun bindFeatureANavigator(navigator: FeatureANavigatorImpl): Navigator
}