package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class PunctualityMonitoringTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String warningColour = 'red'
        
        PunctualityMonitoring punctualityMonitoring = new PunctualityMonitoring(code, description, warningColour)
        
        assertNotNull(punctualityMonitoring)
        assertEquals(punctualityMonitoring.code, code)
        assertEquals(punctualityMonitoring.description, description)
        assertEquals(punctualityMonitoring.warningColour, warningColour)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String warningColour = 'red'
        
        PunctualityMonitoring punctualityMonitoring = new PunctualityMonitoring(id, code, description, warningColour)
        
        assertNotNull(punctualityMonitoring)
        assertEquals(punctualityMonitoring.id, id)
        assertEquals(punctualityMonitoring.code, code)
        assertEquals(punctualityMonitoring.description, description)
        assertEquals(punctualityMonitoring.warningColour, warningColour)
    }
    
    @Test
    void testMethod_ToString() {
        PunctualityMonitoring punctualityMonitoring = new PunctualityMonitoring()
        punctualityMonitoring.code = 'T'
        punctualityMonitoring.description = 'TEST'
        
        assertEquals(punctualityMonitoring.description, punctualityMonitoring.toString())
    }
}
