package gt.edu.uvg.lab6_plataformasmoviles.components.homeComponents

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import gt.edu.uvg.lab6_plataformasmoviles.R
import gt.edu.uvg.lab6_plataformasmoviles.screens.dishName
import gt.edu.uvg.lab6_plataformasmoviles.screens.textTest
import gt.edu.uvg.lab6_plataformasmoviles.ui.theme.AppColor
import gt.edu.uvg.lab6_plataformasmoviles.ui.theme.StarColor
import gt.edu.uvg.lab6_plataformasmoviles.ui.theme.DishTitleColor

@Composable
fun foodPreviewInformation(duration: Int, likes: Int, comments: Int, starNum: Int, title: String, description: String, modifier: Modifier){
    Column(
        modifier = Modifier
            .padding(start = 25.dp, end = 25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Row(modifier = Modifier){
            for (i in 1..starNum) {
                Icon(
                    Icons.Filled.Star,
                    contentDescription = null,
                    tint = StarColor
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "$title",
            color = DishTitleColor,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            )
        Spacer(modifier = Modifier.height(15.dp))
        Row (modifier = Modifier) {
            Icon(
                Icons.Filled.Info,
                contentDescription = null,
                tint = AppColor
            )
            Text(
                text = "$duration Hr",
                modifier = Modifier
                    .padding(top = 3.dp)
            )

            Spacer(modifier = Modifier.width(35.dp))

            Icon(
                Icons.Filled.Favorite,
                contentDescription = null,
                tint = AppColor
            )
            Text(
                text = "$likes",
                modifier = Modifier
                    .padding(top = 3.dp)
            )

            Spacer(modifier = Modifier.width(35.dp))

            Icon(
                Icons.Filled.Edit,
                contentDescription = null,
                tint = AppColor
            )
            Text(
                text = "$comments",
                modifier = Modifier
                    .padding(top = 3.dp)
            )
        }
        

        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = description,
            textAlign = TextAlign.Center,
        )

    }


}
