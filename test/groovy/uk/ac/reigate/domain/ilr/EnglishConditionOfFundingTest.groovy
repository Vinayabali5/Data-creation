package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class EnglishConditionOfFundingTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        EnglishConditionOfFunding englishConditionOfFunding = new EnglishConditionOfFunding(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(englishConditionOfFunding)
        assertEquals(englishConditionOfFunding.code, code)
        assertEquals(englishConditionOfFunding.description, description)
        assertEquals(englishConditionOfFunding.shortDescription, shortDescription)
        assertEquals(englishConditionOfFunding.validFrom, validFrom)
        assertEquals(englishConditionOfFunding.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        EnglishConditionOfFunding englishConditionOfFunding = new EnglishConditionOfFunding(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(englishConditionOfFunding)
        assertEquals(englishConditionOfFunding.id, id)
        assertEquals(englishConditionOfFunding.code, code)
        assertEquals(englishConditionOfFunding.description, description)
        assertEquals(englishConditionOfFunding.shortDescription, shortDescription)
        assertEquals(englishConditionOfFunding.validFrom, validFrom)
        assertEquals(englishConditionOfFunding.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        EnglishConditionOfFunding englishConditionOfFunding = new EnglishConditionOfFunding()
        englishConditionOfFunding.description = 'TEST'
        
        assertEquals(englishConditionOfFunding.description, englishConditionOfFunding.toString())
    }
}
