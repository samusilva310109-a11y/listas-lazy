package com.example.listaslazy.view.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.listaslazy.R
import com.example.listaslazy.model.Game

@Composable
fun GameCard(game: Game, onClick: (Game) -> Unit) {
    Card(
        modifier =
            Modifier
                .padding(end = 8.dp, bottom = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.gameCard_color)
        ),
        onClick = {
            onClick(game)
        }
    ) {
        Row( modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(
                Modifier.size(80.dp).weight(0.6f)
            ){
                AsyncImage(
                    model = game.urlImage,
                    contentDescription = game.title,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.fillMaxSize()
                )
            }


            Column( modifier = Modifier.fillMaxWidth()
                .padding(16.dp)
                .weight(2f)
            ) {
                Text(
                    text = game.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.font_color)
                )

                Text(
                    text = game.studio.name,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = colorResource(R.color.font_color)
                )
            }

            Text(
                modifier = Modifier.weight(1f)
                    .fillMaxWidth(),
                text = "${game.releaseYear}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.details_color)
            )
        }
    }
}
