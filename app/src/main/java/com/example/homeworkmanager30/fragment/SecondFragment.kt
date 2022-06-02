package com.example.homeworkmanager30.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.homeworkmanager30.databinding.FragmentSecondBinding
import com.example.homeworkmanager30.viewmodel.SecondViewModel

class SecondFragment : Fragment() {
	
	private var _binding : FragmentSecondBinding?= null
	val binding get() = _binding!!
	
	private val secondViewModel : SecondViewModel by viewModels()
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View? {
		_binding = FragmentSecondBinding.inflate(inflater, container, false)
		
		return binding.root
	}

}