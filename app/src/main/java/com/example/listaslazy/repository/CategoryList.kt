package com.example.listaslazy.repository

import com.example.listaslazy.model.Category
import com.example.listaslazy.model.CategoryIcon

fun getAllCategories(): List<Category>{
    return listOf(
        Category(id = 1, name = "RPG", icon = CategoryIcon.RPG),
        Category(id = 2, name = "Ação", icon = CategoryIcon.ACTION),
        Category(id = 3, name = "Aventura", icon = CategoryIcon.ADVENTURE),
        Category(id = 4, name = "Corrida", icon = CategoryIcon.RACING),
        Category(id = 5, name = "Esportes", icon = CategoryIcon.SPORT),
        Category(id = 6, name = "Terror", icon = CategoryIcon.HORROR),
        Category(id = 7, name = "Puzzle", icon = CategoryIcon.PUZZLE),
        Category(id = 8, name = "Plataforma", icon = CategoryIcon.PLATFORM),
        Category(id = 9, name = "Estratégia", icon = CategoryIcon.STRATEGY),
        Category(id = 10, name = "Simulação", icon = CategoryIcon.SIMULATION),
        Category(id = 11, name = "Luta", icon = CategoryIcon.FIGHTING),
        Category(id = 12, name = "Tiro", icon = CategoryIcon.SHOOTER),
        Category(id = 13, name = "Sobrevivência", icon = CategoryIcon.SURVIVAL)
    )
}