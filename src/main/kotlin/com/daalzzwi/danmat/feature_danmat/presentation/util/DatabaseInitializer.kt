package com.daalzzwi.danmat.feature_danmat.presentation.util

import com.daalzzwi.danmat.feature_danmat.domain.model.Language
import com.daalzzwi.danmat.feature_danmat.domain.model.Word
import com.daalzzwi.danmat.feature_danmat.presentation.controller.WordRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DatabaseInitializer(
    @Autowired private val repository: WordRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {

        val words = makeData()

//        repository.saveAll(words)
    }
}

fun makeData(): List<Word> {

    var list = mutableListOf<Word>()

    for (i in 1..31) {

        val word =
            Word(
                date = "2023-03-${if(i < 10) "0${i}" else i}" ,
                saved = false,
                language = listOf(
                    Language(
                        nation = "kr",
                        word = "가치 ${i}",
                        notationNative = "ga chi",
                        sound = ""
                    ),
                    Language(
                        nation = "cn",
                        word = "价值",
                        notationNative = "jià zhí",
                        sound = ""
                    ),
                    Language(
                        nation = "jp",
                        word = "価値",
                        notationNative = "ka chi",
                        sound = ""
                    ),
                    Language(
                        nation = "us",
                        word = "value",
                        notationNative = "value",
                        sound = ""
                    ),
                    Language(
                        nation = "pt",
                        word = "valor",
                        notationNative = "valor",
                        sound = ""
                    ),
                    Language(
                        nation = "fr",
                        word = "valeur",
                        notationNative = "valeur",
                        sound = ""
                    ),
                )
            )
        list.add(word)
    }

    return list
}