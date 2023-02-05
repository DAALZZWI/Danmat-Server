package com.daalzzwi.danmat.feature_danmat.domain.model

data class Word(
    val date: String = "",
    val saved: Boolean = false,
    val language: List<Language> = emptyList<Language>()
)