package com.example.thefarmersdairy.presentation.theme.util

sealed class Screen(val route: String) {
    object splashScreen : Screen("splash_screeen")
    object LoginScreen :
        Screen("login_screen")   // for passing a parameter make it data classs not an object

    object RegisterScreen : Screen("Register_Screen")
    object FeedScreen : Screen("Feed_Screen")
    object DairyProductscreeen : Screen("dairyProduct_Screen")
    object MilkScrn : Screen("Milk_Screen")
    object CowBuffaloMilkScrn : Screen("CowBuffalo_Screen")
    object CowMilkScrn : Screen("Cow_milk_Screen")
    object BuffalowMilkScrn : Screen("Buffalo_Milk")
    object CowMilkGhee : Screen("Cow_milk_Ghee")
    object BullalowMilkGhee : Screen("buffalo_Milk_ghee")
    object CowBuffalowGhee : Screen("Cow_buffalo_Milk_Ghee")
    object Khoya : Screen("Khoya")
    object DahiScreeen : Screen("Dahi_scrn")
    object Lassi : Screen("Lassi")
    object panner : Screen("Panner")
    object frmingScrn : Screen("frming_scrn")
    object Atta : Screen("atta")
    object rice : Screen("rice")
    object Mustardoil : Screen("Mustard_Oli")
    object Masale : Screen("masale")
    object Searchscrn : Screen("Searchscrn")
}