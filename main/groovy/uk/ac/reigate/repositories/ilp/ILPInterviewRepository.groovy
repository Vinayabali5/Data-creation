package uk.ac.reigate.repositories.ilp

import java.util.List;

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.ilp.ILPInterview


interface ILPInterviewRepository extends CrudRepository<ILPInterview, Integer> {
    
    List<ILPInterview> findByStudent_Id(Integer studentId)
    
    List<ILPInterview> findByStudent_IdAndPrivateEntry(Integer studentId, Boolean privateEntry)
    
    ILPInterview findByStudent_IdAndId(Integer studentId, Integer Id)
}
