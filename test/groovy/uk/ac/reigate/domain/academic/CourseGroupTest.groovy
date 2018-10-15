package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.exam.ExamBoard
import uk.ac.reigate.domain.lookup.Level
import uk.ac.reigate.domain.lookup.Subject
import uk.ac.reigate.domain.lookup.YearGroup;


public class CourseGroupGroupTest {
    
    YearGroup createYearGroup() {
        YearGroup yearGroup = new YearGroup()
    }
    
    Course createCourse() {
        Course course = new Course()
    }
    
    AcademicYear createAcademicYear() {
        AcademicYear year = new AcademicYear()
    }
    
    Department createDepartment() {
        Department department = new Department()
    }
    
    Staff createStaff() {
        Staff courseLeader = new Staff()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        YearGroup yearGroup = createYearGroup()
        Course course = createCourse()
        AcademicYear year = createAcademicYear()
        String code = 'C'
        Department department = createDepartment()
        String learningAimReference = '123'
        Staff courseLeader = createStaff()
        Boolean displayOnTimetable = true
        Boolean hasRegister = true
        String notes = 'good'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Integer plh = 2
        Integer peeph = 3
        String spec = 'L-mah'
        
        CourseGroup courseGroup = new CourseGroup(yearGroup, course, year, code, department, courseLeader, displayOnTimetable, hasRegister, notes, spec, plh, peeph)
        
        assertNotNull(courseGroup)
        assertEquals(courseGroup.yearGroup.id, yearGroup.id)
        assertEquals(courseGroup.course.id, course.id)
        assertEquals(courseGroup.year.id, year.id)
        assertEquals(courseGroup.code, code)
        assertEquals(courseGroup.department.id, department.id)
        assertEquals(courseGroup.displayOnTimetable, displayOnTimetable)
        assertEquals(courseGroup.courseLeader.id, courseLeader.id)
        assertEquals(courseGroup.hasRegister, hasRegister)
        assertEquals(courseGroup.plh, plh)
        assertEquals(courseGroup.peeph, peeph)
        assertEquals(courseGroup.notes, notes)
        assertEquals(courseGroup.spec, spec)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        YearGroup yearGroup = createYearGroup()
        Course course = createCourse()
        AcademicYear year = createAcademicYear()
        String code = 'C'
        Department department = createDepartment()
        String learningAimReference = '123'
        Staff courseLeader = createStaff()
        Boolean displayOnTimetable = true
        Boolean hasRegister = true
        String notes = 'good'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Integer plh = 2
        Integer peeph = 3
        String spec = 'L-mah'
        
        CourseGroup courseGroup = new CourseGroup(id, yearGroup, course, year, code, department, courseLeader, displayOnTimetable, hasRegister, notes, spec, plh, peeph)
        
        assertNotNull(courseGroup)
        assertEquals(courseGroup.yearGroup.id, yearGroup.id)
        assertEquals(courseGroup.course.id, course.id)
        assertEquals(courseGroup.year.id, year.id)
        assertEquals(courseGroup.code, code)
        assertEquals(courseGroup.department.id, department.id)
        assertEquals(courseGroup.displayOnTimetable, displayOnTimetable)
        assertEquals(courseGroup.courseLeader.id, courseLeader.id)
        assertEquals(courseGroup.hasRegister, hasRegister)
        assertEquals(courseGroup.plh, plh)
        assertEquals(courseGroup.peeph, peeph)
        assertEquals(courseGroup.notes, notes)
        assertEquals(courseGroup.spec, spec)
    }
    
    @Test
    void testMethod_ToString() {
        CourseGroup courseGroup = new CourseGroup()
        YearGroup yearGroup = createYearGroup()
        Course course = createCourse()
        courseGroup.code = 'TEST'
        
        assertEquals(courseGroup.yearGroup + '-' + courseGroup.course + '-' + courseGroup.code, courseGroup.toString())
    }
}
