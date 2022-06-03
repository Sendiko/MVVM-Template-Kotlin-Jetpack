package com.example.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.datastore.Preferences

class ViewModelFactory(private val preferences: Preferences) : ViewModelProvider.NewInstanceFactory() {
	override fun <T : ViewModel> create(modelClass: Class<T>): T {
		if (modelClass.isAssignableFrom(FirstViewModel::class.java)) return FirstViewModel(preferences) as T
		throw IllegalArgumentException("Unknown model class : " + modelClass.name)
	}
}