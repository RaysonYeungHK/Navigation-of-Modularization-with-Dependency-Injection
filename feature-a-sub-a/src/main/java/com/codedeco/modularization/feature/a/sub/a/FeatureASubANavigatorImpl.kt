package com.codedeco.modularization.feature.a.sub.a

import androidx.fragment.app.Fragment
import com.codedeco.modularization.navigation.navigator.FeatureASubANavigator
import com.codedeco.modularization.navigation.navigator.FeatureASubBNavigator
import javax.inject.Inject

class FeatureASubANavigatorImpl @Inject constructor() : FeatureASubANavigator {
    override fun createFragment(): Fragment {
        return FeatureASubAFragment()
    }
}