package com.example.practicehelperapp.ui.timer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TimerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is time Fragment"
    }
    val text: LiveData<String> = _text
}