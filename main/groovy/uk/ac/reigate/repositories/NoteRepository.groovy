package uk.ac.reigate.repositories

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.Note

interface NoteRepository extends CrudRepository<Note, Integer> {
    
    Note findById (Integer id)
    
    List<Note> findByPerson_Id(Integer personId)
}
