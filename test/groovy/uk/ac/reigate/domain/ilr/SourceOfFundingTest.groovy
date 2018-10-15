package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class SourceOfFundingTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        SourceOfFunding sourceOfFunding = new SourceOfFunding(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(sourceOfFunding)
        assertEquals(sourceOfFunding.code, code)
        assertEquals(sourceOfFunding.description, description)
        assertEquals(sourceOfFunding.shortDescription, shortDescription)
        assertEquals(sourceOfFunding.validFrom, validFrom)
        assertEquals(sourceOfFunding.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        SourceOfFunding sourceOfFunding = new SourceOfFunding(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(sourceOfFunding)
        assertEquals(sourceOfFunding.id, id)
        assertEquals(sourceOfFunding.code, code)
        assertEquals(sourceOfFunding.description, description)
        assertEquals(sourceOfFunding.shortDescription, shortDescription)
        assertEquals(sourceOfFunding.validFrom, validFrom)
        assertEquals(sourceOfFunding.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        SourceOfFunding sourceOfFunding = new SourceOfFunding()
        sourceOfFunding.description = 'TEST'
        
        assertEquals(sourceOfFunding.description, sourceOfFunding.toString())
    }
}
