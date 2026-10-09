package com.example.prak_5_app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak_5_app.ui.screen.AboutScreen
import com.example.prak_5_app.ui.screen.DetailScreen
import com.example.prak_5_app.ui.screen.HomeScreen
import com.example.prak_5_app.ui.screen.ProfileScreen

@Composable
fun NavigationLabApp() {
    val navController = rememberNavController()

    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Routes.HOME,
            modifier = Modifier.padding(contentPadding)
        ) {
            composable(Routes.HOME) {
                HomeScreen(
                    onOpenDetail = { studentId ->
                        navController.navigate(Routes.detail(studentId))
                    },
                    onOpenProfile = {
                        navController.navigate(Routes.PROFILE)
                    },
                    onOpenAbout = {
                        navController.navigate(Routes.ABOUT)
                    }
                )
            }

            composable(
                route = Routes.DETAIL,
                arguments = listOf(
                    navArgument("studentId") {
                        type = NavType.IntType
                    }
                )
            ) { backStackEntry ->
                val studentId = backStackEntry.arguments?.getInt("studentId") ?: 0
                DetailScreen(
                    studentId = studentId,
                    onBack = { navController.popBackStack() }
                )
            }

            composable(Routes.PROFILE) {
                ProfileScreen(onBack = { navController.popBackStack() })
            }

            composable(Routes.ABOUT) {
                AboutScreen(onBack = { navController.popBackStack() })
            }
        }
    }
}


