package com.alessandrocandolini.reactive.business

import com.alessandrocandolini.entities.domain.Addresses
import com.alessandrocandolini.entities.domain.GeoCoordinates
import io.reactivex.ObservableTransformer

/**
 * Convert a stream of latitude and longitude coordinates into an address
 */
interface ReverseGeocodingUseCase : ObservableTransformer<GeoCoordinates, Addresses>