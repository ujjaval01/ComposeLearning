package com.uv.jetpackcomposelearning.ui.ComposeLearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uv.jetpackcomposelearning.R

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {
    var name by rememberSaveable {
        mutableStateOf("")
    }
    var password by rememberSaveable {
        mutableStateOf("")
    }

    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(
            R.drawable.login_screen_img),
            contentDescription = "signup image"
        )
        Spacer(modifier = modifier.height(10.dp))
        MyText(name = name)
        Spacer(modifier = Modifier.height(16.dp))
        NameTextField(name = name, onNameChange = {
            name = it
        })
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = { Text("Enter Password") }
        )
    }
}

@Composable
fun MyText(modifier: Modifier = Modifier, name: String) {
    Text(text = "Hello, $name",
        fontSize = 30.sp)
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


@Preview(showBackground = true)
@Composable
fun SignupScreenPreview() {
    SignupScreen()
}