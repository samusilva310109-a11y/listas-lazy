package com.example.listaslazy.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.listaslazy.R
import com.example.listaslazy.model.Studio
import com.example.listaslazy.repository.getAllStudios
import com.example.listaslazy.repository.getGameById
import com.example.listaslazy.repository.getGameCategoryByIdGame
import com.example.listaslazy.view.components.CategoryCard
import com.example.listaslazy.view.components.StudioCard
import com.example.listaslazy.viewModel.GameViewModel

@Composable
fun GameDetailScreen(
    modifier: Modifier = Modifier,
    gameId: Long?,
    onBackClick: () -> Unit
) {
    val game = gameId?.let {
        getGameById(it)
    }

    var studiosList by remember {
        mutableStateOf(getAllStudios())
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(R.color.background))
    ) {

        IconButton(
            onClick = onBackClick
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Voltar"
            )
        }

        Row(Modifier.fillMaxWidth()) {
            AsyncImage(
                model = game?.urlImage,
                contentDescription = game?.title,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )
        }

        Column(
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 20.dp)
            ,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = game?.title ?: "",
                fontSize = 32.sp,
                color = colorResource(R.color.font_color),
                style = MaterialTheme.typography.headlineMedium
            )

            Spacer(Modifier.height(20.dp))

            Text(
                text = game?.studio?.name ?: "",
                fontSize = 16.sp,
                color = colorResource(R.color.font_color),
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "Lançamento: ${game?.releaseYear}",
                color = colorResource(R.color.font_color)
            )
        }

        Text(
            modifier = Modifier.padding(start = 15.dp, bottom = 15.dp ),
            text = "ESTÚDIO",
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.font_color),
            fontSize = 16.sp
        )

        LazyRow(
            Modifier.padding(start = 10.dp)
        ) {
            item(){
                StudioCard(
                    modifier = Modifier.size(120.dp),
                    studio = game?.studio ?: Studio(id = 0, name = "", urlImage = ""),
                    gameViewModel = GameViewModel()
                )
            }
        }


        Text(
            modifier = Modifier.padding(start = 15.dp, top = 15.dp),
            text = "CATEGORIAS RELACIONADAS",
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.font_color),
            fontSize = 16.sp
        )

        LazyRow(
            Modifier.padding(start = 10.dp, top = 10.dp)
        ) {
            items(getGameCategoryByIdGame(gameId)){
                CategoryCard(
                    category = it,
                    gameViewModel = GameViewModel()
                )
            }
        }

    }

    Box(
        modifier = modifier.fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        colorResource(R.color.second_font_color).copy(alpha = 0.1f)
                    )
                )
            )
    )
}

