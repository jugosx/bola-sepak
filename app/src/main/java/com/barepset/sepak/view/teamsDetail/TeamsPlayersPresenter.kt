package com.barepset.sepak.view.teamsDetail

import com.google.gson.Gson

import com.barepset.sepak.model.PlayersResponse
import com.barepset.sepak.network.ApiRepository
import com.barepset.sepak.network.TheSportsDbApi

import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class TeamsPlayersPresenter(private val view: TeamsPlayersView,
                            private val apiRepository: ApiRepository,
                            private val gson: Gson) {

    fun getPlayerAll(teamName: String = "") {
        view.showLoading()

        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportsDbApi.getPlayerAll(teamName)),
                    PlayersResponse::class.java
            )

            uiThread {
                view.hideLoading()

                try {
                    view.showPlayerList(data.player)
                } catch (e: Exception) {
                    view.showEmptyData()
                }
            }
        }
    }
}
