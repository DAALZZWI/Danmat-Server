package com.daalzzwi.danmat.feature_danmat.presentation.controller


import com.daalzzwi.danmat.feature_danmat.domain.model.Word
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
@Service
class WordService(
    private val wordRepository: WordRepository
) {
    fun getWord(): List<Word> {

        val date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

        return wordRepository.findByDate(date)
    }
}