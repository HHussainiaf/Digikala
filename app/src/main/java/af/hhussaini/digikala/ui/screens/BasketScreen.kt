package af.hhussaini.digikala.ui.screens

import af.hhussaini.digikala.ui.theme.selectedBottomBar
import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun BasketScreen(navController: NavHostController) {

    if (isSystemInDarkTheme()) {
        BasketDark()
    } else {
        BasketLight()
    }

}

@Composable
fun BasketLight() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Basket Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )
    }
}

@Composable
fun BasketDark() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Basket Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )
    }
}

@Composable
@Preview
fun BasketLightPreview() {
    BasketLight()
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun BasketDarkPreview() {
    BasketDark()
}