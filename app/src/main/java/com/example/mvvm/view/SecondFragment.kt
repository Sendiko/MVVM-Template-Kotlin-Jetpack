package com.example.mvvm.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mvvm.databinding.FragmentSecondBinding
import com.example.mvvm.viewmodel.SecondViewModel

class SecondFragment : Fragment() {
	
	private var _binding : FragmentSecondBinding?= null
	val binding get() = _binding!!
	
	private val secondViewModel : SecondViewModel by viewModels()
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View {
		_binding = FragmentSecondBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		// TODO: CODE HERE
	}

}