package com.chris.wishlistapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chris.wishlistapp.data.Wish
import com.chris.wishlistapp.data.WishRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch


class WishViewModel(
    private val wishRepository: WishRepository
): ViewModel() {

    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun wishTitleChanges(newString: String) {
        wishTitleState = newString
    }

    fun wishDescriptionChanges(newString: String) {
        wishDescriptionState = newString
    }

    // using lateinit means that it will set "something" up before we need it, example when using
    // flow or coroutines

    lateinit var getAllWishes: Flow<List<Wish>>

    init {
        viewModelScope.launch {
            getAllWishes = wishRepository.getWishes()
        }
    }


    // Using Dispatcher to optimize, IO stands for Input-Output
    // Efficient managing the threads
    fun addWish(wish: Wish) {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.addWish(wish)
        }
    }

    fun getAWishById(id: Long) : Flow<Wish> {
        return wishRepository.getAWishById(id)
    }
    fun updateWish(wish: Wish) {
        viewModelScope.launch (Dispatchers.IO) {
            wishRepository.updateWish(wish)
        }
    }

    fun deleteWish(wish: Wish) {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.deleteWish(wish)
        }
    }
}