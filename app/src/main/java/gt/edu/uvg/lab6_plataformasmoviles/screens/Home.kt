package gt.edu.uvg.lab6_plataformasmoviles.screens

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import gt.edu.uvg.lab6_plataformasmoviles.R
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.DrawerContent
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.foodPreviewInformation
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.FoodPreviewImage
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.foodTypeSelection
import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents.topNavegationBar
import kotlinx.coroutines.launch

// import gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    modifier: Modifier,
    onButtonClick: () -> Unit
){

    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    ModalNavigationDrawer(
        drawerContent = {

            ModalDrawerSheet {
                DrawerContent()
            }
        },
        drawerState = drawerState) {
        Column(
            modifier = Modifier.fillMaxSize()
        ){
            Spacer(
                modifier = Modifier.height(40.dp)
            )
            topNavegationBar(
                modifier = modifier,
                onClickedDrawer = {scope.launch { drawerState.open() }}
            )
            Spacer(
                modifier = Modifier.height(35.dp)
            )
            foodTypeSelection(
                modifier = Modifier.width(16.dp)
            )
            FoodPreviewImage(
                modifier = Modifier.fillMaxWidth(),
                foodImages = foodImage,
                onImageClick = {
                    onButtonClick()
                }
            )
            foodPreviewInformation(
                duration = 3,
                likes = 500,
                comments = 22,
                starNum= 4,
                title = dishName,
                description= textTest,
                modifier = modifier
            )
        }
    }

}
val dishName = "POLLITO ASADO"
val textTest = "Un plato clásico y refrescante, perfecto para cualquier ocasión. El pollo se marina en limón y hierbas, mientras que las papas se asan hasta quedar doradas y crujientes."


@Preview(showBackground = true)
@Composable
fun previewHome() {
    Home(modifier = Modifier, onButtonClick = {})
}



private val foodImage = listOf(
    R.drawable.meat,
    R.drawable.entreelasagna,
    R.drawable.entreepho
)