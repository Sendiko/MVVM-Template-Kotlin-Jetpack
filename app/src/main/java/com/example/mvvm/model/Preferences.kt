package com.example.mvvm.model

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class Preferences private constructor(private val dataStore: DataStore<androidx.datastore.preferences.core.Preferences>){

	private val firstKey = stringPreferencesKey("first")
	private val secondKey = intPreferencesKey("second")
	private val thirdKey = booleanPreferencesKey("third")
	
	fun getPreferences() : Flow<String>{
		return dataStore.data.map { preferences ->
			preferences[firstKey] ?: ""
		}
	}
	
	suspend fun savePreferences(first : String, second : Int, third : Boolean){
		dataStore.edit { preferences ->
			preferences[firstKey] = first
			preferences[secondKey] = second
			preferences[thirdKey] = third
		}
	}
	
	companion object{
		@Volatile
		private var INSTANCE : Preferences?= null
		
		fun getInstance(dataStore: DataStore<androidx.datastore.preferences.core.Preferences>) : Preferences {
			return INSTANCE ?: synchronized(this){
				val instance = Preferences(dataStore)
				INSTANCE = instance
				instance
			}
		}
	}

}