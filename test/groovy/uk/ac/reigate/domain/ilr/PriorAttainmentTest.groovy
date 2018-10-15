package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class PriorAttainmentTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        PriorAttainment priorAttainment = new PriorAttainment(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(priorAttainment)
        assertEquals(priorAttainment.code, code)
        assertEquals(priorAttainment.description, description)
        assertEquals(priorAttainment.shortDescription, shortDescription)
        assertEquals(priorAttainment.validFrom, validFrom)
        assertEquals(priorAttainment.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        PriorAttainment priorAttainment = new PriorAttainment(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(priorAttainment)
        assertEquals(priorAttainment.id, id)
        assertEquals(priorAttainment.code, code)
        assertEquals(priorAttainment.description, description)
        assertEquals(priorAttainment.shortDescription, shortDescription)
        assertEquals(priorAttainment.validFrom, validFrom)
        assertEquals(priorAttainment.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        PriorAttainment priorAttainment = new PriorAttainment()
        priorAttainment.description = 'TEST'
        
        assertEquals(priorAttainment.description, priorAttainment.toString())
    }
}
