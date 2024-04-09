package com.chris.wishlistapp

import android.content.Context
import androidx.room.Room
import com.chris.wishlistapp.data.WishDao
import com.chris.wishlistapp.data.WishDatabase
import com.chris.wishlistapp.data.WishRepository

// Example of Dependencies Injection, only on "Graph" thru out entire application,
// Preparing what is necessary to run your application
object Graph {

    lateinit var database: WishDatabase

    //Lazy here means that code will only get executed when it's needed
    // (when u actually what to access it). This will init only once

    val wishRepository by lazy{
        WishRepository(wishDao = database.wishDao()
        )
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(
            context = context,
            klass = WishDatabase::class.java,
            "wishlist.db" ).build()
    }

}