package uk.ac.reigate.repositories.lookup

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.lookup.Gender;

interface GenderRepository extends CrudRepository<Gender, Integer> {
    
    Gender findById(Integer id)
    
    List<Gender> findAll()
    
    Gender findByCode(String code)
}
