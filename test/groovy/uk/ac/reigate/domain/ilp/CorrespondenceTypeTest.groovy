package uk.ac.reigate.domain.ilp;

import static org.junit.Assert.*

import org.junit.Test


public class CorrespondenceTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String type = 'T'
        String description = 'TEST'
        
        CorrespondenceType correspondenceType = new CorrespondenceType(type)
        
        assertNotNull(correspondenceType)
        assertEquals(correspondenceType.type, type)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String type = 'T'
        
        CorrespondenceType correspondenceType = new CorrespondenceType(id, type)
        
        assertNotNull(correspondenceType)
        assertEquals(correspondenceType.id, id)
        assertEquals(correspondenceType.type, type)
    }
    
    @Test
    void testMethod_ToString() {
        CorrespondenceType correspondenceType = new CorrespondenceType()
        correspondenceType.type = 'TEST'
        
        assertEquals(correspondenceType.type, correspondenceType.toString())
    }
}
