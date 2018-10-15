package uk.ac.reigate.domain.security;

import static org.junit.Assert.*

import org.junit.Test


public class RoleTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String roleName = 'TEST'
        
        Role role = new Role(roleName)
        
        assertNotNull(role)
        assertEquals(role.roleName, roleName)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String roleName = 'TEST'
        
        Role role = new Role(id, roleName)
        
        assertNotNull(role)
        assertEquals(role.id, id)
        assertEquals(role.roleName, roleName)
    }
    
    @Test
    void testMethod_ToString() {
        Role role = new Role()
        role.roleName = 'TEST'
        
        assertEquals(role.roleName, role.toString())
    }
}
