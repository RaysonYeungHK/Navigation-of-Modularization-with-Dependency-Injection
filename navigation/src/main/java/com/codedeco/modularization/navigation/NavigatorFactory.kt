package com.codedeco.modularization.navigation

import androidx.annotation.MainThread
import androidx.annotation.Nullable

interface NavigatorFactory {
    @Nullable
    @MainThread
    fun <T : Navigator?> get(modelClass: Class<T>): T?
}