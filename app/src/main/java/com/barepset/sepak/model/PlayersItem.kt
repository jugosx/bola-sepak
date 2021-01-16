package com.barepset.sepak.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlayersItem(
        val strCutout: String?,
        val strPlayer: String?,
        val strPosition: String?,
        val strWeight: String?,
        val strHeight: String?,
        val strDescriptionEN: String?,
        val strFanart1: String?) : Parcelable
