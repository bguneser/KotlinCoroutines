package com.raywenderlich.kotlin.coroutines.contextProvider

import kotlin.coroutines.CoroutineContext

class CoroutineContextProviderImpl(private val context :CoroutineContext) : CoroutineContextProvider {

    override fun context(): CoroutineContext =context
}