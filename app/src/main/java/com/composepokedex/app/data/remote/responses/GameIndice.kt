package com.composepokedex.app.data.remote.responses
import com.google.gson.annotations.SerializedName
data class GameIndice(
    @SerializedName("game_index")
    val gameIndex: Int,
    val version: Version
)