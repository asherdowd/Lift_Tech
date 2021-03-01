package com.example.lifttech.ui.builder

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BuilderViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Builder Fragment"
    }
    val text: LiveData<String> = _text
}