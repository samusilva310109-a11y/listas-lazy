package com.example.listaslazy.repository

import androidx.compose.ui.res.painterResource
import com.example.listaslazy.model.Studio

fun getAllStudios(): List<Studio>{
    return listOf(
        Studio(
            id = 1,
            name = "SEGA",
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVCO_pPO_WpmGqm2Q7CBvMmdZRP9w49ZojLXfQBMe-7BBvQQUxVUHISr9j&s=10"
        ),

        Studio(
            id = 2,
            name = "Mojang Studios",
            urlImage = "https://logodownload.org/wp-content/uploads/2014/02/mojang-logo-0.png"
        ),

        Studio(
            id = 3,
            name = "Santa Monica Studio",
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ66S8H3upfitnzJc3S4kxc5oyxT7icsh3-58yCgd26LA&s=10"
        ),

        Studio(
            id = 4,
            name = "Nintendo",
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtxbeQzMOkZEE0Tv3kaMSrg0S7lOJadNLzGj8w7ZeGPS-mbE26dIjEGGo&s=10"
        ),

        Studio(
            id = 5,
            name = "Rockstar Games",
            urlImage = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEW7fzrNmCk90bSAMRCtfd17VSBlGsKC89ntw-bJz3Og&s=10"
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