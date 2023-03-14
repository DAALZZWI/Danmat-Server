package com.daalzzwi.danmat.feature_danmat.domain.model

import jakarta.persistence.*

@Entity
class Word(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var uuid: Long = 0,
        var date: String,
        var saved: Boolean,
        @ManyToOne
        var language: MutableList<Language>
)
//
//class Word {
//

//    constructor(
//        date: String,
//        saved: Boolean,
//        language: List<Language>
//    ) {
//
//        this.date = date
//        this.saved = saved
//        this.language = emptyList()
//    }
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    var uuid: Long = 0
//
//    var date: String
//
//    var saved: Boolean
//
//    @OneToMany(orphanRemoval = false)
//    var language: List<Language>
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as Word
//
//        if (date != other.date) return false
//        if (saved != other.saved) return false
//        if (language != other.language) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = date.hashCode()
//        result = 31 * result + saved.hashCode()
//        result = 31 * result + language.hashCode()
//        return result
//    }
//
//    override fun toString(): String {
//        return "Word(date='$date', saved=$saved, language=$language)"
//    }

