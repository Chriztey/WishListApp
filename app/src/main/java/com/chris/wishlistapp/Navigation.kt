package com.chris.wishlistapp

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable

fun Navigation(
    viewModel: WishViewModel = viewModel(),
    navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route,
        builder =
        {
            composable(Screen.HomeScreen.route) {
                HomeView(
                    navController = navController,
                    viewModel = viewModel
                ) }

            composable(Screen.AddScreen.route) {
                AddEditDetailView(id = 0L, viewModel = viewModel, navController = navController )}
        }
    )

}