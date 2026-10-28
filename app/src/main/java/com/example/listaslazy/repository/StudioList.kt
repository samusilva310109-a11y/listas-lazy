package com.example.listaslazy.repository

import androidx.compose.ui.res.painterResource
import com.example.listaslazy.model.Studio

fun getAllStudios(): List<Studio>{
    return listOf(
        Studio(
            id = 1,
            name = "SEGA",
            urlImage = "https://images.seeklogo.com/logo-png/12/1/sega-logo-png_seeklogo-124470.png"
        ),

        Studio(
            id = 2,
            name = "Mojang Studios",
            urlImage = "https://images.seeklogo.com/logo-png/40/1/mojang-logo-png_seeklogo-405297.png"
        ),

        Studio(
            id = 3,
            name = "Santa Monica Studio",
            urlImage = "https://images.seeklogo.com/logo-png/45/1/santa-monica-studio-logo-png_seeklogo-458298.png"
        ),

        Studio(
            id = 4,
            name = "Nintendo",
            urlImage = "https://images.seeklogo.com/logo-png/9/1/nintendo-logo-png_seeklogo-99658.png"
        ),

        Studio(
            id = 5,
            name = "Rockstar Games",
            urlImage = "https://images.seeklogo.com/logo-png/11/1/rockstar-games-logo-png_seeklogo-119325.png"
        ),

        Studio(
            id = 6,
            name = "Team Cherry",
            urlImage = "https://mir-s3-cdn-cf.behance.net/projects/404/c7d42276115247.Y3JvcCw1MTUsNDAyLDQ0MiwxOTI.jpg"
        ),

        Studio(
            id = 7,
            name = "ConcernedApe",
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSkHyza8EiJ_cwzFelFuuq7YHuVpuGw-J_QJ-d21CdnLv3w62oRlXLQqNY&s=10"
        ),

        Studio(
            id = 8,
            name = "Maddy Makes Games",
            urlImage = "https://maddymakesgames.com/images/preview.png"
        )
    )
}

fun getStudioByID(id: Long): Studio{
    return getAllStudios().first { it.id == id }
}

fun getStudios(studioName: String): List<Studio> {
    return getAllStudios()
        .map {it}
        .filter {
            it.name.startsWith(prefix = studioName, ignoreCase = true)
        }
}