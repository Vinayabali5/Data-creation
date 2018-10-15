package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class GenderTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        Gender gender = new Gender(code, description)
        
        assertNotNull(gender)
        assertEquals(gender.code, code)
        assertEquals(gender.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        Gender gender = new Gender(id, code, description)
        
        assertNotNull(gender)
        assertEquals(gender.id, id)
        assertEquals(gender.code, code)
        assertEquals(gender.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        Gender gender = new Gender()
        gender.description = 'TEST'
        
        assertEquals(gender.description, gender.toString())
    }
}
