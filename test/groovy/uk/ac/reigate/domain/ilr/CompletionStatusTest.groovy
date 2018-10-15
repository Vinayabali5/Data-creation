package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class CompletionStatusTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        CompletionStatus completionStatus = new CompletionStatus(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(completionStatus)
        assertEquals(completionStatus.code, code)
        assertEquals(completionStatus.description, description)
        assertEquals(completionStatus.shortDescription, shortDescription)
        assertEquals(completionStatus.validFrom, validFrom)
        assertEquals(completionStatus.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        CompletionStatus completionStatus = new CompletionStatus(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(completionStatus)
        assertEquals(completionStatus.id, id)
        assertEquals(completionStatus.code, code)
        assertEquals(completionStatus.description, description)
        assertEquals(completionStatus.shortDescription, shortDescription)
        assertEquals(completionStatus.validFrom, validFrom)
        assertEquals(completionStatus.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        CompletionStatus completionStatus = new CompletionStatus()
        completionStatus.description = 'TEST'
        
        assertEquals(completionStatus.description, completionStatus.toString())
    }
}
