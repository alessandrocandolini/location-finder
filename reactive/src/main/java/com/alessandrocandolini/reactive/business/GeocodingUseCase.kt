package com.alessandrocandolini.reactive.business

import io.reactivex.Single

/**
 * Created by alessandroc on 19/02/2018.
 */
interface GeocodingUseCase {

    fun geocode(address : String) : Single<Addresses>

}