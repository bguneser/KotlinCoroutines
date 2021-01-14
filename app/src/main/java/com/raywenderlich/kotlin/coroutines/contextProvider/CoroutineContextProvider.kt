package com.raywenderlich.kotlin.coroutines.contextProvider

import kotlin.coroutines.CoroutineContext

interface CoroutineContextProvider {

    fun context():CoroutineContext

}