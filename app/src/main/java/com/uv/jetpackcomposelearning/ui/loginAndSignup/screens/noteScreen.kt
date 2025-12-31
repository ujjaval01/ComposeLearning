package com.uv.jetpackcomposelearning.ui.loginAndSignup.screens

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.uv.jetpackcomposelearning.ui.loginAndSignup.note.NodeViewModel

@Composable
fun NoteScreen(modifier: Modifier = Modifier, viewModel: NodeViewModel) {

//    val context = LocalContext.current
//
//    val title by remember { mutableStateListOf("") }
//    val desc by remember { mutableStateListOf("") }
//
//
//    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
//        viewModel.addNote(title, desc)
//    }
//
//    }
}