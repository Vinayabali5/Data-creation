package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.ilr.AimType
import uk.ac.reigate.domain.ilr.CompletionStatus
import uk.ac.reigate.domain.ilr.FundingModel;
import uk.ac.reigate.domain.ilr.Outcome
import uk.ac.reigate.domain.ilr.SourceOfFunding;
import uk.ac.reigate.domain.ilr.WithdrawalReason
import uk.ac.reigate.domain.lookup.CentralMonitoring;;;;



public class EnrolmentTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    Course createCourse() {
        Course course = new Course()
    }
    
    AcademicYear createAcademicYear() {
        AcademicYear year = new AcademicYear()
    }
    
    CourseGroup createCourseGroup() {
        CourseGroup courseGroup = new CourseGroup()
    }
    
    AimType createAimType() {
        AimType aimType = new AimType()
    }
    
    CompletionStatus createCompletionStatus() {
        CompletionStatus completionStatus = new CompletionStatus()
    }
    
    WithdrawalReason createWithdrawalReason() {
        WithdrawalReason withdrawalReason = new WithdrawalReason()
    }
    
    Outcome createOutcome() {
        Outcome outcome = new Outcome()
    }
    
    CentralMonitoring createCentralMonitoring() {
        CentralMonitoring centralMonitoring = new CentralMonitoring()
    }
    
    FundingModel createFundingModel() {
        FundingModel fundingModel = new FundingModel()
    }
    
    SourceOfFunding createSourceOfFunding() {
        SourceOfFunding sourceOfFunding = new SourceOfFunding()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Student student = createStudent()
        Course course = createCourse()
        AcademicYear year = createAcademicYear()
        CourseGroup courseGroup = createCourseGroup()
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date qualificationStartDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date plannedEndDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        AimType aimType = createAimType()
        CompletionStatus completionStatus = createCompletionStatus()
        WithdrawalReason withdrawalReason = createWithdrawalReason()
        Outcome outcome = createOutcome()
        String grade = 'A'
        Boolean ilr = true
        CentralMonitoring centralMonitoring = createCentralMonitoring()
        Integer plh = 2
        Integer peeph = 3
        FundingModel fundingModel = createFundingModel()
        SourceOfFunding sourceOfFunding = createSourceOfFunding()
        String note = "Test note"
        
        Enrolment enrolment = new Enrolment(student, year, course, courseGroup, startDate, endDate, qualificationStartDate, plannedEndDate, aimType, completionStatus, withdrawalReason, outcome, grade, ilr, centralMonitoring, plh, peeph, fundingModel, sourceOfFunding, note)
        
        assertNotNull(enrolment)
        assertEquals(enrolment.student.id, student.id)
        assertEquals(enrolment.course.id, course.id)
        assertEquals(enrolment.year.id, year.id)
        assertEquals(enrolment.courseGroup.id, courseGroup.id)
        assertEquals(enrolment.startDate, startDate)
        assertEquals(enrolment.endDate, endDate)
        assertEquals(enrolment.qualificationStartDate, qualificationStartDate)
        assertEquals(enrolment.plannedEndDate, plannedEndDate)
        assertEquals(enrolment.aimType.id, aimType.id)
        assertEquals(enrolment.completionStatus.id, completionStatus.id)
        assertEquals(enrolment.withdrawalReason.id, withdrawalReason.id)
        assertEquals(enrolment.outcome, outcome)
        assertEquals(enrolment.grade, grade)
        assertEquals(enrolment.ilr, ilr)
        assertEquals(enrolment.centralMonitoring.id, centralMonitoring.id)
        assertEquals(enrolment.plh, plh)
        assertEquals(enrolment.peeph, peeph)
        assertEquals(enrolment.fundingModel .id, fundingModel .id)
        assertEquals(enrolment.sourceOfFunding.id, sourceOfFunding.id)
        assertEquals(enrolment.notes, note)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        Course course = createCourse()
        AcademicYear year = createAcademicYear()
        CourseGroup courseGroup = createCourseGroup()
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date qualificationStartDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date plannedEndDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        AimType aimType = createAimType()
        CompletionStatus completionStatus = createCompletionStatus()
        WithdrawalReason withdrawalReason = createWithdrawalReason()
        Outcome outcome = createOutcome()
        String grade = 'A'
        Boolean ilr = true
        CentralMonitoring centralMonitoring = createCentralMonitoring()
        Integer plh = 2
        Integer peeph = 3
        FundingModel fundingModel = createFundingModel()
        SourceOfFunding sourceOfFunding = createSourceOfFunding()
        String note = "Test note"
        
        Enrolment enrolment = new Enrolment(id, student, year, course, courseGroup, startDate, endDate, qualificationStartDate, plannedEndDate, aimType, completionStatus, withdrawalReason, outcome, grade, ilr, centralMonitoring, plh, peeph, fundingModel, sourceOfFunding, note)
        
        assertNotNull(enrolment)
        assertEquals(enrolment.student.id, student.id)
        assertEquals(enrolment.course.id, course.id)
        assertEquals(enrolment.year.id, year.id)
        assertEquals(enrolment.courseGroup.id, courseGroup.id)
        assertEquals(enrolment.startDate, startDate)
        assertEquals(enrolment.endDate, endDate)
        assertEquals(enrolment.qualificationStartDate, qualificationStartDate)
        assertEquals(enrolment.plannedEndDate, plannedEndDate)
        assertEquals(enrolment.aimType.id, aimType.id)
        assertEquals(enrolment.completionStatus.id, completionStatus.id)
        assertEquals(enrolment.withdrawalReason.id, withdrawalReason.id)
        assertEquals(enrolment.outcome, outcome)
        assertEquals(enrolment.grade, grade)
        assertEquals(enrolment.ilr, ilr)
        assertEquals(enrolment.centralMonitoring.id, centralMonitoring.id)
        assertEquals(enrolment.plh, plh)
        assertEquals(enrolment.peeph, peeph)
        assertEquals(enrolment.fundingModel .id, fundingModel .id)
        assertEquals(enrolment.sourceOfFunding.id, sourceOfFunding.id)
        assertEquals(enrolment.notes, note)
    }
    
    @Test
    void testMethod_ToString() {
        Enrolment enrolment = new Enrolment()
        Student student = createStudent()
        
        assertEquals(enrolment.student, enrolment.toString())
    }
}
