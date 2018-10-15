package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class StudentRemarkPermissionTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        StudentRemarkPermission studentRemarkPermission = new StudentRemarkPermission(code, description)
        
        assertNotNull(studentRemarkPermission)
        assertEquals(studentRemarkPermission.code, code)
        assertEquals(studentRemarkPermission.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        StudentRemarkPermission studentRemarkPermission = new StudentRemarkPermission(id, code, description)
        
        assertNotNull(studentRemarkPermission)
        assertEquals(studentRemarkPermission.id, id)
        assertEquals(studentRemarkPermission.code, code)
        assertEquals(studentRemarkPermission.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        StudentRemarkPermission studentRemarkPermission = new StudentRemarkPermission()
        studentRemarkPermission.code = 'T'
        
        assertEquals(studentRemarkPermission.code, studentRemarkPermission.toString())
    }
}
