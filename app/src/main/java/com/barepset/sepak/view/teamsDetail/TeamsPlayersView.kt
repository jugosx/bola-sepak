package com.barepset.sepak.view.teamsDetail

import com.barepset.sepak.model.PlayersItem

interface TeamsPlayersView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showPlayerList(data: MutableList<PlayersItem>)
}
