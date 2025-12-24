package com.uv.jetpackcomposelearning.ui.ComposeLearning

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uv.jetpackcomposelearning.R

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.white))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.65f)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            colorResource(R.color.lightYellow),
                            colorResource(R.color.darkYellow)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ){
            Box(
                modifier = modifier
                    .size(280.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.1f),
                        shape = androidx.compose.foundation.shape.CircleShape
                    ),
                contentAlignment = Alignment.Center
            ){
                Image(painter = painterResource(R.drawable.fruit_basket_image),
                    contentDescription = null,
                    modifier = modifier.size(160.dp)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Text("Get The Freshest Fruit Salad Combo",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.black),
                textAlign = TextAlign.Center,
                lineHeight = 28.sp
//                maxLines = 1
            )

            Spacer(modifier = modifier.height(16.dp))

            Text("We deliver the best and freshest food salad in the market, Order now and get 20% off if you buy any of combo!!!",
                fontSize = 16.sp,
                color = colorResource(R.color.black),
                textAlign = TextAlign.Center,
                lineHeight = 24.sp
            )

            Spacer(modifier = modifier.height(22.dp))

            Button(onClick = {},
                modifier = modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(
                        R.color.lightYellow)
                ), shape = RoundedCornerShape(16.dp)
            ) {
                Text("Let's Continue..",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = androidx.compose.ui.graphics.Color.White
                )
            }
        }
    }

}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun WSPrev(modifier: Modifier = Modifier) {
    WelcomeScreen()

}