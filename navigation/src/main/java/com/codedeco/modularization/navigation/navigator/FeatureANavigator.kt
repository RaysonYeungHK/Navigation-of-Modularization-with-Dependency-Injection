package com.codedeco.modularization.navigation.navigator

import android.content.Context
import android.content.Intent
import com.codedeco.modularization.navigation.Navigator

interface FeatureANavigator : Navigator {
    fun newIntent(context: Context): Intent
}