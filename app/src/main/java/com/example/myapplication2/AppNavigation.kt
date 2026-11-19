package com.example.myapplication2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable
// Ruta simple sin argumentos
@Serializable
object Home
// Ruta con argumentos tipados
@Serializable
data class Profile(
    val userId: String,
    val userName: String
)

@Serializable
object Settings

@Composable
fun MyAppNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home) {
        composable<Home> {
            HomeScreen(
                onUserClick = { userId, userName ->
                    navController.navigate(
                        Profile(
                            userId,
                            userName
                        )
                    )
                },
                onSettingsClick = { navController.navigate(Settings) }
            )
        }
        composable<Profile> { backStackEntry ->
            val arg = backStackEntry.toRoute<Profile>()
            ProfileScreen(
                arg.userId,
                arg.userName,
                onNavigateBack = { navController.popBackStack() },
                onSettingsClick = { navController.navigate(Settings) })
        }

        composable<Settings> {
            SettingsScreen(
                onNavigateBack = { navController.popBackStack() },
                onGoingBackHome = { navController.navigate(Home) })
        }
    }
}