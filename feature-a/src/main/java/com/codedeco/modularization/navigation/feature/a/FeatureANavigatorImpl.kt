package com.codedeco.modularization.navigation.feature.a

import android.content.Context
import android.content.Intent
import com.codedeco.modularization.navigation.navigator.FeatureANavigator
import javax.inject.Inject

class FeatureANavigatorImpl @Inject constructor() : FeatureANavigator {
    override fun newIntent(context: Context): Intent {
        return Intent(context, FeatureAActivity::class.java)
    }
}