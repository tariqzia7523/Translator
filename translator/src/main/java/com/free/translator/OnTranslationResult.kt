package com.free.translator

interface OnTranslationResult {
    fun onSuccess(text : String)
    fun onFailure()
}