package uk.ac.reigate.repositories.exam

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.exam.StatusType;

interface StatusTypeRepository extends CrudRepository<StatusType, Integer> {
    
    StatusType findById(Integer id)
    
    List<StatusType> findAll()
    
    StatusType findByCode(String code)
}
