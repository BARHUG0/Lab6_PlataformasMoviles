package gt.edu.uvg.lab6_plataformasmoviles.screens

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
        Spacer(modifier = Modifier.height(5.dp))
        topNavegationBar(modifier = modifier)
        Spacer(modifier = Modifier.height(35.dp))
        foodTypeSelection(modifier = Modifier.width(16.dp))
        FoodPreviewImage( modifier = Modifier.fillMaxWidth(), foodImages = foodImage)
        foodPreviewInformation(duration = 3, likes = 500, comments = 22, starNum= 4, title = dishName, description= textTest, modifier = modifier)
    }
}
val dishName = "POLLITO ASADO"
val textTest = "Un plato clásico y refrescante, perfecto para cualquier ocasión. El pollo se marina en limón y hierbas, mientras que las papas se asan hasta quedar doradas y crujientes."


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