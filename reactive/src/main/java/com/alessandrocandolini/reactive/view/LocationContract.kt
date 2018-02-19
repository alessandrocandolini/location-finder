package com.alessandrocandolini.reactive.view

import io.reactivex.Observable

/**
 * Created by alessandroc on 19/02/2018.
 */
interface LocationContract {

    interface View {

        fun search(): Observable<Search>

        fun refresh(): Observable<Refresh>

        fun click(): Observable<Click>

        fun render(viewStates : ViewStates) : Unit
    }


    interface Presenter {

        

    }


}