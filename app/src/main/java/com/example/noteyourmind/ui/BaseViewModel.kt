package com.example.noteyourmind.ui

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<EVENT>: ViewModel() {

    abstract fun onTriggerEvent(event: EVENT)
}