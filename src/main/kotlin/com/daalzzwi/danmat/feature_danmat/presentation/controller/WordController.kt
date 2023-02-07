package com.daalzzwi.danmat.feature_danmat.presentation.controller

import com.daalzzwi.danmat.feature_danmat.domain.model.Word
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WordController {

    private lateinit var service: WordService

    init {
        service = WordService()
    }

    @GetMapping("get/word")
    fun getWord(): Word {

        return service.getWord()
    }

    @PostMapping("post/word")
    fun postWord() {



    }
}