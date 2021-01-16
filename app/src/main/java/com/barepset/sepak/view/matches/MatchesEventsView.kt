package com.barepset.sepak.view.matches

import com.barepset.sepak.model.EventsItem
import com.barepset.sepak.model.LeagueResponse

interface MatchesEventsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showLeagueList(data: LeagueResponse)
    fun showEventList(data: MutableList<EventsItem>)
}
