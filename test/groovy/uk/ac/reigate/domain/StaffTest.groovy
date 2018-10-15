package uk.ac.reigate.domain;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.StaffType


public class StaffTest {
    
    Person createPerson() {
        Person person = new Person()
    }
    
    StaffType createStaffType() {
        StaffType type = new StaffType()
    }
    
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        Boolean onTimetable = true
        String initials = 't'
        String knownAs = 'tt'
        String networkLogin = 'vbm'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Integer staffRef = 2
        StaffType type = createStaffType()
        Integer staffDetailsId = 1
        Person person = createPerson()
        
        Staff staff = new Staff(person, type, onTimetable, initials, knownAs, networkLogin, startDate, endDate, staffRef, staffDetailsId)
        assertNotNull(staff)
        assertEquals(staff.initials, initials)
        assertEquals(staff.type.id, type.id)
        assertEquals(staff.knownAs, knownAs)
        assertEquals(staff.staffDetailsId, staffDetailsId)
        assertEquals(staff.startDate, startDate)
        assertEquals(staff.endDate, endDate)
        assertEquals(staff.staffRef, staffRef)
        assertEquals(staff.type.id, type.id)
        assertEquals(staff.staffDetailsId, staffDetailsId)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Boolean onTimetable = true
        String initials = 't'
        String knownAs = 'tt'
        String networkLogin = 'vbm'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Integer staffRef = 2
        StaffType type = createStaffType()
        Integer staffDetailsId = 1
        Person person = createPerson()
        
        Staff staff = new Staff(id, person, type, onTimetable, initials, knownAs, networkLogin, startDate, endDate, staffRef, staffDetailsId)
        
        assertNotNull(staff)
        assertEquals(staff.initials, initials)
        assertEquals(staff.type.id, type.id)
        assertEquals(staff.knownAs, knownAs)
        assertEquals(staff.staffDetailsId, staffDetailsId)
        assertEquals(staff.startDate, startDate)
        assertEquals(staff.endDate, endDate)
        assertEquals(staff.staffRef, staffRef)
        assertEquals(staff.type.id, type.id)
        assertEquals(staff.staffDetailsId, staffDetailsId)
    }
    
    @Test
    void testMethod_ToString() {
        Staff staff = new Staff()
        
        assertEquals(staff.initials + ' - ' + staff.person, staff.toString())
    }
}
