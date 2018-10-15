package uk.ac.reigate.repositories.academic

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.academic.Faculty

interface FacultyRepository extends CrudRepository<Faculty, Integer> {
    
    Faculty findByCode(String code)
}
