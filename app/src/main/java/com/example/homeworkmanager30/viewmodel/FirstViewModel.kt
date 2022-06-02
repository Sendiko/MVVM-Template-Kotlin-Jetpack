package com.example.homeworkmanager30.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.homeworkmanager30.datastore.Preferences
import kotlinx.coroutines.launch

class FirstViewModel(private val dp : Preferences) : ViewModel(){
	
	fun getPreferences() : LiveData<String>{
		return dp.getPreferences().asLiveData()
	}
	
	fun savePreferences(first : String, second : Int, third : Boolean){
		viewModelScope.launch {
			dp.savePreferences(first, second, third)
		}
	}
	
}