package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class TitleTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        Title title = new Title(code, description)
        
        assertNotNull(title)
        assertEquals(title.code, code)
        assertEquals(title.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        Title title = new Title(id, code, description)
        
        assertNotNull(title)
        assertEquals(title.id, id)
        assertEquals(title.code, code)
        assertEquals(title.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        Title title = new Title()
        title.description = 'TEST'
        
        assertEquals(title.description, title.toString())
    }
}
