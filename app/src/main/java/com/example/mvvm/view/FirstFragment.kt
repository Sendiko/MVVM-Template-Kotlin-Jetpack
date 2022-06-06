package com.example.mvvm.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.databinding.FragmentFirstBinding
import com.example.mvvm.datastore
import com.example.mvvm.model.Preferences
import com.example.mvvm.viewmodel.FirstViewModel
import com.example.mvvm.viewmodel.ViewModelFactory

class FirstFragment : Fragment() {
	
	private var _binding : FragmentFirstBinding?= null
	val binding get() = _binding!!
	
	private val pref by lazy {
		val context = requireNotNull(this.context)
		Preferences.getInstance(context.datastore)
	}
	
	private val firstViewModel : FirstViewModel by lazy {
		ViewModelProvider(this, ViewModelFactory(pref))[FirstViewModel::class.java]
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?,
	): View? {
		_binding = FragmentFirstBinding.inflate(inflater, container, false)
		
		onBackPressed()
		return binding.root
	}

	private fun onBackPressed(){
		requireActivity().onBackPressedDispatcher.addCallback {
			Toast.makeText(context, "use home button to exit the app", Toast.LENGTH_SHORT).show()
		}
	}
	
}