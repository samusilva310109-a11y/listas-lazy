package com.example.listaslazy.view.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listaslazy.model.Category
import com.example.listaslazy.view.mapper.toPainter

@Composable
fun CategorCard(category: Category) {
    val icon = category.icon.toPainter()

    Card(
        modifier = Modifier
            .size(115.dp)
            .padding(end = 2.dp)
    ) {
        Column(
            Modifier.background(Color.LightGray).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier.size(30.dp),
                painter = icon,
                tint = Color.Black,
                contentDescription = category.name,
            )

            Spacer(Modifier.size(10.dp))

            Text(
                text = category.name,
                fontSize = 16.5.sp,
                color = Color.Black
            )
        }

    }
}