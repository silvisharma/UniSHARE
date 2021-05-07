package com.example.unishare.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.unishare.R
import com.example.unishare.RecyclerViewAdapter

class SlideshowViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "This is uploads  Fragment"
    }
    val text: LiveData<String> = _text

}