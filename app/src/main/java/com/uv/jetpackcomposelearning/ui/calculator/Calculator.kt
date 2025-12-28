package com.uv.jetpackcomposelearning.ui.calculator

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

val buttonList = listOf(
    "C", "(", ")", "/",
    "7", "8", "9", "*",
    "4", "5", "6", "-",
    "1", "2", "3", "+",
    "AC", "0", ".", "="
)

@Composable
fun Calculator(modifier: Modifier = Modifier, viewModel: CalculatorViewModel) {

    val equation = viewModel.equationText.observeAsState()
    val result = viewModel.resultText.observeAsState()

    Box(modifier = modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(top = 14.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = equation.value?:"",
                style = TextStyle(
                    fontSize = 30.sp,
                    textAlign = TextAlign.End
                ),
                maxLines = 5,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = result.value?:"",
                style = TextStyle(
                    fontSize = 60.sp,
                    textAlign = TextAlign.End
                ),
                maxLines = 2
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                modifier = Modifier.padding(bottom = 6.dp)
            ) {
                items(buttonList) {
                    CalculatorButton(btn = it, onClick = {
                        viewModel.onButtonClick(it)
                    })
                }
            }
        }
    }
}

@Composable
fun CalculatorButton(btn: String,onClick: () -> Unit,modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .padding(8.dp)){
        FloatingActionButton(
            onClick = {
                onClick()

            },
            modifier = Modifier.size(80.dp),
            shape = CircleShape
        ) {
            Text(text = btn,
                fontSize = 22.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun CalculatorPrev(modifier: Modifier = Modifier) {
    val calculatorViewModel: CalculatorViewModel = viewModel()
    Scaffold (modifier = Modifier.fillMaxSize()){innerPadding ->
        Calculator(modifier = Modifier.padding(innerPadding),calculatorViewModel)
    }
}