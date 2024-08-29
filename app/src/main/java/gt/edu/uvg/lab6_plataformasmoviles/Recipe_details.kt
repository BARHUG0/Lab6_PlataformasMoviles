package gt.edu.uvg.lab6_plataformasmoviles

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Check
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


data class Recipe(
    val title: String,
    val description: String,
    val ingredients: List<String>,
    val steps: List<String>,
    val imagen: Int,
    val rating : Int,
)

val pollo = Recipe(
    title= "Pollo al Limón con Papas Asadas",
    description="""Un plato clásico y refrescante, perfecto para cualquier ocasión. " +
            El pollo se marina en limón y hierbas, mientras que las papas se asan hasta quedar doradas y crujientes.""",
    ingredients= listOf(
        "4 piezas de pollo",
        "4 papas grandes",
        "1 limón",
        "2 cucharadas de aceite de oliva",
        "2 dientes de ajo",
        "1 cucharadita de orégano seco",
        "Sal",
        "Pimienta",
        "1/2 taza de caldo de pollo"
    ),
    steps= listOf(
        "Precalienta el horno a 200°C.",
        "En un bol, mezcla el pollo con el jugo de limón, ralladura de limón, aceite de oliva, ajo, orégano, sal y pimienta.",
        "Coloca las papas en una bandeja para hornear y rocía con aceite de oliva, sal y pimienta.",
        "Coloca el pollo marinado sobre las papas.",
        "Vierte el caldo de pollo en la bandeja.",
        "Hornea durante 30-35 minutos o hasta que el pollo esté cocido y las papas estén doradas."
    ),
    imagen = ,
    rating= ,


)

val pasta = Recipe(
    title= "Pasta con Pesto y Tomates Cherry",
    description="Un plato rápido y fácil de preparar, con los sabores frescos del pesto y los tomates cherry.",
    ingredients= listOf(
        "300 gramos de pasta",
        "1/2 taza de pesto",
        "250 gramos de tomates cherry",
        "1/4 taza de queso parmesano rallado",
        "Hojas de albahaca fresca"
    ),
    steps= listOf(
        "Cocina la pasta según las instrucciones del paquete.",
        "Mientras se cocina la pasta, calienta una sartén a fuego medio y agrega los tomates cherry.",
        "Cocina los tomates hasta que estén ligeramente ablandados.",
        "Escurre la pasta y agrégala a la sartén con los tomates.",
        "Vierte el pesto sobre la pasta y los tomates y mezcla bien.",
        "Sirve inmediatamente, espolvoreando con queso parmesano rallado y decorando con hojas de albahaca fresca."
    ),
    //Añadir los drawables
    imagen = ,
    rating= ,

    )
val tostadas = Recipe(
    title= "Tostadas Francesas con Frutas Frescas",
    description="Un desayuno o brunch delicioso y nutritivo, perfecto para los fines de semana.",
    ingredients=listOf(
        "4 rebanadas de pan de molde",
        "2 huevos",
        "1/2 taza de leche",
        "1 cucharadita de extracto de vainilla",
        "1 cucharada de mantequilla",
        "Frutas frescas"
    ),
    steps= listOf(
        "En un plato hondo, bate los huevos, la leche y el extracto de vainilla.",
        "Calienta una sartén a fuego medio y derrite la mantequilla.",
        "Sumerge cada rebanada de pan en la mezcla de huevo y leche.",
        "Cocina las tostadas francesas en la sartén hasta que estén doradas por ambos lados.",
        "Sirve las tostadas francesas con las frutas frescas y rocía con miel o jarabe de maple."
    ),
    //Añadir los drawables
    imagen = ,
    rating= ,

    )
val ensalada = Recipe(
    title= "Ensalada de Quinoa con Vegetales",
    description="Una ensalada ligera y nutritiva, perfecta para una comida saludable.",
    ingredients= listOf(
        "1 taza de quinoa",
        "1 pepino",
        "1/2 taza de maíz dulce",
        "1/4 taza de cebolla roja",
        "1/4 taza de cilantro fresco",
        "Jugo de 1 limón",
        "2 cucharadas de aceite de oliva",
        "Sal",
        "Pimienta"
    ),
    steps= listOf(
        "Cocina la quinoa según las instrucciones del paquete.",
        "En un bol grande, combina la quinoa cocida con el pepino, el maíz, la cebolla roja y el cilantro.",
        "En un frasco pequeño, mezcla el jugo de limón, el aceite de oliva, sal y pimienta.",
        "Vierte el aderezo sobre la ensalada y mezcla bien."
    ),
    //Añadir los drawables
    imagen = ,
    rating= ,

    )
