package com.example.thefarmersdairy.presentation.theme.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.thefarmersdairy.R

@Composable
fun splashScreen(
    navControler: NavController
) {
    val scale = remember {
        androidx.compose.animation.core.Animatable(0f)
    }
    val overshootInterpolator = remember {
        OvershootInterpolator(2f)
    }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 2.3f, animationSpec = tween(
                durationMillis = 500,
                easing = {
                    overshootInterpolator.getInterpolation(it)
                }
            )
        )
    }

    val scale2 = remember {
        Animatable(0f)
    }
    val overInterpolator = remember {
        OvershootInterpolator(2f)
    }
    LaunchedEffect(key1 = true) {
        scale2.animateTo(
            targetValue = 2.0f, animationSpec = tween(
                durationMillis = 500,
                easing = {
                    overInterpolator.getInterpolation(it)
                }
            )
        )
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    )

    {
        Image(
            painter = painterResource(id = R.drawable.white_circle), contentDescription = "Logo",
            modifier = Modifier.scale(scale.value)
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(55.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.cow),
                contentDescription = "Cow",
                contentScale = ContentScale.Crop,
                modifier = Modifier.scale(scale2.value)
            )
        }

    }
}