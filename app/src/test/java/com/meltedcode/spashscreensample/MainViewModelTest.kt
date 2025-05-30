package com.meltedcode.spashscreensample

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun add() {
        assertEquals(5, viewModel.add(2, 3))
    }
}