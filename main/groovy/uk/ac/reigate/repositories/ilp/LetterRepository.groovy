package uk.ac.reigate.repositories.ilp

import java.util.List;

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.ilp.Letter


interface LetterRepository extends CrudRepository<Letter, Integer> {
    
    List<Letter> findByStudent_Id(Integer studentId)
    
    Letter findByStudent_IdAndId(Integer studentId, Integer Id)
}
