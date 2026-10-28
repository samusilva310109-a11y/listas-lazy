package com.example.listaslazy.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.listaslazy.model.Studio
import com.example.listaslazy.repository.getGamesByNameOrStudioOrCategory
import com.example.listaslazy.viewModel.GameViewModel

@Composable
fun StudioCard(modifier: Modifier = Modifier, studio: Studio, gameViewModel: GameViewModel) {
    Card(
        modifier = modifier
            .size(150.dp)
            .padding(end = 4.dp),
        onClick = {
            gameViewModel.onGameListChanged(
                getGamesByNameOrStudioOrCategory(studio.name)
            )
        }
    ) {
        Box(
            modifier = modifier.fillMaxSize().background(Color.White)
        ){

            AsyncImage(
                model = studio.urlImage,
                contentDescription = studio.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )


            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.8f)
                            )
                        )
                    )
            )

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            ) {
                Text(
                    text = studio.name,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }
    }
}