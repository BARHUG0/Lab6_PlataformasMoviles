package gt.edu.uvg.lab6_plataformasmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import gt.edu.uvg.lab6_plataformasmoviles.components.splashComponents.SurfaceWithImage
import gt.edu.uvg.lab6_plataformasmoviles.screens.Splash
import gt.edu.uvg.lab6_plataformasmoviles.ui.theme.Lab6_PlataformasMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab6_PlataformasMovilesTheme {

            }
        }
    }
}

@Preview
@Composable
private fun SplashPreview() {
    Splash(color = Color(0xFFEB5757), logoId = R.drawable.chef_hat, backgroundImage = R.drawable.pizza, text = "Chef Recipes")
}

@Preview
@Composable
private fun SurfaceWithImagePreview() {
    SurfaceWithImage(color = Color(0xFFEB5757), backgroundImage = R.drawable.pizza) {
        
    }
}