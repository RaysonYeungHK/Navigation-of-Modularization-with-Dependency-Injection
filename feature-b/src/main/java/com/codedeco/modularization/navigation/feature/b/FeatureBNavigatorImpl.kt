package com.codedeco.modularization.navigation.feature.b

import android.content.Context
import android.content.Intent
import com.codedeco.modularization.navigation.navigator.FeatureBNavigator
import javax.inject.Inject

class FeatureBNavigatorImpl @Inject constructor() : FeatureBNavigator {
    override fun newIntent(context: Context): Intent {
        return Intent(context, FeatureBActivity::class.java)
    }
}