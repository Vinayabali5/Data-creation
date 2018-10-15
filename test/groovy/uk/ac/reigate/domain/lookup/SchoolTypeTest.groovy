package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class SchoolTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        SchoolType schoolType = new SchoolType(code, description)
        
        assertNotNull(schoolType)
        assertEquals(schoolType.code, code)
        assertEquals(schoolType.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        SchoolType schoolType = new SchoolType(id, code, description)
        
        assertNotNull(schoolType)
        assertEquals(schoolType.id, id)
        assertEquals(schoolType.code, code)
        assertEquals(schoolType.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        SchoolType schoolType = new SchoolType()
        schoolType.code = 'T'
        
        assertEquals(schoolType.code, schoolType.toString())
    }
}
