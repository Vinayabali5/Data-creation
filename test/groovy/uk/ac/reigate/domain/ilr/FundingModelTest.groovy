package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class FundingModelTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        FundingModel fundingModel = new FundingModel(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(fundingModel)
        assertEquals(fundingModel.code, code)
        assertEquals(fundingModel.description, description)
        assertEquals(fundingModel.shortDescription, shortDescription)
        assertEquals(fundingModel.validFrom, validFrom)
        assertEquals(fundingModel.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        FundingModel fundingModel = new FundingModel(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(fundingModel)
        assertEquals(fundingModel.id, id)
        assertEquals(fundingModel.code, code)
        assertEquals(fundingModel.description, description)
        assertEquals(fundingModel.shortDescription, shortDescription)
        assertEquals(fundingModel.validFrom, validFrom)
        assertEquals(fundingModel.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        FundingModel fundingModel = new FundingModel()
        fundingModel.description = 'TEST'
        
        assertEquals(fundingModel.description, fundingModel.toString())
    }
}
