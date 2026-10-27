package com.example.listaslazy.repository

import androidx.compose.ui.res.painterResource
import com.example.listaslazy.model.Category
import com.example.listaslazy.model.CategoryIcon
import com.example.listaslazy.model.Game
import com.example.listaslazy.model.Studio

fun getAllGames(): List<Game> {
    return listOf(
        Game(
            id = 1,
            title = "Sonic",
            categories = listOf(
                Category(id = 4, name = "Corrida", icon = CategoryIcon.RACING),
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM)
            ),
            studio = "SEGA",
            releaseYear = 1990
        ),

        Game(
            id = 2,
            title = "Minecraft",
            categories = listOf(
                Category(id = 10, name = "Simulação", icon = CategoryIcon.SIMULATION),
                Category(id = 13, name = "Sobrevivência", icon = CategoryIcon.SURVIVAL),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = "Mojang Studios",
            releaseYear = 2011
        ),

        Game(
            id = 3,
            title = "God of War",
            categories = listOf(
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 1, name = "RPG", icon = CategoryIcon.RPG),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = "Santa Monica Studio",
            releaseYear = 2018
        ),

        Game(
            id = 4,
            title = "The Legend of Zelda: Breath of the Wild",
            categories = listOf(
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE),
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM)
            ),
            studio = "Nintendo",
            releaseYear = 2017
        ),

        Game(
            id = 5,
            title = "Grand Theft Auto V",
            categories = listOf(
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE),
                Category(id = 12, name = "Tiro", icon = CategoryIcon.SHOOTER)
            ),
            studio = "Rockstar Games",
            releaseYear = 2013
        ),

        Game(
            id = 6,
            title = "Super Mario Bros.",
            categories = listOf(
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM),
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION)
            ),
            studio = "Nintendo",
            releaseYear = 1985
        ),

        Game(
            id = 7,
            title = "Hollow Knight",
            categories = listOf(
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 1, name = "RPG", icon = CategoryIcon.RPG),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = "Team Cherry",
            releaseYear = 2017
        ),

        Game(
            id = 8,
            title = "Stardew Valley",
            categories = listOf(
                Category(id = 10, name = "Simulação", icon = CategoryIcon.SIMULATION),
                Category(id = 1, name = "RPG", icon = CategoryIcon.RPG),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = "ConcernedApe",
            releaseYear = 2016
        ),

        Game(
            id = 9,
            title = "Celeste",
            categories = listOf(
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM),
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION)
            ),
            studio = "Maddy Makes Games",
            releaseYear = 2018
        )
    )
}

fun getGamesByStudio(studio: String): List<Game> {
    return getAllGames().filter {
        it.studio.startsWith(prefix = studio, ignoreCase = true)
    }
}

fun getStudios(studio: String): List<String> {
    return getAllGames()
        .map { it.studio }
        .filter {
            it.startsWith(prefix = studio, ignoreCase = true)
        }
}

