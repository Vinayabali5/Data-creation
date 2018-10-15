package uk.ac.reigate.domain.admissions;

import static org.junit.Assert.*

import org.junit.Test


public class OfferTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String descriptionString = 'TEST'
        
        
        OfferType offerType = new OfferType(code, descriptionString)
        
        assertNotNull(offerType)
        assertEquals(offerType.code, code)
        assertEquals(offerType.description, descriptionString)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String descriptionString = 'TEST'
        Boolean considerWithdrawn = true
        
        OfferType offerType = new OfferType(id, code, descriptionString)
        
        assertNotNull(offerType)
        assertEquals(offerType.id, id)
        assertEquals(offerType.code, code)
        assertEquals(offerType.description, descriptionString)
    }
    
    @Test
    void testMethod_ToString() {
        OfferType offerType = new OfferType()
        offerType.code = 'T'
        offerType.description = 'TEST'
        
        assertEquals(offerType.description + ' (' + offerType.code + ')', offerType.toString())
    }
}
