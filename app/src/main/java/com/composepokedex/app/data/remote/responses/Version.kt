package com.composepokedex.app.data.remote.responses
import com.google.gson.annotations.SerializedName

data class Version(
    val name: String,
    val url: String
)