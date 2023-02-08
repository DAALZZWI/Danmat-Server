package com.daalzzwi.danmat.feature_danmat.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

data class Language(
    val word: String = "",
    val notationNative: String = "",
    val sound: String = "",
    val nation: String = "",
    val flag: String = ""
)