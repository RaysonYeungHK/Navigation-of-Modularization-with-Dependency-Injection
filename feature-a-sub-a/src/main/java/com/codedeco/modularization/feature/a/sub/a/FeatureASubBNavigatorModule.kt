package com.codedeco.modularization.feature.a.sub.a

import com.codedeco.modularization.navigation.Navigator
import com.codedeco.modularization.navigation.NavigatorKey
import com.codedeco.modularization.navigation.navigator.FeatureASubANavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureASubANavigatorModule {
    @Binds
    @IntoMap
    @NavigatorKey(FeatureASubANavigator::class)
    abstract fun bindFeatureASubANavigator(navigator: FeatureASubANavigatorImpl): Navigator
}