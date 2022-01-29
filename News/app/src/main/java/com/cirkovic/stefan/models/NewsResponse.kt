package com.cirkovic.stefan.models


import com.cirkovic.stefan.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)