package com.alessandrocandolini.reactive.business

import com.alessandrocandolini.entities.domain.Addresses
import io.reactivex.ObservableTransformer

/**
 * Converts upstream of [AddressHint] into streams of corresponding [Addresses]
 */
interface GeocodingUseCase : ObservableTransformer<AddressHint,Addresses>
