package com.uv.jetpackcomposelearning.ui.foodOrderingApp

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.uv.jetpackcomposelearning.R
import kotlinx.coroutines.delay

@Composable
fun FoodSplashScreen(
    onFinished: () -> Unit
) {

    // 🔹 Lottie composition (UI scope)
    val composition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(R.raw.food_carousel)
    )

    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = 1,
        speed = 1f
    )

    // 🔹 Splash delay + navigation (SIDE EFFECT)
    LaunchedEffect(Unit) {
        delay(3000)   // 3 sec splash
        onFinished()
    }

    // 🔹 UI
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.white)),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = composition,
            progress = { progress },
            modifier = Modifier
                .size(220.dp)
                .align(Alignment.Center)
        )

        val alpha by animateFloatAsState(
            targetValue = 1f,
            animationSpec = tween(1200)
        )

        Text("Food App with Compose",
            fontSize = 26.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 90.dp)
            )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun FoodSplashPreview() {
    FoodSplashScreen(
        onFinished = {}
    )
}
