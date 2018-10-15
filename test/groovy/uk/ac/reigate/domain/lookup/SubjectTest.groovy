package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class SubjectTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        Subject subject = new Subject(code, description)
        
        assertNotNull(subject)
        assertEquals(subject.code, code)
        assertEquals(subject.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        Subject subject = new Subject(id, code, description)
        
        assertNotNull(subject)
        assertEquals(subject.id, id)
        assertEquals(subject.code, code)
        assertEquals(subject.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        Subject subject = new Subject()
        subject.description = 'TEST'
        
        assertEquals(subject.description, subject.toString())
    }
}
