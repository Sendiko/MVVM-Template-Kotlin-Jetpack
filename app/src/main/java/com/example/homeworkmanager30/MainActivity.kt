package com.example.homeworkmanager30

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.homeworkmanager30.databinding.ActivityMainBinding

val Context.datastore : DataStore<Preferences> by preferencesDataStore("datastore")
class MainActivity : AppCompatActivity() {
	
	private lateinit var binding :ActivityMainBinding
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
}