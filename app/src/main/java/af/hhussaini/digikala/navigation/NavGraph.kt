package af.hhussaini.digikala.navigation

import af.hhussaini.digikala.ui.screens.BasketScreen
import af.hhussaini.digikala.ui.screens.CategoryScreen
import af.hhussaini.digikala.ui.screens.home.HomeScreen
import af.hhussaini.digikala.ui.screens.ProfileScreen
import af.hhussaini.digikala.ui.screens.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        composable(Screen.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }

        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(Screen.Category.route) {
            CategoryScreen(navController = navController)
        }

        composable(Screen.Basket.route) {
            BasketScreen(navController = navController)
        }
    }
}