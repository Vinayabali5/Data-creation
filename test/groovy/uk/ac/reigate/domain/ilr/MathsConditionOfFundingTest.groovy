package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class MathsConditionOfFundingTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        MathsConditionOfFunding mathsConditionOfFunding = new MathsConditionOfFunding(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(mathsConditionOfFunding)
        assertEquals(mathsConditionOfFunding.code, code)
        assertEquals(mathsConditionOfFunding.description, description)
        assertEquals(mathsConditionOfFunding.shortDescription, shortDescription)
        assertEquals(mathsConditionOfFunding.validFrom, validFrom)
        assertEquals(mathsConditionOfFunding.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        MathsConditionOfFunding mathsConditionOfFunding = new MathsConditionOfFunding(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(mathsConditionOfFunding)
        assertEquals(mathsConditionOfFunding.id, id)
        assertEquals(mathsConditionOfFunding.code, code)
        assertEquals(mathsConditionOfFunding.description, description)
        assertEquals(mathsConditionOfFunding.shortDescription, shortDescription)
        assertEquals(mathsConditionOfFunding.validFrom, validFrom)
        assertEquals(mathsConditionOfFunding.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        MathsConditionOfFunding mathsConditionOfFunding = new MathsConditionOfFunding()
        mathsConditionOfFunding.description = 'TEST'
        
        assertEquals(mathsConditionOfFunding.description, mathsConditionOfFunding.toString())
    }
}
