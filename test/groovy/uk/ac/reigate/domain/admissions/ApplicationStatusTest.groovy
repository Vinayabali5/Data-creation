package uk.ac.reigate.domain.admissions;

import static org.junit.Assert.*

import org.junit.Test


public class ApplicationStatusTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String descriptionString = 'TEST'
        Boolean considerWithdrawn = true
        
        
        ApplicationStatus applicationStatus = new ApplicationStatus(code, descriptionString, considerWithdrawn)
        
        assertNotNull(applicationStatus)
        assertEquals(applicationStatus.code, code)
        assertEquals(applicationStatus.description, descriptionString)
        assertEquals(applicationStatus.considerWithdrawn, considerWithdrawn)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String descriptionString = 'TEST'
        Boolean considerWithdrawn = true
        
        ApplicationStatus applicationStatus = new ApplicationStatus(id, code, descriptionString, considerWithdrawn)
        
        assertNotNull(applicationStatus)
        assertEquals(applicationStatus.id, id)
        assertEquals(applicationStatus.code, code)
        assertEquals(applicationStatus.description, descriptionString)
        assertEquals(applicationStatus.considerWithdrawn, considerWithdrawn)
    }
    
    @Test
    void testMethod_ToString() {
        ApplicationStatus applicationStatus = new ApplicationStatus()
        applicationStatus.description = 'TEST'
        
        assertEquals(applicationStatus.description, applicationStatus.toString())
    }
}
