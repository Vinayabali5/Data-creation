package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class EthnicityTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Ethnicity ethnicity = new Ethnicity(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(ethnicity)
        assertEquals(ethnicity.code, code)
        assertEquals(ethnicity.description, description)
        assertEquals(ethnicity.shortDescription, shortDescription)
        assertEquals(ethnicity.validFrom, validFrom)
        assertEquals(ethnicity.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Ethnicity ethnicity = new Ethnicity(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(ethnicity)
        assertEquals(ethnicity.id, id)
        assertEquals(ethnicity.code, code)
        assertEquals(ethnicity.description, description)
        assertEquals(ethnicity.shortDescription, shortDescription)
        assertEquals(ethnicity.validFrom, validFrom)
        assertEquals(ethnicity.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        Ethnicity ethnicity = new Ethnicity()
        ethnicity.description = 'TEST'
        
        assertEquals(ethnicity.description, ethnicity.toString())
    }
}
