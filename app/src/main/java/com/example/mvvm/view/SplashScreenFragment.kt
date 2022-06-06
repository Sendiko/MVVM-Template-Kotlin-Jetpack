package com.example.mvvm.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mvvm.R
import com.example.mvvm.databinding.FragmentSplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenFragment : Fragment() {
	
	private var _binding : FragmentSplashScreenBinding?= null
	val binding get() = _binding!!
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View? {
		_binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
		
		Handler(Looper.myLooper()!!).postDelayed({
			findNavController().navigate(R.id.action_splashScreenFragment_to_homeFragment)
		}, 500)
		
		return binding.root
	}

}