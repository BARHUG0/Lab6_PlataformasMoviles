package gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import gt.edu.uvg.lab6_plataformasmoviles.R
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlin.math.roundToInt
import kotlin.math.abs

@Composable
fun FoodPreviewImage(modifier: Modifier = Modifier, foodImages: List<Int>) {
    val listState = rememberLazyListState(initialFirstVisibleItemIndex = Int.MAX_VALUE / 2)
    var centerIndex by remember { mutableStateOf(Int.MAX_VALUE / 2) }

    LaunchedEffect(listState.firstVisibleItemScrollOffset) {
        centerIndex = listState.firstVisibleItemIndex
    }

    LazyRow(
        contentPadding = PaddingValues(horizontal = 100.dp),
        state = listState,
        modifier = Modifier
    ) {
        items(Int.MAX_VALUE) { index ->
            val realIndex = (index % foodImages.size + foodImages.size) % foodImages.size
            val image = foodImages[realIndex]

            // Calcular la escala basada en la distancia desde el centro
            val scale = if (index == centerIndex) 1.2f else 1f

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .size(width = 250.dp * scale, height = 200.dp * scale)
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
    FoodPreviewImage(modifier = Modifier.fillMaxSize(), foodImages = foodImage)
}
