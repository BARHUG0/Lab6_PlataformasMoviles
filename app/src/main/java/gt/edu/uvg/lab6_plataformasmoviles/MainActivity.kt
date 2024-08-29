package gt.edu.uvg.lab6_plataformasmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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