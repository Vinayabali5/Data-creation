package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class RestrictedUseIndicatorTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        RestrictedUseIndicator restrictedUseIndicator = new RestrictedUseIndicator(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(restrictedUseIndicator)
        assertEquals(restrictedUseIndicator.code, code)
        assertEquals(restrictedUseIndicator.description, description)
        assertEquals(restrictedUseIndicator.shortDescription, shortDescription)
        assertEquals(restrictedUseIndicator.validFrom, validFrom)
        assertEquals(restrictedUseIndicator.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        RestrictedUseIndicator restrictedUseIndicator = new RestrictedUseIndicator(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(restrictedUseIndicator)
        assertEquals(restrictedUseIndicator.id, id)
        assertEquals(restrictedUseIndicator.code, code)
        assertEquals(restrictedUseIndicator.description, description)
        assertEquals(restrictedUseIndicator.shortDescription, shortDescription)
        assertEquals(restrictedUseIndicator.validFrom, validFrom)
        assertEquals(restrictedUseIndicator.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        RestrictedUseIndicator restrictedUseIndicator = new RestrictedUseIndicator()
        restrictedUseIndicator.description = 'TEST'
        
        assertEquals(restrictedUseIndicator.description, restrictedUseIndicator.toString())
    }
}
