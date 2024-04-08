package com.chris.wishlistapp

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun HomeView(){

    val context = LocalContext.current

    Scaffold (
        topBar = { AppBarView(
            title = "Wishlist",
            { Toast.makeText(context,
                "Button Clicked",
                Toast.LENGTH_LONG).show() }
        ) }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(it),
            content = {}
        )
    }

}