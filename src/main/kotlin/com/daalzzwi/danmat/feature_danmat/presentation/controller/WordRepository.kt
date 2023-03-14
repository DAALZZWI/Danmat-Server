package com.daalzzwi.danmat.feature_danmat.presentation.controller


import com.daalzzwi.danmat.feature_danmat.domain.model.Word
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

//package com.daalzzwi.danmat.feature_danmat.presentation.controller
//
//import com.daalzzwi.danmat.feature_danmat.domain.model.Word
//import org.springframework.data.jpa.repository.JpaRepository
//import org.springframework.stereotype.Repository
//
interface WordRepository : JpaRepository<Word, Long> {

    fun findByDate(date: String): List<Word>
}
//    save(S) : 새로운 엔티티는 저장하고 이미 있는 엔티티는 병합한다.
//    → 엔티티에 식별자 값이 없으면(null이면) em.persist()를 호출, 식별자 값이 있으면 이미 있는 엔티티라 판단하여 em.merge() 호출
//    delete(T) : 엔티티 하나를 삭제한다. 내부에서 EntityManager.remove() 호출
//    findById(ID) : 엔티티 하나를 조회한다. 내부에서 EntityManager.find() 호출
//    getOne(ID) : 엔티티를 프록시로 조회한다. 내부에서 EntityManager.getReference() 호출
//    findAll(…) : 모든 엔티티를 조회한다. 정렬( Sort )이나 페이징( Pageable ) 조건을 파라미터로 제공할 수 있다.
