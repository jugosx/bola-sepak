package com.barepset.sepak.view.matchesSearch

import com.google.gson.Gson

import com.barepset.sepak.model.EventSearchResponse
import com.barepset.sepak.network.ApiRepository
import com.barepset.sepak.network.TheSportsDbApi

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MatchesSearchPresenter(private val view: MatchesSearchView,
                             private val apiRepository: ApiRepository,
                             private val gson: Gson) {

    fun getEventsSearch(eventName: String = "") {
        view.showLoading()

        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getEventsSearch(eventName)),
                    EventSearchResponse::class.java
            )

            uiThread {
                view.hideLoading()

                try {
                    view.showEventList(data.events)
                } catch (e: Exception) {
                    view.showEmptyData()
                }
            }
        }
    }
}
