package com.codedeco.modularization.feature.a.sub.a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codedeco.modularization.feature.a.sub.a.databinding.FragmentASubABinding
import com.codedeco.modularization.navigation.NavigatorFactory
import com.codedeco.modularization.navigation.navigator.FeatureANavigator
import com.codedeco.modularization.navigation.navigator.FeatureBNavigator
import com.codedeco.modularization.navigation.navigator.FeatureCNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeatureASubAFragment : Fragment() {
    @Inject
    lateinit var navigatorFactory: NavigatorFactory

    private lateinit var binding: FragmentASubABinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentASubABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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