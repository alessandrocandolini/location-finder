# location-finder

Sample application to display on the fly a list of matching addresses from geolocation updates and/or manual inputs.

The app relies on the google api endpoint.

The project is used for a comparison of different approaches to handle concurrent, asynchrnous sources of data (that require debouncing, merging strategy, consistent error handling, etc) 
* traditional imperative async java code using callbacks and finite state machines
* java 7 concurrency primitives (ie, futures yes but java 8 completable futures no)
* Rx reactive streams
* Kotlin coroutines 
* arrow library (category-theory inspired approach) 
* Other? (Actor model, etc)

The comparison is aimed at highlighting the fact that these models of concurrency operate at a quite different level of abstraction. 



