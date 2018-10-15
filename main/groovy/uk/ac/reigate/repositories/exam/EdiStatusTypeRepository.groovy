package uk.ac.reigate.repositories.exam

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.exam.EdiStatusType;

interface EdiStatusTypeRepository extends CrudRepository<EdiStatusType, Integer> {
    
    EdiStatusType findById(Integer id)
    
    List<EdiStatusType> findAll()
    
    EdiStatusType findByCode(String code)
}
