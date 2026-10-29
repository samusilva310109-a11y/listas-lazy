package com.example.listaslazy.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listaslazy.model.Category
import com.example.listaslazy.model.Studio
import com.example.listaslazy.repository.getGamesByNameOrStudioOrCategory
import com.example.listaslazy.view.mapper.toCardColor
import com.example.listaslazy.view.mapper.toColor
import com.example.listaslazy.view.mapper.toPainter
import com.example.listaslazy.viewModel.GameViewModel

@Composable
fun CategoryCard(category: Category, gameViewModel: GameViewModel) {
    val icon = category.icon.toPainter()
    val iconColor = category.icon.toColor()
    val cardColor = category.icon.toCardColor()

    Card(
        modifier = Modifier
            .size(90.dp)
            .padding(end = 5.dp),
        onClick = {
            gameViewModel.onGameListChanged(getGamesByNameOrStudioOrCategory(category.name))
        },
        colors = CardDefaults.cardColors(
            cardColor
        )
    ) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.size(25.dp),
                painter = icon,
                tint = iconColor,
                contentDescription = category.name,
            )

            Text(
                text = category.name,
                fontSize = 10.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        }

    }
}