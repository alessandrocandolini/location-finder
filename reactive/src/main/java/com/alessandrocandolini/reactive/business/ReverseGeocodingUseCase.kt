package com.alessandrocandolini.reactive.business

import io.reactivex.Single

/**
 * Created by alessandroc on 19/02/2018.
 */
interface ReverseGeocodingUseCase {

    fun reverseGeocoding(latitude : Double, longitude : Double) : Single<Addresses>

}