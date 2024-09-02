package gt.edu.uvg.lab6_plataformasmoviles.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import gt.edu.uvg.lab6_plataformasmoviles.R
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.foodPreviewInformation
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.FoodPreviewImage
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.foodTypeSelection
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.topNavegationBar

// import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents


@Composable
fun Home(modifier: Modifier){
    Column {
        topNavegationBar(modifier = modifier)
        foodTypeSelection(modifier = modifier)
        FoodPreviewImage( modifier = Modifier.fillMaxWidth(), foodImages = foodImage)
        foodPreviewInformation(modifier = modifier)
    }
}


@Preview(showBackground = true)
@Composable
fun previewHome() {
    Home(modifier = Modifier)
}



private val foodImage = listOf(
    R.drawable.meat,
    R.drawable.entreelasagna,
    R.drawable.entreepho
)