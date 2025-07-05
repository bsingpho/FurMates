package com.android.furmates

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.android.furmates.ui.login.LoginScreen
import com.android.furmates.ui.signuppage.SignUpScreen

@Composable
fun MainNavGraph(navController: NavHostController = rememberNavController(),
                 padding: PaddingValues) {
    NavHost(navController = navController,
        startDestination = Screen.Login.route,
        modifier = Modifier.padding(padding)) {

        composable(Screen.Login.route) {
            LoginScreen(onLoginSuccess = {
                navController.navigate(Screen.Browse.route)
            },
                onSignUp = {
                    navController.navigate(Screen.SignUp.route)
                })
        }

        composable(Screen.SignUp.route) {
            SignUpScreen(onSignUpSuccess = {
                navController.navigate(Screen.Login.route)}
            , onLoginClick = {
                    navController.navigate(Screen.Login.route)
                })
        }

        composable(Screen.PetProfile.route) {
//            PetProfileScreen(onProfileComplete = {
//                navController.navigate(Screen.Browse.route)
//            })
        }

        composable(Screen.Browse.route) {
//            BrowseScreen(
//                onMatchClick = { navController.navigate(Screen.Matches.route) },
//                onChatClick = { chatId ->
//                    navController.navigate(Screen.Chat.createRoute(chatId))
//                }
//            )
        }

        composable(Screen.Matches.route) {
//            MatchesScreen(
//                onChatClick = { chatId ->
//                    navController.navigate(Screen.Chat.createRoute(chatId))
//                }
//            )
        }

        composable(
            route = Screen.Chat.route,
            arguments = listOf(navArgument("chatId") { type = NavType.StringType })
        ) { backStackEntry ->
            val chatId = backStackEntry.arguments?.getString("chatId")
//            ChatScreen(chatId = chatId.orEmpty())
        }
    }
}