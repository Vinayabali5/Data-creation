package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class OutcomeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Outcome outcome = new Outcome(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(outcome)
        assertEquals(outcome.code, code)
        assertEquals(outcome.description, description)
        assertEquals(outcome.shortDescription, shortDescription)
        assertEquals(outcome.validFrom, validFrom)
        assertEquals(outcome.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Outcome outcome = new Outcome(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(outcome)
        assertEquals(outcome.id, id)
        assertEquals(outcome.code, code)
        assertEquals(outcome.description, description)
        assertEquals(outcome.shortDescription, shortDescription)
        assertEquals(outcome.validFrom, validFrom)
        assertEquals(outcome.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        Outcome outcome = new Outcome()
        outcome.description = 'TEST'
        
        assertEquals(outcome.description, outcome.toString())
    }
}
