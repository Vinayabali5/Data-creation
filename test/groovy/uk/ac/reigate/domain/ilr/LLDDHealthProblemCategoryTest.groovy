package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class LLDDHealthProblemCategoryTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        LLDDHealthProblemCategory lLDDHealthProblemCategory = new LLDDHealthProblemCategory(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(lLDDHealthProblemCategory)
        assertEquals(lLDDHealthProblemCategory.code, code)
        assertEquals(lLDDHealthProblemCategory.description, description)
        assertEquals(lLDDHealthProblemCategory.shortDescription, shortDescription)
        assertEquals(lLDDHealthProblemCategory.validFrom, validFrom)
        assertEquals(lLDDHealthProblemCategory.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        LLDDHealthProblemCategory lLDDHealthProblemCategory = new LLDDHealthProblemCategory(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(lLDDHealthProblemCategory)
        assertEquals(lLDDHealthProblemCategory.id, id)
        assertEquals(lLDDHealthProblemCategory.code, code)
        assertEquals(lLDDHealthProblemCategory.description, description)
        assertEquals(lLDDHealthProblemCategory.shortDescription, shortDescription)
        assertEquals(lLDDHealthProblemCategory.validFrom, validFrom)
        assertEquals(lLDDHealthProblemCategory.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        LLDDHealthProblemCategory lLDDHealthProblemCategory = new LLDDHealthProblemCategory()
        lLDDHealthProblemCategory.description = 'TEST'
        
        assertEquals(lLDDHealthProblemCategory.code + ' - ' + lLDDHealthProblemCategory.shortDescription, lLDDHealthProblemCategory.toString())
    }
}
