package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class AttendanceMonitoringTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String warningColour = 'red'
        
        AttendanceMonitoring attendanceMonitoring = new AttendanceMonitoring(code, description, warningColour)
        
        assertNotNull(attendanceMonitoring)
        assertEquals(attendanceMonitoring.code, code)
        assertEquals(attendanceMonitoring.description, description)
        assertEquals(attendanceMonitoring.warningColour, warningColour)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String warningColour = 'red'
        
        AttendanceMonitoring attendanceMonitoring = new AttendanceMonitoring(id, code, description, warningColour)
        
        assertNotNull(attendanceMonitoring)
        assertEquals(attendanceMonitoring.id, id)
        assertEquals(attendanceMonitoring.code, code)
        assertEquals(attendanceMonitoring.description, description)
        assertEquals(attendanceMonitoring.warningColour, warningColour)
    }
    
    @Test
    void testMethod_ToString() {
        AttendanceMonitoring attendanceMonitoring = new AttendanceMonitoring()
        attendanceMonitoring.code = 'T'
        attendanceMonitoring.description = 'TEST'
        
        assertEquals(attendanceMonitoring.description, attendanceMonitoring.toString())
    }
}
