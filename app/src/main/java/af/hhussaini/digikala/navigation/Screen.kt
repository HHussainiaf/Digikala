package af.hhussaini.digikala.navigation

sealed class Screen(val route: String) {

    object Splash: Screen("splash_screen")
    object Basket: Screen("basket_screen")
    object Category: Screen("category_screen")
    object Home: Screen("home_screen")
    object Profile: Screen("profile_screen")

}