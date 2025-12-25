package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.navigation.NavController
import com.uv.jetpackcomposelearning.R

@Composable
fun SignupScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    var name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    var confirmPassword by rememberSaveable { mutableStateOf("") }

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

        MyText(name = "Welcome, $name")
        Spacer(modifier = modifier.height(8.dp))
        Text("Create your new account",
            fontSize = 18.sp,
            modifier = modifier.padding(bottom = 16.dp)
            )
        NameTextField(name = name, onNameChange = {
            name = it
        })

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
        OutlinedTextField(
            value = confirmPassword,
            onValueChange = {
                confirmPassword = it
            },
            label = { Text("Confirm Your Password") }
        )

        Spacer(modifier = modifier.height(8.dp))
        Button(modifier = modifier.
        padding(top = 8.dp)
            .width(200.dp), onClick = {}) {
            Text("Create Account",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)
        }

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Already have an account?",
                modifier = modifier.padding(top = 2.dp))
            TextButton(onClick = {
                navController.navigate("login_screen")
            }) {
                Text(
                    text = "Login",
                    fontWeight = FontWeight.Bold
                )
            }
        }


    }
}

@Composable
fun MyText(modifier: Modifier = Modifier, name: String) {
    Text(name,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold)
}

@Composable
fun NameTextField(modifier: Modifier = Modifier, name: String, onNameChange: (String) -> Unit)  {
    OutlinedTextField(
        value = name,
        onValueChange = {
            onNameChange(it)
        },
        label = { Text("Enter Your Name") }
    )
}


//@Preview(showBackground = true)
//@Composable
//fun SignupScreenPreview() {
//    SignupScreen()
//}