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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import gt.edu.uvg.lab6_plataformasmoviles.R

@Preview(showBackground = true)
@Composable
fun topNavegationBar(){
    Row (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Icon(
            Icons.Filled.Menu,
            contentDescription = stringResource(id = R.string.menu_icon)
        )

        Text(text = "Popular Recipies")

        Icon(
            Icons.Filled.Search,
            contentDescription = stringResource(id = R.string.menu_icon)
        )

    }
}