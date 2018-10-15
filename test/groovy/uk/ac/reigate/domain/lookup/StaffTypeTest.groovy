package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class StaffTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        Boolean needInitials = true
        StaffType staffType = new StaffType(code, description, needInitials)
        
        assertNotNull(staffType)
        assertEquals(staffType.code, code)
        assertEquals(staffType.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        Boolean needInitials = true
        StaffType staffType = new StaffType(id, code, description, needInitials)
        
        assertNotNull(staffType)
        assertEquals(staffType.id, id)
        assertEquals(staffType.code, code)
        assertEquals(staffType.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        StaffType staffType = new StaffType()
        staffType.description = 'TEST'
        
        assertEquals(staffType.description, staffType.toString())
    }
}
