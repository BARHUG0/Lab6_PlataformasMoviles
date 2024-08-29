package gt.edu.uvg.lab6_plataformasmoviles

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Splash(color: Color, logoId: Int, backgroundImage: Int, text: String, modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize(), color = color) {
        Image(painter = painterResource(id = backgroundImage), contentDescription = null, alpha = 0.1f)
        Row (verticalAlignment = Alignment.CenterVertically){
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(logoId), contentDescription = null)
                Spacer(modifier = Modifier.height(25.dp))
                Text(text = text, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.SemiBold, fontSize = 55.sp, color = Color.White)
            }
        }
    }
}