# location-finder

Sample application to display on the fly a list of matching addresses from geolocation updates and/or manual inputs.

The app relies on the google api endpoint.

The project is used for a comparison of different approaches to handle concurrent, asynchrnous sources of data (that require debouncing, merging strategy, consistent error handling, etc) 
* traditional imperative async java code using callbacks
* Rx streams
* arrow library (category-theory inspired approach) 
