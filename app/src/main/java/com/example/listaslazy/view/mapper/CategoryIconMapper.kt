package com.example.listaslazy.view.mapper

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
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

@Composable
fun CategoryIcon.toColor(): Color{
    return when (this) {
        CategoryIcon.ACTION -> colorResource(R.color.ic_action)
        CategoryIcon.RPG -> colorResource(R.color.ic_rpg)
        CategoryIcon.ADVENTURE -> colorResource(R.color.ic_aventura)
        CategoryIcon.RACING -> colorResource(R.color.ic_corrida)
        CategoryIcon.SPORT -> colorResource(R.color.ic_esporte)
        CategoryIcon.HORROR -> colorResource(R.color.ic_terror)
        CategoryIcon.PUZZLE -> colorResource(R.color.ic_puzzle)
        CategoryIcon.PLATFORM -> colorResource(R.color.ic_plataforma)
        CategoryIcon.STRATEGY -> colorResource(R.color.ic_estrategia)
        CategoryIcon.SIMULATION -> colorResource(R.color.ic_simulacao)
        CategoryIcon.FIGHTING -> colorResource(R.color.ic_luta)
        CategoryIcon.SHOOTER -> colorResource(R.color.ic_tiro)
        CategoryIcon.SURVIVAL -> colorResource(R.color.ic_sobrevivencia)
    }
}

@Composable
fun CategoryIcon.toCardColor(): Color {
    return when (this) {
        CategoryIcon.ACTION -> colorResource(R.color.cd_action)
        CategoryIcon.RPG -> colorResource(R.color.cd_rpg)
        CategoryIcon.ADVENTURE -> colorResource(R.color.cd_aventura)
        CategoryIcon.RACING -> colorResource(R.color.cd_corrida)
        CategoryIcon.SPORT -> colorResource(R.color.cd_esporte)
        CategoryIcon.HORROR -> colorResource(R.color.cd_terror)
        CategoryIcon.PUZZLE -> colorResource(R.color.cd_puzzle)
        CategoryIcon.PLATFORM -> colorResource(R.color.cd_plataforma)
        CategoryIcon.STRATEGY -> colorResource(R.color.cd_estrategia)
        CategoryIcon.SIMULATION -> colorResource(R.color.cd_simulacao)
        CategoryIcon.FIGHTING -> colorResource(R.color.cd_luta)
        CategoryIcon.SHOOTER -> colorResource(R.color.cd_tiro)
        CategoryIcon.SURVIVAL -> colorResource(R.color.cd_sobrevivencia)
    }
}