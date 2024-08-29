package gt.edu.uvg.lab6_plataformasmoviles

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun Splash(color: Color, drawableId: Int, text: String, modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize(), color = color) {
        Row (verticalAlignment = Alignment.CenterVertically){
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(drawableId), contentDescription = null)
                Text(text = text)
            }
        }
    }
}