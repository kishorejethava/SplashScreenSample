package com.meltedcode.spashscreensample

import androidx.lifecycle.ViewModel


class MainViewModel: ViewModel() {
    fun add(a: Int, b: Int): Int {
        return a+b
    }
}