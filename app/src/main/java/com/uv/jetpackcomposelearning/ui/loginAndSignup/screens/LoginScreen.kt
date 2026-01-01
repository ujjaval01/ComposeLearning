package com.uv.jetpackcomposelearning.ui.loginAndSignup.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.uv.jetpackcomposelearning.R
import com.uv.jetpackcomposelearning.ui.loginAndSignup.auth.authviewmodel.AuthViewModel
import androidx.compose.ui.platform.LocalInspectionMode


@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: AuthViewModel
) {
    val isPreview = LocalInspectionMode.current
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.login_screen_img),
            contentDescription = "login image",
            modifier = Modifier.height(260.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Welcome back",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Login your account",
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // EMAIL
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Enter Your Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth(0.9f)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // PASSWORD
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Enter Your Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier.fillMaxWidth(0.9f)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // ERROR MESSAGE
        if (errorMessage.isNotEmpty()) {
            Text(
                text = errorMessage,
                color = Color.Red,
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // LOGIN BUTTON
        Button(
            modifier = Modifier.width(200.dp),
            enabled = !isLoading,
            onClick = {
                if (email.isBlank() || password.isBlank()) {
                    errorMessage = "Email and password cannot be empty"
                    return@Button
                }

                isLoading = true
                errorMessage = ""

                if (isPreview) {
                    // Preview mode → fake success
                    isLoading = false
                    errorMessage = "Preview Mode (No Login)"
                } else {
                    viewModel.login(email.trim(), password) { success, message ->
                        isLoading = false
                        if (success) {
                            navController.navigate("food_app") {
                                popUpTo("login_screen") { inclusive = true }
                            }
                        } else {
                            errorMessage = message
                        }
                    }
                }

            }
        ) {
            if (isLoading) {
                CircularProgressIndicator(
                    color = Color.White,
                    modifier = Modifier.size(20.dp),
                    strokeWidth = 2.dp
                )
            } else {
                Text(
                    text = "Login Account",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        TextButton(onClick = { /* Forgot password */ }) {
            Text("Forgot Password?", color = Color.Black)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text("- - - - - Or login with - - - - -")

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.google_icon),
                contentDescription = "google",
                modifier = Modifier
                    .size(60.dp)
                    .padding(10.dp)
                    .clickable { }
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Don't have an account?")
            TextButton(onClick = {
                navController.navigate("signup_screen")
            }) {
                Text("Sign Up", fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        navController = rememberNavController(),
        viewModel = AuthViewModel() // logic won't run due to preview check
    )
}

