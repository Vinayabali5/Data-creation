package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class CentralMonitoringTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String warningColour = 'red'
        
        CentralMonitoring centralMonitoring = new CentralMonitoring(code, description, warningColour)
        
        assertNotNull(centralMonitoring)
        assertEquals(centralMonitoring.code, code)
        assertEquals(centralMonitoring.description, description)
        assertEquals(centralMonitoring.warningColour, warningColour)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String warningColour = 'red'
        
        CentralMonitoring centralMonitoring = new CentralMonitoring(id, code, description, warningColour)
        
        assertNotNull(centralMonitoring)
        assertEquals(centralMonitoring.id, id)
        assertEquals(centralMonitoring.code, code)
        assertEquals(centralMonitoring.description, description)
        assertEquals(centralMonitoring.warningColour, warningColour)
    }
    
    @Test
    void testMethod_ToString() {
        CentralMonitoring centralMonitoring = new CentralMonitoring()
        centralMonitoring.code = 'T'
        centralMonitoring.description = 'TEST'
        
        assertEquals(centralMonitoring.description, centralMonitoring.toString())
    }
}
