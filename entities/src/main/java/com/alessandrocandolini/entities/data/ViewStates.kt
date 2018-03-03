package com.alessandrocandolini.entities.data

/**
 * Algebraic data type encoding all and only possible representations of the view state
 */
sealed class ViewStates

/** Model the successful case */
data class Success(val placeholder:String) : ViewStates()

/** Loading state */
object Loading : ViewStates()

/** Error connection */
data class Error(val error : String) : ViewStates()

/** No results view state */
object NoResults : ViewStates()