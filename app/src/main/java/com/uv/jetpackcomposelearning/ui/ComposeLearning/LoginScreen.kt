package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uv.jetpackcomposelearning.R
import androidx.compose.ui.graphics.Color


@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }

    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(
            R.drawable.login_screen_img),
            contentDescription = "signup image",
            modifier = modifier.height(264.dp)
        )

        MyText(name = "Welcome back")
        Spacer(modifier = modifier.height(8.dp))
        Text("Login your account",
            fontSize = 18.sp,
            modifier = modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = { Text("Enter Your Email") }
        )
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = { Text("Enter Your Password") }
        )

        Spacer(modifier = modifier.height(8.dp))
        Button(modifier = modifier.
        padding(top = 8.dp)
            .width(200.dp), onClick = {}) {
            Text("Login Account",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                )
        }

        TextButton(onClick = {}) {
            Text("Forgot Password?",
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = Color.Black)
        }

        Text("-  -  -  -  - Or login with -  -  -  -  -",
            modifier = modifier.padding(top = 22.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(R.drawable.google_icon),
                contentDescription = "google",
                modifier = modifier
                    .size(60.dp)
                    .padding(10.dp)
                    .clickable {
                        // Handle Google login
                    }
            )
            Image(painter = painterResource(R.drawable.facebook_icon),
                contentDescription = "facebook",
                modifier = modifier
                    .size(80.dp)
                    .padding(10.dp)
                    .clickable {
                        // Handle Facebook login
                    }
            )
            Image(painter = painterResource(R.drawable.play_store),
                contentDescription = "playStore",
                modifier = modifier
                    .size(60.dp)
                    .padding(10.dp)
                    .clickable {
                        // Handle playStore login
                    }
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Don't have an account?",
                modifier = modifier.padding(top = 2.dp))
            TextButton(onClick = {}) {
                Text(
                    text = "Sign Up",
                    fontWeight = FontWeight.Bold
                )
            }
        }

    }
}



@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}