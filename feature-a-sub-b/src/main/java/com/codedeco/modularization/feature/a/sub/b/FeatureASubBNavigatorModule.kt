package com.codedeco.modularization.feature.a.sub.b

import com.codedeco.modularization.navigation.Navigator
import com.codedeco.modularization.navigation.NavigatorKey
import com.codedeco.modularization.navigation.navigator.FeatureASubBNavigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
abstract class FeatureASubBNavigatorModule {
    @Binds
    @IntoMap
    @NavigatorKey(FeatureASubBNavigator::class)
    abstract fun bindFeatureASubBNavigator(navigator: FeatureASubBNavigatorImpl): Navigator
}