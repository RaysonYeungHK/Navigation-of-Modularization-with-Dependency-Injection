package com.codedeco.modularization.navigation

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.codedeco.modularization.navigation.databinding.ActivityMainBinding
import com.codedeco.modularization.navigation.navigator.FeatureANavigator
import com.codedeco.modularization.navigation.navigator.FeatureBNavigator
import com.codedeco.modularization.navigation.navigator.FeatureCNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var navigatorFactory: NavigatorFactory

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.featureAButton.setOnClickListener {
            navigatorFactory.get(FeatureANavigator::class.java)
                ?.newIntent(it.context)
                ?.run {
                    startActivity(this)
                }
        }

        binding.featureBButton.setOnClickListener {
            navigatorFactory.get(FeatureBNavigator::class.java)
                ?.newIntent(it.context)
                ?.run {
                    startActivity(this)
                }
        }

        binding.featureCButton.setOnClickListener {
            navigatorFactory.get(FeatureCNavigator::class.java)
                ?.newIntent(it.context)
                ?.run {
                    startActivity(this)
                }
        }
    }
}