# location-finder

Sample application to display on the fly a list of matching addresses from geolocation updates and/or manual inputs.

The app relies on the google geodicing api endpoint.

The project is used for a comparison of different approaches to handle concurrent, asynchrnous sources of data (that require synchronisation, merging strategy, debouncing, timeout, consistent error handling, etc) 
* java 7 concurrency primitives 
* Rx reactive streams
* Kotlin coroutines and CSP
* arrow library (category-theory inspired approach) 
* Other? (Actor model, etc)

The comparison is aimed at highlighting the fact that these models of concurrency __operate at a quite different level of abstraction__. 



