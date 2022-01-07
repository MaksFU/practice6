package com.example.practicce6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RandomNumberViewModel : ViewModel() {
    val randNum = MutableLiveData<Int>()
    // Тоже самое что и: val counter: LiveData<Int> = MutableLiveData<Int>()
    fun onButClicked() {
        randNum.value = (0..50).random()
    }
}