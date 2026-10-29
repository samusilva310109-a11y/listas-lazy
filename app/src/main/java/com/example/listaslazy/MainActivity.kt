package com.example.listaslazy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.listaslazy.navigation.AppNavigation
import com.example.listaslazy.ui.theme.ListasLazyTheme
import com.example.listaslazy.viewModel.GameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListasLazyTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val gameViewModel: GameViewModel =
                        viewModel()

                    AppNavigation(
                        modifier = Modifier.padding(innerPadding),
                        gameViewModel = gameViewModel
                    )
                }
            }
        }
    }
}