package uk.ac.reigate.domain.cristal;

import static org.junit.Assert.*

import org.junit.Test

import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.register.AttendanceCode;;


public class MasterRegisterTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    AttendanceCode createAttendanceCode() {
        AttendanceCode attendance = new AttendanceCode()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        Integer sessionRef = 2
        Student student = createStudent()
        String subjectCode = 'T'
        String group = 'TEST'
        AttendanceCode attendance = createAttendanceCode()
        MasterRegister masterRegister = new MasterRegister(sessionRef, student, subjectCode, group, attendance)
        
        assertNotNull(masterRegister)
        assertEquals(masterRegister.sessionRef, sessionRef)
        assertEquals(masterRegister.student.id, student.id)
        assertEquals(masterRegister.subjectCode, subjectCode)
        assertEquals(masterRegister.group, group)
        assertEquals(masterRegister.attendance, attendance)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Integer sessionRef = 2
        Student student = createStudent()
        String subjectCode = 'T'
        String group = 'TEST'
        AttendanceCode attendance = createAttendanceCode()
        
        MasterRegister masterRegister = new MasterRegister(id, sessionRef, student, subjectCode, group, attendance)
        
        assertNotNull(masterRegister)
        assertEquals(masterRegister.id, id)
        assertEquals(masterRegister.sessionRef, sessionRef)
        assertEquals(masterRegister.student.id, student.id)
        assertEquals(masterRegister.subjectCode, subjectCode)
        assertEquals(masterRegister.group, group)
        assertEquals(masterRegister.attendance, attendance)
    }
    
    @Test
    void testMethod_ToString() {
        MasterRegister masterRegister = new MasterRegister()
        Student student = createStudent()
        masterRegister.student = student
        assertEquals(masterRegister.student.id, masterRegister.toString())
    }
}
