package com.daalzzwi.danmat.feature_danmat.presentation.controller

import com.daalzzwi.danmat.feature_danmat.domain.model.Language
import com.daalzzwi.danmat.feature_danmat.domain.model.Word
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RestController
class WordController {

    private var list: List<Word> = mutableListOf()

    @GetMapping("get/word")
    fun getWord(): List<Word> {

        list = makeData()
        val date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

        return list.filter { date == it.date }
    }

    @PostMapping("post/word")
    fun postWord() {



    }

    fun makeData(): List<Word> {

        var result = mutableListOf<Word>()

        for (i in 1..28) {

            val word =
                Word(
                    date = "2023-02-${if (i < 10) "0${i}" else i}",
                    saved = false,
                    language = mutableListOf(
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
            result.add(word)
        }
        return result
    }
}