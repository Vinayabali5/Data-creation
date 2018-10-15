package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class StudentTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        StudentType studentType = new StudentType(code, description)
        
        assertNotNull(studentType)
        assertEquals(studentType.code, code)
        assertEquals(studentType.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        StudentType studentType = new StudentType(id, code, description)
        
        assertNotNull(studentType)
        assertEquals(studentType.id, id)
        assertEquals(studentType.code, code)
        assertEquals(studentType.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        StudentType studentType = new StudentType()
        studentType.description = 'TEST'
        
        assertEquals(studentType.description + ' (' + studentType.code + ')', studentType.toString())
    }
}
