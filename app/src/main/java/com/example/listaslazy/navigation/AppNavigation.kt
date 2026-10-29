package com.example.listaslazy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.listaslazy.view.screen.GameDetailScreen
import com.example.listaslazy.view.screen.GameScreen
import com.example.listaslazy.viewModel.GameViewModel

@Composable
fun AppNavigation(gameViewModel: GameViewModel, modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.GAMES
    ){
        composable(
            route = Routes.GAMES
        ) {
            GameScreen(
                modifier = modifier,
                gameViewModel = gameViewModel,
                onGameClick = { gameId ->
                    navController.navigate(
                            "${Routes.GAME_DETAILS}/$gameId"
                        )
                }
            )
        }

        composable(
            route = "${Routes.GAME_DETAILS}/{gameId}",
            arguments = listOf(
                navArgument("gameId") {
                    type = NavType.LongType
                }
            )
        ) { backStackEntry ->

            val gameId =
                backStackEntry.arguments
                    ?.getLong("gameId")

            GameDetailScreen(
                modifier = modifier,
                gameId = gameId,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}