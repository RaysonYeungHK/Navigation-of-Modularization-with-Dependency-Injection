package com.codedeco.modularization.navigation.navigator

import androidx.fragment.app.Fragment
import com.codedeco.modularization.navigation.Navigator

interface FeatureASubANavigator : Navigator {
    fun createFragment(): Fragment
}