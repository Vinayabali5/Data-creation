package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class LLDDHealthProblemTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        LLDDHealthProblem lLDDHealthProblem = new LLDDHealthProblem(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(lLDDHealthProblem)
        assertEquals(lLDDHealthProblem.code, code)
        assertEquals(lLDDHealthProblem.description, description)
        assertEquals(lLDDHealthProblem.shortDescription, shortDescription)
        assertEquals(lLDDHealthProblem.validFrom, validFrom)
        assertEquals(lLDDHealthProblem.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        LLDDHealthProblem lLDDHealthProblem = new LLDDHealthProblem(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(lLDDHealthProblem)
        assertEquals(lLDDHealthProblem.id, id)
        assertEquals(lLDDHealthProblem.code, code)
        assertEquals(lLDDHealthProblem.description, description)
        assertEquals(lLDDHealthProblem.shortDescription, shortDescription)
        assertEquals(lLDDHealthProblem.validFrom, validFrom)
        assertEquals(lLDDHealthProblem.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        LLDDHealthProblem lLDDHealthProblem = new LLDDHealthProblem()
        lLDDHealthProblem.description = 'TEST'
        
        assertEquals(lLDDHealthProblem.code + ' - ' + lLDDHealthProblem.shortDescription, lLDDHealthProblem.toString())
    }
}
