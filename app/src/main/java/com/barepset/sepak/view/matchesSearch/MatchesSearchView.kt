package com.barepset.sepak.view.matchesSearch

import com.barepset.sepak.model.EventsItem

interface MatchesSearchView {

    fun showLoading()
    fun hideLoading()
    fun showEmptyData()
    fun showEventList(data: MutableList<EventsItem>)
}
