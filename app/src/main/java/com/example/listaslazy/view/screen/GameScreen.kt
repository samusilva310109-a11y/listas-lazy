package com.example.listaslazy.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listaslazy.repository.getAllCategories
import com.example.listaslazy.repository.getAllStudios
import com.example.listaslazy.repository.getGamesByNameOrStudioOrCategory
import com.example.listaslazy.repository.getStudios
import com.example.listaslazy.view.components.CategorCard
import com.example.listaslazy.view.components.GameCard
import com.example.listaslazy.view.components.StudioCard


@Composable
fun GameScreen(modifier: Modifier = Modifier) {
    var search by remember {
        mutableStateOf("")
    }

    var gamesList by remember {
        mutableStateOf(getGamesByNameOrStudioOrCategory(""))
    }

    var studiosList by remember {
        mutableStateOf(getAllStudios())
    }

    var categories by remember {
        mutableStateOf(getAllCategories())
    }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Column(
            Modifier.padding(15.dp)
        ) {
            // FIXO
            Text(
                text = "Explore",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Descubra novos conteúdos e salve seus favoritos",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(Modifier.height(4.dp))

            OutlinedTextField(
                value = search,
                onValueChange = {
                    search = it
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Nome do estúdio")
                },
                placeholder = {
                    Text("Buscar por título, gênero ou estúdio...")
                },
                colors =
                    OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF4952b1),
                        focusedLabelColor = Color(0xFF4952b1),
                        unfocusedBorderColor = Color(0xFF37465e),
                        unfocusedLabelColor = Color(0xFF37465e),
                        focusedPlaceholderColor = Color(0xFF37465e),
                        focusedTextColor = Color.Black
                    )
                ,
                shape = RoundedCornerShape(16.dp),
                trailingIcon = {
                    IconButton(
                        onClick = {
                            gamesList = getGamesByNameOrStudioOrCategory(search)
                            studiosList = getStudios(search)
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Pesquisar"
                        )
                    }
                }
            )
        }



        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        ) {

            item {
                Text(
                    text = "Categorias",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }

            item {
                LazyRow(Modifier.padding(vertical = 10.dp,)) {
                    items(getAllCategories()) {
                        CategorCard(category = it)
                    }
                }
            }


            item {
                Spacer(Modifier.height(20.dp))
                Text(
                    text = "Estúdios",
                    fontSize = 20.sp,
                    color = Color.Black
                )

                Spacer(Modifier.height(4.dp))
            }



            item {
                LazyRow(Modifier.padding(bottom = 10.dp))  {
                    items(studiosList) {
                        StudioCard(studio = it)
                    }
                }
            }

            items(gamesList) {
                GameCard(it)
            }
        }
    }
}