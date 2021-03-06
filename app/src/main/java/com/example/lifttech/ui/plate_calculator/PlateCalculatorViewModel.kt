package com.example.lifttech.ui.plate_calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlateCalculatorViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Enter Text Weight Total"
    }
    val text: LiveData<String> = _text
}