package af.hhussaini.digikala.ui.screens

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
import java.util.Locale.Category

@Composable
fun CategoryScreen(navController: NavHostController) {
    if (isSystemInDarkTheme()) {
        CategoryDark()
    } else {
        CategoryLight()
    }

}

@Composable
fun CategoryLight() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Category Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )
    }
}

@Composable
fun CategoryDark() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Category Screen",
            color = MaterialTheme.colors.selectedBottomBar
        )
    }
}

@Composable
@Preview
fun CategoryLightPreview() {
    CategoryLight()
}

@Composable
@Preview
fun CategoryDarkPreview() {
    CategoryDark()
}