package uk.ac.reigate.register;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.academic.Course
import uk.ac.reigate.domain.academic.CourseGroup
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.register.AttendanceCode;
import uk.ac.reigate.domain.register.Register;
import uk.ac.reigate.domain.register.RegisterMark


public class RegisterMarkTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    Course createCourse() {
        Course course = new Course()
    }
    
    CourseGroup createCourseGroup() {
        CourseGroup courseGroup = new CourseGroup()
    }
    
    Register createRegister() {
        Register register = new Register()
    }
    
    AttendanceCode createAttendanceCode() {
        AttendanceCode attendanceCode = new AttendanceCode()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        Student student = createStudent()
        Register register = createRegister()
        Course course = createCourse()
        CourseGroup courseGroup = createCourseGroup()
        AttendanceCode attendanceCode = createAttendanceCode()
        
        RegisterMark registerMark = new RegisterMark(course, courseGroup, register, student, attendanceCode)
        
        assertNotNull(registerMark)
        assertEquals(registerMark.student.id, student.id)
        assertEquals(registerMark.courseGroup.id, courseGroup.id)
        assertEquals(registerMark.register.id, register.id)
        assertEquals(registerMark.course.id, course.id)
        assertEquals(registerMark.attendanceCode.id, attendanceCode.id)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        Register register = createRegister()
        Course course = createCourse()
        CourseGroup courseGroup = createCourseGroup()
        AttendanceCode attendanceCode = createAttendanceCode()
        
        RegisterMark registerMark = new RegisterMark(id, course, courseGroup, register, student, attendanceCode)
        
        assertNotNull(registerMark)
        assertEquals(registerMark.student.id, student.id)
        assertEquals(registerMark.courseGroup.id, courseGroup.id)
        assertEquals(registerMark.register.id, register.id)
        assertEquals(registerMark.course.id, course.id)
        assertEquals(registerMark.attendanceCode.id, attendanceCode.id)
    }
    
    @Test
    void testMethod_ToString() {
        RegisterMark registerMark = new RegisterMark()
        Register register = createRegister()
        registerMark.register = register
        
        assertEquals(registerMark.register.id, registerMark.toString())
    }
}
