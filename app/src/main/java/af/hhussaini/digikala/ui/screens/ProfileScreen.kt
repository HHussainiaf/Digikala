package af.hhussaini.digikala.ui.screens

import af.hhussaini.digikala.MainActivity
import af.hhussaini.digikala.ui.theme.selectedBottomBar
import af.hhussaini.digikala.ui.theme.unSelectedBottomBar
import af.hhussaini.digikala.util.Constance.ENGLISH_LANG
import af.hhussaini.digikala.util.Constance.PERSIAN_LANG
import af.hhussaini.digikala.viewmodel.DataStoreViewModel
import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun ProfileScreen(
    navController: NavHostController,
    dataStore: DataStoreViewModel = hiltViewModel()
) {
    if (isSystemInDarkTheme()) {
        ProfileDark()
    } else {
        ProfileLight()
    }
}

@Composable
fun ProfileLight(
    dataStore: DataStoreViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        val activity = LocalContext.current as Activity

        Text(
            text = "Profile Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )

        Button(
            onClick = {
                dataStore.saveUserLanguage(PERSIAN_LANG)
                activity.apply {
                    finish()
                    startActivity(Intent(activity, MainActivity::class.java))
                }
            }
        ) {
            Text(text = "fa")
        }

        Button(
            onClick = {
                dataStore.saveUserLanguage(ENGLISH_LANG)
                activity.apply {
                    finish()
                    startActivity(Intent(activity, MainActivity::class.java))
                }
            }
        ) {
            Text(text = "en")
        }
    }
}

@Composable
fun ProfileDark(
    dataStore: DataStoreViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        val activity = LocalContext.current as Activity

        Text(
            text = "Profile Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )

        Button(
            onClick = {
                dataStore.saveUserLanguage(PERSIAN_LANG)
                activity.apply {
                    finish()
                    startActivity(Intent(activity, MainActivity::class.java))
                }
            }
        ) {
            Text(text = "fa")
        }

        Button(
            onClick = {
                dataStore.saveUserLanguage(ENGLISH_LANG)
                activity.apply {
                    finish()
                    startActivity(Intent(activity, MainActivity::class.java))
                }
            }
        ) {
            Text(text = "en")
        }
    }
}

@Composable
@Preview
fun ProfileLightPreview() {

}

@Composable
@Preview
fun ProfileDarkPreview() {

}