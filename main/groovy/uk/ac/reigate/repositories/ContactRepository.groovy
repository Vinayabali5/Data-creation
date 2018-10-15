package uk.ac.reigate.repositories

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.Contact
import uk.ac.reigate.domain.Person

interface ContactRepository extends CrudRepository<Contact, Integer>{
    
    Contact findById(Integer id)
    
    List<Contact> findByPerson(Person person)
    
    List<Contact> findByPerson_Id(Integer personId)
}
