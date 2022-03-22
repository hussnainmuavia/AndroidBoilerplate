package com.android.opensooq.core.models.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class SearchResult (
    @SerializedName("data")
    @Expose
    var data: Data? = null
)