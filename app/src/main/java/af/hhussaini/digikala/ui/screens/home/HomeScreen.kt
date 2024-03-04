package af.hhussaini.digikala.ui.screens.home

import af.hhussaini.digikala.ui.theme.selectedBottomBar
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
fun HomeScreen(navController: NavHostController){
    if (isSystemInDarkTheme()) {
        HomeDark()
    } else {
        HomeLight()
    }

}

@Composable
fun HomeLight() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )
    }
}

@Composable
fun HomeDark() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )
    }
}

@Composable
@Preview
fun HomeLightPreview() {
    HomeLight()
}

@Composable
@Preview
fun HomeDarkPreview() {
    HomeDark()
}