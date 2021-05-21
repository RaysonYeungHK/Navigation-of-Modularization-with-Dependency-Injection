package com.codedeco.modularization.navigation.navigator

import android.os.Parcelable
import androidx.fragment.app.Fragment
import com.codedeco.modularization.navigation.Navigator
import kotlinx.parcelize.Parcelize

interface FeatureASubBNavigator : Navigator {
    fun createFragment(param: Param): Fragment

    @Parcelize
    data class Param(
        val text: String
    ) : Parcelable
}