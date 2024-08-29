package gt.edu.uvg.lab6_plataformasmoviles.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import gt.edu.uvg.lab6_plataformasmoviles.components.splashComponents.SurfaceWithImage

@Composable
fun Splash(color: Color, logoId: Int, backgroundImage: Int, text: String, modifier: Modifier = Modifier) {
    SurfaceWithImage(color = color, backgroundImage =backgroundImage, modifier = Modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(logoId), contentDescription = null)
                Spacer(modifier = Modifier.height(25.dp))
                Text(
                    text = text,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 55.sp,
                    color = Color.White
                )
            }
        }
    }
}