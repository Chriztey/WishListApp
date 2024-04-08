package com.chris.wishlistapp

import android.media.MediaRouter

sealed class Screen (val route: String) {
    object HomeScreen : Screen("home_screen")
    object AddScreen: Screen("add_screen")
}