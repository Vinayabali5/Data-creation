package uk.ac.reigate.domain;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.CourseGroup;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject


public class NoteTest {
    
    Person createPerson() {
        Person person = new Person()
    }
    
    NoteType createNoteType() {
        NoteType type = new NoteType()
    }
    
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Person person = createPerson()
        NoteType type = createNoteType()
        String note = 'test'
        
        Note notes = new Note(person, note, type)
        
        assertNotNull(notes)
        assertEquals(notes.person.id, person.id)
        assertEquals(notes.type.id, type.id)
        assertEquals(notes.note, note)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Person person = createPerson()
        NoteType type = createNoteType()
        String note = 'test'
        
        Note notes = new Note(id, person, note, type)
        
        assertNotNull(notes)
        assertEquals(notes.person.id, person.id)
        assertEquals(notes.type.id, type.id)
        assertEquals(notes.note, note)
    }
    
    @Test
    void testMethod_ToString() {
        Note contacte = new Note()
        
        assertEquals(contacte.note, contacte.toString())
    }
}
