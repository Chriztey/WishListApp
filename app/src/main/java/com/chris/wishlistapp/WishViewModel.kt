package com.chris.wishlistapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WishViewModel: ViewModel() {

    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun wishTitleChanges(newString: String) {
        wishTitleState = newString
    }

    fun wishDescriptionChanges(newString: String) {
        wishDescriptionState = newString
    }
}