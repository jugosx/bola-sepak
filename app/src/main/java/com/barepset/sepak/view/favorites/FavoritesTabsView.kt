package com.barepset.sepak.view.favorites

import com.barepset.sepak.model.EventsItem
import com.barepset.sepak.model.TeamsItem

interface FavoritesTabsView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
    fun showTeamList(data: MutableList<TeamsItem>)
}