val tacos = Recipe(
    title= "Tacos de Pescado al Pastor",
    description=" Un clásico mexicano con un toque fresco. El pescado se marina en una mezcla de especias y se sirve en tortillas de maíz con piña y cebolla.",
    ingredients= listOf(
        "500 gramos de filetes de pescado blanco",
        "1/2 taza de jugo de naranja",
        "1/4 taza de vinagre de manzana",
        "2 cucharadas de achiote en pasta",
        "1 cebolla",
        "2 dientes de ajo",
        "1/2 taza de piña en cubos",
        "Tortillas de maíz",
        "Cebolla morada",
        "Cilantro fresco",
        "Limones"
    ),
    steps= listOf(
        "En un bol, mezcla el pescado con el jugo de naranja, vinagre, achiote, cebolla y ajo.",
        "Marina durante al menos 30 minutos.",
        "Calienta una parrilla o sartén y cocina el pescado hasta que esté dorado y cocido.",
        "Calienta las tortillas de maíz.",
        "Sirve el pescado en las tortillas con piña, cebolla morada, cilantro y limón."
    ),
    //Añadir los drawables
    imagen = ,
    rating= ,

    )

val sopa = Recipe(
    title= "Sopa de Lentejas",
    description=" Una sopa reconfortante y nutritiva, perfecta para los días fríos.",
    ingredients= listOf(
        "1 taza de lentejas secas",
        "1 cebolla",
        "2 zanahorias",
        "2 tallos de apio",
        "4 tazas de caldo de verduras",
        "2 hojas de laurel",
        "Sal",
        "Pimienta"
    ),
    steps= listOf(
        "Enjuaga las lentejas y colócalas en una olla.",
        "Agrega la cebolla, zanahoria, apio, caldo de verduras y hojas de laurel.",
        "Lleva a ebullición, luego reduce el fuego y cocina a fuego lento durante 30-40 minutos o hasta que las lentejas estén tiernas.",
        "Retira las hojas de laurel y sazona con sal y pimienta al gusto.",
        "Sirve caliente con pan tostado."
    ),
    //Añadir los drawables
    imagen = ,
    rating= ,

    )

@Composable
fun RecipeDetailScreen(recipe: Recipe) {
    Scaffold {
        Column {
            // Imagen principal
            Image(
                painter = painterResource(recipe.imagen),
                contentDescription = recipe.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )
            Image(
                painter = painterResource(recipe.rating), // Ejemplo de otra imagen
                contentDescription = "Estrella de valoración",
                modifier = Modifier
                    .height(200.dp)
                    .size(50.dp)
            )

            // Título y calificación
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = recipe.title,
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.weight(1f))

            }

            // Descripción
            Text(
                text = recipe.description,
                modifier = Modifier.padding(16.dp)
            )

            // Botones de acción
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                IconButton(onClick = { /* Marcar como favorito */ }) {
                    Icon(Icons.Default.Favorite, contentDescription = "Favorite")
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { /* Mostrar lista de compras */ }) {
                    Icon(Icons.Default.ShoppingCart, contentDescription = "Shopping Cart")
                }
            }

            // Lista de ingredientes
            Text(
                text = "Ingredientes:",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(16.dp)
            )
            LazyColumn {
                items(recipe.ingredients) { ingredient ->
                    Text(text = ingredient, modifier = Modifier.padding(16.dp))
                }
            }

            // Preparación
            Text(
                text = "Preparación:",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(16.dp)
            )
            PreparationSection(steps = recipe.steps)



        }
    }
}

@Composable
fun PreparationSection(steps: List<String>) {
    LazyColumn {
        itemsIndexed(steps) { index, step ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Icon(Icons.Default.Check, contentDescription = "Step completed")
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Step ${index + 1}: $step")
            }
        }
    }
}

