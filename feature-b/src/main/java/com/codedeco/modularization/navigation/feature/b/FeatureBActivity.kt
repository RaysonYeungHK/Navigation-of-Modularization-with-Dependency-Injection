package com.codedeco.modularization.navigation.feature.b

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.codedeco.modularization.navigation.NavigatorFactory
import com.codedeco.modularization.navigation.feature.b.databinding.ActivityFeatureBBinding
import com.codedeco.modularization.navigation.navigator.FeatureANavigator
import com.codedeco.modularization.navigation.navigator.FeatureCNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeatureBActivity : AppCompatActivity() {
    @Inject
    lateinit var navigatorFactory: NavigatorFactory

    private lateinit var binding: ActivityFeatureBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeatureBBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.featureAButton.setOnClickListener {
            navigatorFactory.get(FeatureANavigator::class.java)
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