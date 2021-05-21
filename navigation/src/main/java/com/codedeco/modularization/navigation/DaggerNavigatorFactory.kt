package com.codedeco.modularization.navigation

import android.util.Log
import javax.inject.Inject
import javax.inject.Provider

open class DaggerNavigatorFactory @Inject constructor(
    private val navigatorMap: Map<Class<out Navigator>, @JvmSuppressWildcards Provider<Navigator>>
) : NavigatorFactory {
    companion object {
        private const val TAG = "NavigatorFactory"
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : Navigator?> get(modelClass: Class<T>): T? {
        val navigator = navigatorMap[modelClass] ?: navigatorMap.asIterable().firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value
        if (navigator == null) {
            Log.w(TAG, "$modelClass is not yet provided")
        }
        return try {
            navigator?.get() as T?
        } catch (e: Exception) {
            throw e
        }
    }
}