package uk.ac.reigate.domain.ilp;

import static org.junit.Assert.*

import org.junit.Test


public class LetterTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String type = 'T'
        String description = 'TEST'
        
        LetterType correspondenceType = new LetterType(type)
        
        assertNotNull(correspondenceType)
        assertEquals(correspondenceType.type, type)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String type = 'T'
        
        LetterType correspondenceType = new LetterType(id, type)
        
        assertNotNull(correspondenceType)
        assertEquals(correspondenceType.id, id)
        assertEquals(correspondenceType.type, type)
    }
    
    @Test
    void testMethod_ToString() {
        LetterType correspondenceType = new LetterType()
        correspondenceType.type = 'TEST'
        
        assertEquals(correspondenceType.type, correspondenceType.toString())
    }
}
