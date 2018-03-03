package com.alessandrocandolini.entities.data

/**
 * Algebraic data type modelling all and only the possible incoming inputs triggered by the view/user actions
 */
sealed class ViewActions

/** Trigger a refresh of the current geolocation */
object Refresh : ViewActions()

/** Trigger by typing a new [searchTerm] */
data class Search(val searchTerm : String) : ViewActions()

/** Trigger a click on a given address */
class SelectLocation : ViewActions()