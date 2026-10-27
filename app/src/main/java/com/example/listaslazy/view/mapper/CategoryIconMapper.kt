package com.example.listaslazy.view.mapper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.listaslazy.R
import com.example.listaslazy.model.CategoryIcon

@Composable
fun CategoryIcon.toPainter(): Painter {
    return when (this) {
        CategoryIcon.ACTION -> painterResource(R.drawable.ic_action)
        CategoryIcon.RPG -> painterResource(R.drawable.ic_rpg)
        CategoryIcon.ADVENTURE -> painterResource(R.drawable.ic_adventure)
        CategoryIcon.RACING -> painterResource(R.drawable.ic_racing)
        CategoryIcon.SPORT -> painterResource(R.drawable.ic_sport)
        CategoryIcon.HORROR -> painterResource(R.drawable.ic_horror)
        CategoryIcon.PUZZLE -> painterResource(R.drawable.ic_puzzle)
        CategoryIcon.PLATFORM -> painterResource(R.drawable.ic_platform)
        CategoryIcon.STRATEGY -> painterResource(R.drawable.ic_strategy)
        CategoryIcon.SIMULATION -> painterResource(R.drawable.ic_simulation)
        CategoryIcon.FIGHTING -> painterResource(R.drawable.ic_fighting)
        CategoryIcon.SHOOTER -> painterResource(R.drawable.ic_shooter)
        CategoryIcon.SURVIVAL -> painterResource(R.drawable.ic_survival)
    }
}