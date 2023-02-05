package com.daalzzwi.danmat.feature_danmat.presentation.controller

import com.daalzzwi.danmat.feature_danmat.domain.model.Word
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WordController {

    @GetMapping("get/word")
    fun getWord(): Word {

        return Word()
    }

    @PostMapping("post/word")
    fun postWord() {



    }
}