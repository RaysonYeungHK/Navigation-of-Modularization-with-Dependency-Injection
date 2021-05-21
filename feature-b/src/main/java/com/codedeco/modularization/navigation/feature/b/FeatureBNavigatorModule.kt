package com.codedeco.modularization.navigation.feature.b

import com.codedeco.modularization.navigation.Navigator
import com.codedeco.modularization.navigation.NavigatorKey
import com.codedeco.modularization.navigation.navigator.FeatureBNavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureBNavigatorModule {
    @Binds
    @IntoMap
    @NavigatorKey(FeatureBNavigator::class)
    abstract fun bindFeatureBNavigator(navigator: FeatureBNavigatorImpl): Navigator
}