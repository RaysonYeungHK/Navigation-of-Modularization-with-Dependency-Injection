package com.codedeco.modularization.navigation.feature.a

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.codedeco.modularization.navigation.NavigatorFactory
import com.codedeco.modularization.navigation.feature.a.databinding.ActivityFeatureABinding
import com.codedeco.modularization.navigation.navigator.FeatureASubANavigator
import com.codedeco.modularization.navigation.navigator.FeatureASubBNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeatureAActivity : AppCompatActivity() {
    @Inject
    lateinit var navigatorFactory: NavigatorFactory

    private lateinit var binding: ActivityFeatureABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeatureABinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.subFragmentAButton.setOnClickListener {
            navigatorFactory.get(FeatureASubANavigator::class.java)
                ?.createFragment()
                ?.run {
                    supportFragmentManager.beginTransaction()
                        .replace(binding.fragmentContainer.id, this)
                        .commitAllowingStateLoss()
                }
        }

        binding.subFragmentBButton.setOnClickListener {
            navigatorFactory.get(FeatureASubBNavigator::class.java)
                ?.createFragment(FeatureASubBNavigator.Param("This is the text from parent fragment"))
                ?.run {
                    supportFragmentManager.beginTransaction()
                        .replace(binding.fragmentContainer.id, this)
                        .commitAllowingStateLoss()
                }
        }
    }
}