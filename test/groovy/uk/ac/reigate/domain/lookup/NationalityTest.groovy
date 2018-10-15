package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class NationalityTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String name = 'T'
        String description = 'TEST'
        
        Nationality nationality = new Nationality(name, description)
        
        assertNotNull(nationality)
        assertEquals(nationality.name, name)
        assertEquals(nationality.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String name = 'T'
        String description = 'TEST'
        
        Nationality nationality = new Nationality(id, name, description)
        
        assertNotNull(nationality)
        assertEquals(nationality.id, id)
        assertEquals(nationality.name, name)
        assertEquals(nationality.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        Nationality nationality = new Nationality()
        nationality.description = 'TEST'
        
        assertEquals(nationality.description, nationality.toString())
    }
}
