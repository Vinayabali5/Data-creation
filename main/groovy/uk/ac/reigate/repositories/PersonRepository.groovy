package uk.ac.reigate.repositories

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.Person

interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
    
    List<Person> findBySurname(String surname)
    
    List<Person> findBySurnameContainingIgnoreCase(String name)
    
    List<Person> findByFirstNameContainingIgnoreCase(String name)
    
    List<Person> findByMiddleNamesContainingIgnoreCase(String name)
    
    List<Person> findByPreferredNameContainingIgnoreCase(String name)
    
    List<Person> findByPreviousSurnameIgnoreCase(String surname)
    
    List<Person> findByPreviousSurnameContainingIgnoreCase(String name)
    
    List<Person> findBySurnameAndDob(String surname, Date dob)
    
    Person findByUsername(String username)
}
