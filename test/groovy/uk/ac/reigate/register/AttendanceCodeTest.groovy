package uk.ac.reigate.register;

import static org.junit.Assert.*

import org.junit.Test
import uk.ac.reigate.domain.register.AttendanceCode


public class AttendanceCodeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'attendance'
        String registerMark = 'T'
        String htmlColour = 'TEST'
        Boolean absence = true
        Boolean authorisedAbsence = true
        Boolean late = true
        Boolean authorisedLate = true
        Boolean included = true
        Boolean lastDateOfAttendance = true
        String accessColour = 'red'
        
        AttendanceCode attendanceCode = new AttendanceCode(code, description, registerMark, absence, authorisedAbsence, late, authorisedLate, included, lastDateOfAttendance, htmlColour, accessColour)
        
        assertNotNull(attendanceCode)
        assertEquals(attendanceCode.registerMark, registerMark)
        assertEquals(attendanceCode.htmlColour, htmlColour)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'attendance'
        String registerMark = 'T'
        String htmlColour = 'TEST'
        Boolean absence = true
        Boolean authorisedAbsence = true
        Boolean late = true
        Boolean authorisedLate = true
        Boolean included = true
        Boolean lastDateOfAttendance = true
        String accessColour = 'red'
        
        AttendanceCode attendanceCode = new AttendanceCode(id, code, description, registerMark, absence, authorisedAbsence, late, authorisedLate, included, lastDateOfAttendance, htmlColour, accessColour)
        
        assertNotNull(attendanceCode)
        assertEquals(attendanceCode.id, id)
        assertEquals(attendanceCode.registerMark, registerMark)
        assertEquals(attendanceCode.htmlColour, htmlColour)
    }
    
    @Test
    void testMethod_ToString() {
        AttendanceCode attendanceCode = new AttendanceCode()
        attendanceCode.description = 'TEST'
        
        assertEquals(attendanceCode.description, attendanceCode.toString())
    }
}
