package com.example.listaslazy.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.listaslazy.model.Game

class GameViewModel: ViewModel() {
    private val _gameList = MutableLiveData<List<Game>>()
    val gameList: LiveData<List<Game>> = _gameList

    fun onGameListChanged(newListGame: List<Game>){
        _gameList.value = newListGame
    }

}