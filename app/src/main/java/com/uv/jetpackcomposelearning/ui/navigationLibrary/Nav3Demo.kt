package com.uv.jetpackcomposelearning.ui.navigationLibrary

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.uv.jetpackcomposelearning.ui.navigationLibrary.*

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Nav3HubSetup() {
    val backStack = remember {
        mutableStateListOf<ScreenKey>(ScreenAKey)
    }

    NavDisplay(
        backStack = backStack,
        onBack = {
            if (backStack.size > 1) {
                backStack.removeLast()
            }
        },
        entryProvider = { key ->
            when (key) {
                ScreenAKey -> NavEntry(key) {
                    ScreenA { backStack.add(ScreenBKey) }
                }
                ScreenBKey -> NavEntry(key) {
                    ScreenB { backStack.add(ScreenCKey) }
                }
                ScreenCKey -> NavEntry(key) {
                    ScreenC()
                }
            }
        }
    )
}

sealed interface ScreenKey
data object ScreenAKey : ScreenKey
data object ScreenBKey : ScreenKey
data object ScreenCKey : ScreenKey
