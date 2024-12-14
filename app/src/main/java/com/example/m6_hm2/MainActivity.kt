package com.example.m6_hm2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.m6_hm2.ui.model.PersonModel
import com.example.m6_hm2.ui.screens.ChoiceScreen
import com.example.m6_hm2.ui.screens.DetailScreen
import com.example.m6_hm2.ui.theme.M6_HM2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val currentScreen = remember { mutableStateOf(NavigationScreen.Choice)}
            val person = remember { mutableStateOf<PersonModel?>(null) }

            M6_HM2Theme {
                Scaffold { padding ->
                    when (currentScreen.value) {
                        NavigationScreen.Choice -> {
                            ChoiceScreen(paddingValues = padding, onItemClick = {
                                person.value = it
                                currentScreen.value = NavigationScreen.Detail
                            })
                        }
                        NavigationScreen.Detail -> {
                            person.value?.let {
                                DetailScreen(paddingValues = padding, person = it)
                            } ?: run {
                                currentScreen.value = NavigationScreen.Choice
                            }
                        }
                    }
                }
            }
        }
    }
}

enum class NavigationScreen {
    Choice, Detail
}
