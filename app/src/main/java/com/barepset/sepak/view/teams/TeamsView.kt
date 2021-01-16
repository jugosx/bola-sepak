package com.barepset.sepak.view.teams

import com.barepset.sepak.model.LeagueResponse
import com.barepset.sepak.model.TeamsItem

interface TeamsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showTeamList(data: MutableList<TeamsItem>)
}
