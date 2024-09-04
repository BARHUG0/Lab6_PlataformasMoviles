package gt.edu.uvg.lab6_plataformasmoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import gt.edu.uvg.lab6_plataformasmoviles.components.splashComponents.SurfaceWithImage
import gt.edu.uvg.lab6_plataformasmoviles.screens.Home
import gt.edu.uvg.lab6_plataformasmoviles.screens.Splash
import gt.edu.uvg.lab6_plataformasmoviles.ui.theme.Lab6_PlataformasMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab6_PlataformasMovilesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "splashScreen") {
                        composable(route = "splashScreen"){
                            Splash(
                                color = Color(0xFFEB5757),
                                logoId = R.drawable.chef_hat,
                                backgroundImage = R.drawable.pizza,
                                text = "Chef Recipes"
                            ){
                                navController.navigate("homeScreen"){
                                    popUpTo("splashScreen") {inclusive = true}
                                }
                            }
                        }
                        composable(route = "homeScreen"){
                            Home(
                                modifier = Modifier,
                                onButtonClick = {
                                    navController.navigate("recipieDetailScreen")
                                }
                            )
                        }
                        composable(route = "recipieDetailScreen"){
                            RecipeDetailScreen(recipe = pasta)
                        }

                    }

                }
            }
        }
    }
}




//PREVIEWSS

@Preview
@Composable
private fun SplashPreview() {
    Splash(color = Color(0xFFEB5757), logoId = R.drawable.chef_hat, backgroundImage = R.drawable.pizza, text = "Chef Recipes", onButtonClick = {})
}

@Preview
@Composable
private fun RecipesPreview(){
    RecipeDetailScreen(recipe = pasta)
}


@Preview(showBackground = true)
@Composable
fun previewHome() {
    Home(modifier = Modifier, onButtonClick = {})
}

val dishName = "POLLITO ASADO"
val textTest = "Un plato clásico y refrescante, perfecto para cualquier ocasión. El pollo se marina en limón y hierbas, mientras que las papas se asan hasta quedar doradas y crujientes."


private val foodImage = listOf(
    R.drawable.meat,
    R.drawable.entreelasagna,
    R.drawable.entreepho
)
