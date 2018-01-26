package com.example.austin.democracynow

/**
 * Created by Austin on 1/19/2018.
 * This is used to store user information that will be checked against the api to find relevant information
 */
//This is the easiest object I have ever created
//In order to use the google api we need at least a state and we will get state and national elections but not local, in order to get local elections you can enter in all the information
data class User (val streetAddress: String? = null, val streetAddress2: String? = null, val city: String? = null, val state: String? = null, val zip: String? = null)