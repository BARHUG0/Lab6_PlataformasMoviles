package gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import gt.edu.uvg.lab6_plataformasmoviles.R

@Composable
fun FoodPreviewImage(modifier: Modifier = Modifier, foodImages: List<Int>) {
    LazyRow(modifier = Modifier) {
        items(Int.MAX_VALUE) { index ->
            val image = foodImages[index % foodImages.size]
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .size(width = 250.dp, height = 200.dp)
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = modifier.fillMaxSize()
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFoodPreviewImage() {
    val foodImage = listOf(
        R.drawable.meat,
        R.drawable.entreelasagna,
        R.drawable.entreepho
    )
    FoodPreviewImage(modifier = Modifier.fillMaxWidth(), foodImages = foodImage)
}