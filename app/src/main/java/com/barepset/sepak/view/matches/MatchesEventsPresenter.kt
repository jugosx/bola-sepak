package com.barepset.sepak.view.matches

import com.google.gson.Gson

import com.barepset.sepak.model.EventResponse
import com.barepset.sepak.model.LeagueResponse
import com.barepset.sepak.network.ApiRepository
import com.barepset.sepak.network.TheSportsDbApi

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MatchesEventsPresenter(private val view: MatchesEventsView,
                             private val apiRepository: ApiRepository,
                             private val gson: Gson) {

    fun getLeagueAll() {
        view.showLoading()

        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getLeagueAll()),
                    LeagueResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showLeagueList(data)
            }
        }
    }

    fun getEventsNext(id: String) {
        view.showLoading()

        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getEventsNext(id)),
                    EventResponse::class.java
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

    fun getEventsLast(id: String) {
        view.showLoading()

        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getEventsLast(id)),
                    EventResponse::class.java
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
