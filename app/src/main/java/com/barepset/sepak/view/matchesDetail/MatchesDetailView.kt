package com.barepset.sepak.view.matchesDetail

import com.barepset.sepak.model.TeamsItem

interface MatchesDetailView {

    fun showLoading()
    fun hideLoading()
    fun showTeamDetail(dataHomeTeam: MutableList<TeamsItem>, dataAwayTeam: MutableList<TeamsItem>)
}
