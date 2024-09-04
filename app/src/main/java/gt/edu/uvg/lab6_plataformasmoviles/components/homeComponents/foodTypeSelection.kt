package gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import gt.edu.uvg.lab6_plataformasmoviles.R

@Composable
fun foodTypeSelection(modifier: Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        foodTypeStrings.forEach{foodType ->
            Text(text = stringResource(id = foodType),
                style = TextStyle(fontFamily = FontFamily.Serif),
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

private val foodTypeStrings = listOf(
    R.string.appetizers_string,
    R.string.entrees_string,
    R.string.dessert_string
)