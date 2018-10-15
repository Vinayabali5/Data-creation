package uk.ac.reigate.domain.ilp;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.AcademicYear
import uk.ac.reigate.domain.academic.CourseGroup;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject


public class ILPInterviewTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    CourseGroup createCourseGroup() {
        CourseGroup courseGroup = new CourseGroup()
    }
    
    Staff createStaff() {
        Staff staff = new Staff()
    }
    
    ILPInterviewType createILPInterviewType() {
        ILPInterviewType type = new ILPInterviewType()
    }
    
    AcademicYear createAcademicYear(){
        AcademicYear academicYear = new AcademicYear();
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Student student = createStudent()
        CourseGroup courseGroup = createCourseGroup()
        ILPInterviewType type = createILPInterviewType()
        String discussion = 'T'
        Staff staff = createStaff()
        Date interviewDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date interviewTime = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Boolean referLip = true
        Date lipReferDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Boolean privateEntry = true
        String officeAction = 'Test'
        String officeNotes = 'Tt'
        Boolean toFile = false
        String target  =  'Test'
        String targetByWhen = 'Ongoing'
        AcademicYear academicYear = createAcademicYear()
        
        ILPInterview iLPInterview = new ILPInterview(student,  type, courseGroup, staff, discussion, interviewDate,  interviewTime,  referLip,  lipReferDate,  privateEntry,  officeAction,  officeNotes,  toFile , target , targetByWhen , academicYear )
        
        assertNotNull(iLPInterview)
        assertEquals(iLPInterview.student.id, student.id)
        assertEquals(iLPInterview.courseGroup.id, courseGroup.id)
        assertEquals(iLPInterview.discussion, discussion)
        assertEquals(iLPInterview.interviewDate, interviewDate)
        assertEquals(iLPInterview.interviewTime, interviewTime)
        assertEquals(iLPInterview.referLip, referLip)
        assertEquals(iLPInterview.lipReferDate, lipReferDate)
        assertEquals(iLPInterview.staff.id, staff.id)
        assertEquals(iLPInterview.type.id, type.id)
        assertEquals(iLPInterview.officeAction, officeAction)
        assertEquals(iLPInterview.privateEntry, privateEntry)
        assertEquals(iLPInterview.officeNotes, officeNotes)
        assertEquals(iLPInterview.toFile, toFile)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        CourseGroup courseGroup = createCourseGroup()
        ILPInterviewType type = createILPInterviewType()
        String discussion = 'T'
        Staff staff = createStaff()
        Date interviewDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date interviewTime = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Boolean referLip = true
        Date lipReferDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Boolean privateEntry = true
        String officeAction = 'Test'
        String officeNotes = 'Tt'
        Boolean toFile = false
        String target  =  'Test'
        String targetByWhen = 'Ongoing'
        AcademicYear academicYear = createAcademicYear()
        
        ILPInterview iLPInterview = new ILPInterview(id, student,  type, courseGroup, staff, discussion, interviewDate,  interviewTime,  referLip,  lipReferDate,  privateEntry,  officeAction,  officeNotes,  toFile , target , targetByWhen , academicYear)
        
        assertNotNull(iLPInterview)
        assertEquals(iLPInterview.student.id, student.id)
        assertEquals(iLPInterview.courseGroup.id, courseGroup.id)
        assertEquals(iLPInterview.discussion, discussion)
        assertEquals(iLPInterview.interviewDate, interviewDate)
        assertEquals(iLPInterview.interviewTime, interviewTime)
        assertEquals(iLPInterview.referLip, referLip)
        assertEquals(iLPInterview.lipReferDate, lipReferDate)
        assertEquals(iLPInterview.staff.id, staff.id)
        assertEquals(iLPInterview.type.id, type.id)
        assertEquals(iLPInterview.officeAction, officeAction)
        assertEquals(iLPInterview.privateEntry, privateEntry)
        assertEquals(iLPInterview.officeNotes, officeNotes)
        assertEquals(iLPInterview.toFile, toFile)
    }
    
    @Test
    void testMethod_ToString() {
        ILPInterview iLPInterviewe = new ILPInterview()
        Student student = createStudent()
        iLPInterviewe.student = student
        
        assertEquals(iLPInterviewe.student.id, iLPInterviewe.toString())
    }
}
