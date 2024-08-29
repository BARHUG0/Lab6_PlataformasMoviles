package gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import gt.edu.uvg.lab6_plataformasmoviles.R

@Preview(showBackground = true)
@Composable
fun foodTypeSelection() {
    Row(
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Appetizers", fontFamily = FontFamily.Serif)
        Text(text = "Entrees", fontFamily = FontFamily.Serif)
        Text(text = "Dessert", fontFamily = FontFamily.Serif)
    }
}

private val foodTypeStrings = listOf(
    R.string.appetizers_string,
    R.string.entrees_string,
    R.string.dessert_string
)