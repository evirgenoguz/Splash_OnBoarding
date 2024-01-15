package com.evirgenoguz.onboarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.evirgenoguz.onboarding.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)

        // Splash screen'i 5 saniye boyunca göster
        Handler().postDelayed({
            // MainActivity'yi başlat

            // Fragment'i kapat
            findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToOnBoardingFragment())
        }, 3000)

        return binding.root
    }


}