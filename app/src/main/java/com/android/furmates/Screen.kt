package com.android.furmates

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object PetProfile : Screen("pet_profile")
    object Browse : Screen("browse")
    object Matches : Screen("matches")
    object Chat : Screen("chat/{chatId}") {
        fun createRoute(chatId: String) = "chat/$chatId"
    }
}