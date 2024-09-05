package gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import gt.edu.uvg.lab6_plataformasmoviles.R

@Composable
fun DrawerContent(modifier: Modifier = Modifier) {
    Column (
        Modifier
            .background(Color(0xFFEB5757))
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Popular Recipes",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.White)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Saved Recipes",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.White)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Shopping List",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.White)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Settings",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.White)
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(R.drawable.chef_hat), contentDescription = null)
        Spacer(modifier = Modifier.height(80.dp))
        Image(Icons.Filled.AccountBox, contentDescription = null, modifier.size(75.dp) )
        Text(text = "Harry Trauman",
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = Color.White)

    }

}

@Preview
@Composable
private fun DrawerContentPreview() {
    DrawerContent()
}