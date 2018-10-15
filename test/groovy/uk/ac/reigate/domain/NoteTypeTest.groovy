package uk.ac.reigate.domain;

import static org.junit.Assert.*

import org.junit.Test


public class NoteTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        NoteType noteType = new NoteType(code, description)
        
        assertNotNull(noteType)
        assertEquals(noteType.code, code)
        assertEquals(noteType.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        NoteType noteType = new NoteType(id, code, description)
        
        assertNotNull(noteType)
        assertEquals(noteType.id, id)
        assertEquals(noteType.code, code)
        assertEquals(noteType.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        NoteType noteType = new NoteType()
        noteType.description = 'TEST'
        
        assertEquals(noteType.description, noteType.toString())
    }
}
