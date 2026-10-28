package com.example.listaslazy.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.listaslazy.model.Game
import com.example.listaslazy.model.Studio
import com.example.listaslazy.repository.getGamesByNameOrStudioOrCategory

@Composable
fun StudioCard(modifier: Modifier = Modifier, studio: Studio) {
    Card(
        modifier = modifier
            .size(150.dp)
            .padding(end = 4.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.LightGray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = studio.name,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        }
    }
}