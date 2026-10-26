package com.example.listaslazy.repository

import com.example.listaslazy.model.Game

fun getAllGames(): List<Game> {
    return listOf(
        Game(id = 1, title = "Sonic", studio = "SEGA", releaseYear = 1990),
        Game(id = 2, title = "Minecraft", studio = "Mojang Studios", releaseYear = 2011),
        Game(id = 3, title = "God of War", studio = "Santa Monica Studio", releaseYear = 2018),
        Game(
            id = 4,
            title = "The Legend of Zelda: Breath of the Wild",
            studio = "Nintendo",
            releaseYear = 2017
        ),
        Game(id = 5, title = "Grand Theft Auto V", studio = "Rockstar Games", releaseYear = 2013),
        Game(id = 6, title = "Super Mario Bros.", studio = "Nintendo", releaseYear = 1985),
        Game(id = 7, title = "Hollow Knight", studio = "Team Cherry", releaseYear = 2017),
        Game(id = 8, title = "Stardew Valley", studio = "ConcernedApe", releaseYear = 2016),
        Game(id = 9, title = "Celeste", studio = "Maddy Makes Games", releaseYear = 2018)
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

