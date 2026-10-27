package com.example.listaslazy.model

import androidx.compose.ui.graphics.painter.Painter

data class Studio(
    val id: Long,
    val name: String,
    val image: Painter
)