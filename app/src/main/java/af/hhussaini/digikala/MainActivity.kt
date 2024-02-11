package af.hhussaini.digikala

import af.hhussaini.digikala.navigation.BottomNavigationBar
import af.hhussaini.digikala.navigation.SetupNavGraph
import af.hhussaini.digikala.ui.components.AppConfig
import af.hhussaini.digikala.ui.components.ChangeStatusBarColor
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import af.hhussaini.digikala.ui.theme.DigikalaTheme
import af.hhussaini.digikala.util.Constance.ENGLISH_LANG
import af.hhussaini.digikala.util.Constance.PERSIAN_LANG
import af.hhussaini.digikala.util.Constance.USER_LANGUAGE
import af.hhussaini.digikala.util.LocaleUtils
import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DigikalaTheme {
                navController = rememberNavController()
                ChangeStatusBarColor(navController = navController)

                AppConfig()
                Log.e("110", USER_LANGUAGE)

                LocaleUtils.setLocale(LocalContext.current, USER_LANGUAGE)

                val direction = if (USER_LANGUAGE == ENGLISH_LANG) {
                    androidx.compose.ui.unit.LayoutDirection.Ltr
                } else {
                    androidx.compose.ui.unit.LayoutDirection.Rtl
                }

                CompositionLocalProvider(
                    LocalLayoutDirection provides direction
                ) {

                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                navController = navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                })
                        }
                    ) {
                        SetupNavGraph(navController = navController)
                    }

                }


            }
        }
    }
}
