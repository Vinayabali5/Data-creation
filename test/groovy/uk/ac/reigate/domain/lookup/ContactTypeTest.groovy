package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class ContactTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String name = 'T'
        String description = 'TEST'
        
        ContactType contactType = new ContactType(name, description)
        
        assertNotNull(contactType)
        assertEquals(contactType.name, name)
        assertEquals(contactType.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String name = 'T'
        String description = 'TEST'
        
        ContactType contactType = new ContactType(id, name, description)
        
        assertNotNull(contactType)
        assertEquals(contactType.id, id)
        assertEquals(contactType.name, name)
        assertEquals(contactType.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        ContactType contactType = new ContactType()
        contactType.description = 'TEST'
        
        assertEquals(contactType.description, contactType.toString())
    }
}
