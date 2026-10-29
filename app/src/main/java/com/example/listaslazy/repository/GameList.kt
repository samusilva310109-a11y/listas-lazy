package com.example.listaslazy.repository

import com.example.listaslazy.model.Category
import com.example.listaslazy.model.CategoryIcon
import com.example.listaslazy.model.Game

fun getAllGames(): List<Game> {
    return listOf(
        Game(
            id = 1,
            title = "Sonic",
            categories = listOf(
                Category(id = 4, name = "Corrida", icon = CategoryIcon.RACING),
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM)
            ),
            studio = getStudioByID(1),
            releaseYear = 1990,
            urlImage = "https://i.pinimg.com/736x/18/bc/2a/18bc2a2b0b7b1eef9fcbf01edb9c1d5a.jpg"
        ),

        Game(
            id = 2,
            title = "Minecraft",
            categories = listOf(
                Category(id = 10, name = "Simulação", icon = CategoryIcon.SIMULATION),
                Category(id = 13, name = "Sobrevivência", icon = CategoryIcon.SURVIVAL),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = getStudioByID(2),
            releaseYear = 2011,
            urlImage =
                "https://store-images.s-microsoft.com/image/apps.17382.13510798885735219.9735d495-578c-4a4c-b892-3eb3a780b3a0.d3792486-cf98-40c0-a2c1-d6443f0e2b70"
        ),

        Game(
            id = 3,
            title = "God of War",
            categories = listOf(
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 1, name = "RPG", icon = CategoryIcon.RPG),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = getStudioByID(3),
            releaseYear = 2018,
            urlImage = "https://i.ebayimg.com/images/g/OeQAAOSwtEJj-mIp/s-l1200.jpg"
        ),

        Game(
            id = 4,
            title = "The Legend of Zelda: Breath of the Wild",
            categories = listOf(
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE),
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM)
            ),
            studio = getStudioByID(4),
            releaseYear = 2017,
            urlImage = "https://assets.nintendo.com.au/image/upload/v1715574262/NAL/Documents/botw-wallpaper/NSwitch_TheLegendOfZeldaBreathOfTheWild_wp_tablet_02.jpg"
        ),

        Game(
            id = 5,
            title = "Grand Theft Auto V",
            categories = listOf(
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE),
                Category(id = 12, name = "Tiro", icon = CategoryIcon.SHOOTER)
            ),
            studio = getStudioByID(5),
            releaseYear = 2013,
            urlImage = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/228541e0-60ef-4add-b43f-99c4c67d2af9/d622dyw-49311e89-c25e-4649-8c33-77ee14ce9966.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi8yMjg1NDFlMC02MGVmLTRhZGQtYjQzZi05OWM0YzY3ZDJhZjkvZDYyMmR5dy00OTMxMWU4OS1jMjVlLTQ2NDktOGMzMy03N2VlMTRjZTk5NjYucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.FrHBwny_9WAXIzZCw9MpA6KPj8nQ8VemW9ZaGBwa4G8"
        ),

        Game(
            id = 6,
            title = "Super Mario Bros.",
            categories = listOf(
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM),
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION)
            ),
            studio = getStudioByID(4),
            releaseYear = 1985,
            urlImage = "https://m.media-amazon.com/images/M/MV5BYjVhOTAzNjktMjMzMy00NTU4LWFjYzgtODIyNTcwNGFiOGZmXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg"
        ),

        Game(
            id = 7,
            title = "Hollow Knight",
            categories = listOf(
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
                Category(id = 1, name = "RPG", icon = CategoryIcon.RPG),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = getStudioByID(6),
            releaseYear = 2017,
            urlImage = "https://images.igdb.com/igdb/image/upload/t_cover_big/cobfzp.webp"
        ),

        Game(
            id = 8,
            title = "Stardew Valley",
            categories = listOf(
                Category(id = 10, name = "Simulação", icon = CategoryIcon.SIMULATION),
                Category(id = 1, name = "RPG", icon = CategoryIcon.RPG),
                Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE)
            ),
            studio = getStudioByID(7),
            releaseYear = 2016,
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSn_Wb4t9K11nnnbDIf8Rh5syixxx6VGyqLVZuRhI8CCA&s"
        ),

        Game(
            id = 9,
            title = "Celeste",
            categories = listOf(
                Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM),
                Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION)
            ),
            studio = getStudioByID(8),
            releaseYear = 2018,
            urlImage = "https://cdn.displate.com/artwork/270x380/2026-03-06/cc85fbcc-8f13-4c95-b421-e188479ba7de.jpg"
        )
    )
}

fun getGamesByStudio(studioName: String): List<Game> {
    return getAllGames().filter {
        it.studio.name.startsWith(prefix = studioName, ignoreCase = true)
    }
}

fun getGameCategoryByIdGame(id: Long?): List<Category>{
    return getAllGames()
        .first(
            {game -> game.id == id}
        ).categories
}

fun getGameById(id: Long): Game?{
    return  getAllGames()
        .firstOrNull(
            {game -> game.id == id}
        )
}

fun getGamesByNameOrStudioOrCategory(
    search: String
): List<Game> {
    return getAllGames().filter {
        it.title.startsWith(search, ignoreCase = true) ||
                it.studio.name.startsWith(search, ignoreCase = true) ||
                it.categories.any {
                    it.name.equals(search.trim(), ignoreCase = true)
                }
    }
}

