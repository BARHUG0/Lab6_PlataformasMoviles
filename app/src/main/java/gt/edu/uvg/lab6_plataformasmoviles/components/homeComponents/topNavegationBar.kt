package gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import gt.edu.uvg.lab6_plataformasmoviles.R

@Composable
fun topNavegationBar(modifier: Modifier){
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Icon(
            Icons.Filled.Menu,
            contentDescription = stringResource(id = R.string.menu_icon),
            tint = Color.Red
        )

        Text(text = "Popular Recipies", color = Color.Red)


        Icon(
            Icons.Filled.Search,
            contentDescription = stringResource(id = R.string.menu_icon),
            tint = Color.Red
        )

    }
}