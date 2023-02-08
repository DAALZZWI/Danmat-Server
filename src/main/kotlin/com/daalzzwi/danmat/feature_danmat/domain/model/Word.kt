package com.daalzzwi.danmat.feature_danmat.domain.model

import com.fasterxml.jackson.annotation.JsonRootName
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

data class Word(
    var date: String = "",
    var saved: Boolean = false,
    var language: List<Language> = emptyList<Language>()
)