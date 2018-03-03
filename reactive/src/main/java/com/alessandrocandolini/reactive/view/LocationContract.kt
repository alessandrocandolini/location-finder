package com.alessandrocandolini.reactive.view

import com.alessandrocandolini.entities.data.*
import io.reactivex.Observable

/**
 * Created by alessandroc on 19/02/2018.
 */
interface LocationContract {

    interface View {

        fun search(): Observable<Search>

        fun refresh(): Observable<Refresh>

        fun click(): Observable<SelectLocation>

        fun render(viewStates : ViewStates)
    }


    interface Presenter {



    }


}