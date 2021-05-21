package com.codedeco.modularization.navigation.feature.c

import android.content.Context
import android.content.Intent
import com.codedeco.modularization.navigation.navigator.FeatureCNavigator
import javax.inject.Inject

class FeatureCNavigatorImpl @Inject constructor() : FeatureCNavigator {
    override fun newIntent(context: Context): Intent {
        return Intent(context, FeatureCActivity::class.java)
    }
}