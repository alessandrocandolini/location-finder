package com.alessandrocandolini.reactive.data

import com.alessandrocandolini.entities.domain.Addresses
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Facade pattern interfacing to the top of data access layer
 *
 * The interface captures/encodes the contract with the API. We rely on retrofit for the actual implementation
 */

interface GeocodingRepository {

    @GET("/maps/api/geocode/json")
    fun geocode(@Query("address") address : String) : Single<GoogleResponse>

    @GET("/maps/api/geocode/json")
    fun reserseGeocode(@Query("latlng") latlng : String) :  Single<GoogleResponse>

}
