package uk.ac.reigate.repositories.admissions

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.Person
import uk.ac.reigate.domain.academic.Student;
import uk.ac.reigate.domain.admissions.ApplicationStatus

interface ApplicationStatusRepository extends CrudRepository<ApplicationStatus, Integer>{
    
    ApplicationStatus findById(Integer id)
    
    ApplicationStatus findByCode(String code)
    
    ApplicationStatus findByDescription(String desription)
}
