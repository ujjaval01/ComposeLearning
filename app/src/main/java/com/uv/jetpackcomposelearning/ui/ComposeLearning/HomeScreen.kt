package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uv.jetpackcomposelearning.R


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp)
    ) {
        // for header...
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {  // humBurger icon
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null,
                tint = Color.Black,
                modifier = modifier
                    .size(24.dp)

            )

            // for right side icon...
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.fruit_basket_image),
                    contentDescription = null,
                    modifier = modifier.size(24.dp)
                )
                Spacer(modifier = modifier.size(4.dp))
                Text("My Basket", color = Color.Black, fontSize = 14.sp)
            }

        }

        Text(
            text = buildAnnotatedString {
                append("Hello ")

                withStyle(
                    style = SpanStyle(
                        color = Color(0xFFFFA000), // highlight color
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,
                        fontSize = 22.sp
                    )
                ) {
                    append("Vanshi\uD83D\uDC4B")
                }

                append(", What type fruits salad combo do you want to order today?")
            },
            fontSize = 20.sp,
            color = Color.Black,
            lineHeight = 28.sp,
            modifier = modifier.padding(bottom = 16.dp)
        )

        // Search bar...
         Row(
             modifier = modifier
                 .fillMaxWidth()
                 .background(
                     color = Color(
                         0xFFF3FFF1
                     ),
                     shape = RoundedCornerShape(16.dp)
                 )
                 .padding(16.dp),
             verticalAlignment = Alignment.CenterVertically
         ) {
             Icon(
                 imageVector = Icons.Default.Search,
                 contentDescription = null,
                 tint = Color.Black,
                 modifier = modifier.size(24.dp)
             )
             Spacer(modifier = modifier.width(12.dp))
             Text("Search for fruit salad combo")
             Spacer(modifier = modifier.weight(1f))
             Image(painter = painterResource(R.drawable.filter_list),
                 contentDescription = null,
                 modifier = modifier.size(20.dp)
             )
         }

        Spacer(modifier = modifier.height(32.dp))

        Text("Recommended Combo",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color.Black,
            modifier = modifier
                .padding(bottom = 16.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.padding(bottom = 32.dp)
        ) {
            items(3){ index ->
                RecommendedComboCard(
                    name = if(index == 0) "Honey limb potato combo" else if(index == 1) "Berry mango combo" else "Strawberry banana combo",
                    price = if(index == 0) "$20" else if (index == 1) "$25" else "$30",
                    imageRes = if(index == 0) R.drawable.food_1 else if (index == 1) R.drawable.food_2 else R.drawable.food_1
                )
            }
        }

        Column {

            // 🔹 Categories row (TOP)
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                items(
                    listOf("Hottest", "Most popular", "Newest", "Top Selling")
                ) { category ->
                    Text(
                        text = category,
                        fontSize = 16.sp,
                        fontWeight = if (category == "Hottest")
                            FontWeight.Bold
                        else
                            FontWeight.Normal,
                        color = Color.Black
                    )
                }
            }

            // 🔹 Cards row (BOTTOM)
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(5) {index->
                    RecommendedComboCard(
                        name = if(index == 0) "Strawberry banana combo" else if(index == 1) "Berry mango combo" else if(index == 2) "Strawberry banana combo" else if(index == 3) "Honey limb potato combo" else "Berry mango combo",
                        price = if(index == 0) "$20" else if (index == 1) "$25" else if(index == 2) "$20" else if(index == 3) "$25" else "$30",
                        imageRes = if(index == 0) R.drawable.food_1 else if (index == 1) R.drawable.food_2 else if(index == 2) R.drawable.food_2 else if(index == 3) R.drawable.food_1 else R.drawable.food_1
                    )
                }
            }
        }



    }
}

@Composable
fun RecommendedComboCard(modifier: Modifier = Modifier, name: String, price: String, imageRes: Int) {
    Card(
        modifier = modifier
            .width(151.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)

    ) {
        Column(modifier = modifier.padding(start = 16.dp)) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.End)
            {
                Icon(imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint = Color(0xFFFF8C42),
                    modifier = modifier.size(30.dp)
                        .padding(end = 8.dp)
                )
            }
            Image(painter = painterResource(id = imageRes),
                contentDescription = null,
                modifier = modifier.size(80.dp)
//                    .align(alignment = Alignment.CenterHorizontally)
            )

            Spacer(modifier = modifier.height(12.dp))
            Text(text = name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            Spacer(modifier = modifier.height(8.dp))
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = price,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF8C42)
                )
                Icon(imageVector = Icons.Default.Add, contentDescription = null,
                    tint = Color(0xFFFF8C42),
                    modifier = modifier.size(26.dp)
                        .background(
                            color = Color(0xFFFFF2E7),
                            shape = CircleShape
                        )

                )
            }

        }
    }
}

@Composable
@Preview(showBackground = true)
fun HSPrev(modifier: Modifier = Modifier){
    HomeScreen()
//    RecommendedComboCard(name = "Pizza", price = "$20", imageRes = R.drawable.food_1)
}
