package com.alessandrocandolini.reactive.business

import com.alessandrocandolini.entities.domain.GeoCoordinates
import io.reactivex.Observable

/** Wraps a source of current geolocation data */
interface GeolocationUseCase {

    fun currentLocation() : Observable<GeoCoordinates>

}