package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class YearGroupTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        YearGroup yearGroup = new YearGroup(code, description)
        
        assertNotNull(yearGroup)
        assertEquals(yearGroup.code, code)
        assertEquals(yearGroup.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        YearGroup yearGroup = new YearGroup(id, code, description)
        
        assertNotNull(yearGroup)
        assertEquals(yearGroup.id, id)
        assertEquals(yearGroup.code, code)
        assertEquals(yearGroup.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        YearGroup yearGroup = new YearGroup()
        yearGroup.description = 'TEST'
        
        assertEquals(yearGroup.description, yearGroup.toString())
    }
}
