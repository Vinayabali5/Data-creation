package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class SchoolPriorityTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        SchoolPriority schoolPriority = new SchoolPriority(code, description)
        
        assertNotNull(schoolPriority)
        assertEquals(schoolPriority.code, code)
        assertEquals(schoolPriority.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        SchoolPriority schoolPriority = new SchoolPriority(id, code, description)
        
        assertNotNull(schoolPriority)
        assertEquals(schoolPriority.id, id)
        assertEquals(schoolPriority.code, code)
        assertEquals(schoolPriority.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        SchoolPriority schoolPriority = new SchoolPriority()
        schoolPriority.description = 'TEST'
        
        assertEquals(schoolPriority.description + ' (' + schoolPriority.code + ')', schoolPriority.toString())
    }
}
