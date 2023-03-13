package com.daalzzwi.danmat.feature_danmat.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "language")
class Language {

    constructor(
        word: String,
        notationNative: String,
        sound: String,
        nation: String
    ) {
        this.word = word
        this.notationNative = notationNative
        this.sound = sound
        this.nation = nation
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var word: String
    var notationNative: String
    var sound: String
    var nation: String
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Language

        if (word != other.word) return false
        if (notationNative != other.notationNative) return false
        if (sound != other.sound) return false
        if (nation != other.nation) return false

        return true
    }

    override fun hashCode(): Int {
        var result = word.hashCode()
        result = 31 * result + notationNative.hashCode()
        result = 31 * result + sound.hashCode()
        result = 31 * result + nation.hashCode()
        return result
    }

    override fun toString(): String {
        return "Language(word='$word', notationNative='$notationNative', sound='$sound', nation='$nation')"
    }
}

