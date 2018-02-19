package com.alessandrocandolini.reactive.view

/**
 * Created by alessandroc on 19/02/2018.
 */
sealed class ViewActions

object Refresh : ViewActions()
data class Search(val searchTerm : String) : ViewActions()
class Click() : ViewActions()