package com.codedeco.modularization.navigation.feature.c

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.codedeco.modularization.navigation.NavigatorFactory
import com.codedeco.modularization.navigation.feature.c.databinding.ActivityFeatureCBinding
import com.codedeco.modularization.navigation.navigator.FeatureANavigator
import com.codedeco.modularization.navigation.navigator.FeatureBNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeatureCActivity : AppCompatActivity() {
    @Inject
    lateinit var navigatorFactory: NavigatorFactory

    private lateinit var binding: ActivityFeatureCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFeatureCBinding.inflate(LayoutInflater.from(this))
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
    }
}