package uk.ac.reigate.domain.ilp;

import static org.junit.Assert.*

import org.junit.Test


public class ILPInterviewTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String type = 'T'
        String description = 'TEST'
        
        ILPInterviewType iLPInterviewType = new ILPInterviewType(type)
        
        assertNotNull(iLPInterviewType)
        assertEquals(iLPInterviewType.type, type)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String type = 'T'
        
        ILPInterviewType iLPInterviewType = new ILPInterviewType(id, type)
        
        assertNotNull(iLPInterviewType)
        assertEquals(iLPInterviewType.id, id)
        assertEquals(iLPInterviewType.type, type)
    }
    
    @Test
    void testMethod_ToString() {
        ILPInterviewType iLPInterviewType = new ILPInterviewType()
        iLPInterviewType.type = 'TEST'
        
        assertEquals(iLPInterviewType.type, iLPInterviewType.toString())
    }
}
