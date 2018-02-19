package com.alessandrocandolini.reactive.view

/**
 * Created by alessandroc on 19/02/2018.
 */
sealed class ViewStates

data class Success(val placeholder:String) : ViewStates()
object Loading : ViewStates()
data class Error(val error : String) : ViewStates()