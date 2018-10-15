package uk.ac.reigate.register;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.CourseGroup;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject
import uk.ac.reigate.domain.register.Register
import uk.ac.reigate.domain.register.RegisteredSession;


public class RegisterTest {
    
    RegisteredSession createRegisteredSession() {
        RegisteredSession session = new RegisteredSession()
    }
    
    CourseGroup createCourseGroup() {
        CourseGroup courseGroup = new CourseGroup()
    }
    
    Staff createStaff() {
        Staff staffCompleted = new Staff()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        RegisteredSession session = createRegisteredSession()
        CourseGroup courseGroup = createCourseGroup()
        Staff staffCompleted = createStaff()
        Boolean completed = true
        Date dateCompleted = new Date().parse('yyyy/MM/dd', '2015/08/01')
        
        Register register = new Register(session, courseGroup, completed, staffCompleted, dateCompleted)
        
        assertNotNull(register)
        assertEquals(register.session.id, session.id)
        assertEquals(register.courseGroup.id, courseGroup.id)
        assertEquals(register.completed, completed)
        assertEquals(register.dateCompleted, dateCompleted)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        RegisteredSession session = createRegisteredSession()
        CourseGroup courseGroup = createCourseGroup()
        Staff staffCompleted = createStaff()
        Boolean completed = true
        Date dateCompleted = new Date().parse('yyyy/MM/dd', '2015/08/01')
        
        Register register = new Register(id, session, courseGroup, completed, staffCompleted, dateCompleted)
        
        assertNotNull(register)
        assertEquals(register.session.id, session.id)
        assertEquals(register.courseGroup.id, courseGroup.id)
        assertEquals(register.completed, completed)
        assertEquals(register.dateCompleted, dateCompleted)
    }
    
    @Test
    void testMethod_ToString() {
        Register registere = new Register()
        RegisteredSession session = createRegisteredSession()
        registere.session = session
        
        assertEquals(registere.session.id, registere.toString())
    }
}
