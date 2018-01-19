package com.example.austin.democracynow

/**
 * Created by Austin on 1/19/2018.
 * This is used to store user information that will be checked against the api to find relevant information
 */
//This is the easiest object I have ever created
data class User (val streetAddress: String, val streetAddress2: String? = null, val city: String, val state: String, val zip: String)