package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Room;
import uk.ac.reigate.domain.Staff;


public class TimetableTest {
    
    CourseGroup createCourseGroup() {
        CourseGroup courseGroup = new CourseGroup()
    }
    
    Period createPeriod() {
        Period period = new Period()
    }
    
    Room createRoom() {
        Room room = new Room()
    }
    
    Staff createStaff() {
        Staff teacher = new Staff()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        CourseGroup courseGroup = createCourseGroup()
        Period period = createPeriod()
        Room room = createRoom()
        Staff teacher = createStaff()
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/09/01')
        
        Timetable timetable = new Timetable(courseGroup, period, room, teacher, validFrom, validTo)
        
        assertNotNull(timetable)
        assertEquals(timetable.courseGroup.id, courseGroup.id)
        assertEquals(timetable.period.id, period.id)
        assertEquals(timetable.room.id, room.id)
        assertEquals(timetable.teacher.id, teacher.id)
        assertEquals(timetable.validFrom, validFrom)
        assertEquals(timetable.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        CourseGroup courseGroup = createCourseGroup()
        Period period = createPeriod()
        Room room = createRoom()
        Staff teacher = createStaff()
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/09/01')
        
        Timetable timetable = new Timetable(id, courseGroup, period, room, teacher, validFrom, validTo)
        
        assertNotNull(timetable)
        assertEquals(timetable.courseGroup.id, courseGroup.id)
        assertEquals(timetable.period.id, period.id)
        assertEquals(timetable.room.id, room.id)
        assertEquals(timetable.teacher.id, teacher.id)
        assertEquals(timetable.validFrom, validFrom)
        assertEquals(timetable.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        Timetable timetable = new Timetable()
        CourseGroup courseGroup = createCourseGroup()
        timetable.courseGroup = courseGroup
        assertEquals(courseGroup.id, timetable.toString())
    }
}
