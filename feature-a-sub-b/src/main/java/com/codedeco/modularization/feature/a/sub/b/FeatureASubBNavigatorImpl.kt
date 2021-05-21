package com.codedeco.modularization.feature.a.sub.b

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.codedeco.modularization.navigation.Navigator
import com.codedeco.modularization.navigation.navigator.FeatureASubBNavigator
import javax.inject.Inject

class FeatureASubBNavigatorImpl @Inject constructor() : FeatureASubBNavigator {
    override fun createFragment(param: FeatureASubBNavigator.Param): Fragment {
        return FeatureASubBFragment().apply {
            arguments = Bundle().apply {
                putParcelable(Navigator.PARAM, param)
            }
        }
    }
}