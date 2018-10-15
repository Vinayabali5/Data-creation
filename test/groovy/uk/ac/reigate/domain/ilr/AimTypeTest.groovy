package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class AimTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        AimType aimType = new AimType(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(aimType)
        assertEquals(aimType.code, code)
        assertEquals(aimType.description, description)
        assertEquals(aimType.shortDescription, shortDescription)
        assertEquals(aimType.validFrom, validFrom)
        assertEquals(aimType.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        AimType aimType = new AimType(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(aimType)
        assertEquals(aimType.id, id)
        assertEquals(aimType.code, code)
        assertEquals(aimType.description, description)
        assertEquals(aimType.shortDescription, shortDescription)
        assertEquals(aimType.validFrom, validFrom)
        assertEquals(aimType.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        AimType aimType = new AimType()
        aimType.description = 'TEST'
        
        assertEquals(aimType.description, aimType.toString())
    }
}
