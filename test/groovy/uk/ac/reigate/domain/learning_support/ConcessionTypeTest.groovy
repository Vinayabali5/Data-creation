package uk.ac.reigate.domain.learning_support;

import static org.junit.Assert.*

import org.junit.Test


public class ConcessionTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        ConcessionType concessionType = new ConcessionType(code, description)
        
        assertNotNull(concessionType)
        assertEquals(concessionType.code, code)
        assertEquals(concessionType.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        ConcessionType concessionType = new ConcessionType(id, code, description)
        
        assertNotNull(concessionType)
        assertEquals(concessionType.id, id)
        assertEquals(concessionType.code, code)
        assertEquals(concessionType.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        ConcessionType concessionType = new ConcessionType()
        concessionType.description = 'TEST'
        
        assertEquals(concessionType.description, concessionType.toString())
    }
}
