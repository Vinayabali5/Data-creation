package uk.ac.reigate.domain.learning_support;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.CourseGroup
import uk.ac.reigate.domain.academic.SpecialCategory;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject


public class StudentSpecialCategoryTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    SpecialCategory createSpecialCategory() {
        SpecialCategory specialCategory = new SpecialCategory()
    }
    
    Staff createStaffRequesting() {
        Staff staffRequesting = new Staff()
    }
    
    Staff createRiskAssessmentToBeCompletedBy() {
        Staff riskAssessmentToBeCompletedBy  = new Staff()
    }
    
    Staff createStaffConcerned() {
        Staff staffConcerned  = new Staff()
    }
    
    
    Staff createRiskAssessmentRaisedBy() {
        Staff riskAssessmentRaisedBy  = new Staff()
    }
    
    Staff createRiskAssessmentCarriedOutBy() {
        Staff riskAssessmentCarriedOutBy  = new Staff()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Student student = createStudent()
        Date requestDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        SpecialCategory specialCategory = createSpecialCategory()
        Boolean specialConfirmed = true
        Date classificationDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date closedDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        String monitoringNotes = 'Testing'
        Staff staffRequesting = createStaffRequesting()
        Boolean riskAssessmentRequired = true
        Staff riskAssessmentToBeCompletedBy = createRiskAssessmentToBeCompletedBy()
        Boolean informationConfidential = true
        Boolean writtenEvidence = true
        Boolean passToStaffConcerned = true
        Staff staffConcerned = createStaffConcerned()
        String riskToStudentOrOthers = 't'
        String emergencyContactNos = '234324'
        String outsideAgenciesInvolved = '2'
        String toBeInformedPotentialRisks = 'test'
        Staff riskAssessmentRaisedBy = createRiskAssessmentRaisedBy()
        Date riskAssessmentRaisedDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Staff riskAssessmentCarriedOutBy = createRiskAssessmentCarriedOutBy()
        Date riskAssessmentCarriedOutDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        String inEventEmergency = 'testt'
        StudentSpecialCategory studentSpecialCategory = new StudentSpecialCategory(student , requestDate, specialCategory, specialConfirmed, classificationDate, closedDate,  monitoringNotes, staffRequesting , riskAssessmentRequired, riskAssessmentToBeCompletedBy,  informationConfidential,  writtenEvidence, passToStaffConcerned, staffConcerned ,  riskToStudentOrOthers, emergencyContactNos,  outsideAgenciesInvolved,  toBeInformedPotentialRisks, riskAssessmentRaisedBy, riskAssessmentRaisedDate, riskAssessmentCarriedOutBy, riskAssessmentCarriedOutDate, inEventEmergency)
        
        assertNotNull(studentSpecialCategory)
        assertEquals(studentSpecialCategory.student.id, student.id)
        assertEquals(studentSpecialCategory.requestDate, requestDate)
        assertEquals(studentSpecialCategory.specialConfirmed, specialConfirmed)
        assertEquals(studentSpecialCategory.classificationDate, classificationDate)
        assertEquals(studentSpecialCategory.monitoringNotes, monitoringNotes)
        assertEquals(studentSpecialCategory.staffRequesting.id, staffRequesting.id)
        assertEquals(studentSpecialCategory.riskAssessmentRequired, riskAssessmentRequired)
        assertEquals(studentSpecialCategory.riskAssessmentToBeCompletedBy.id, riskAssessmentToBeCompletedBy.id)
        assertEquals(studentSpecialCategory.informationConfidential, informationConfidential)
        assertEquals(studentSpecialCategory.writtenEvidence, writtenEvidence)
        assertEquals(studentSpecialCategory.passToStaffConcerned, passToStaffConcerned)
        assertEquals(studentSpecialCategory.staffConcerned.id, staffConcerned.id)
        assertEquals(studentSpecialCategory.riskToStudentOrOthers, riskToStudentOrOthers)
        assertEquals(studentSpecialCategory.emergencyContactNos, emergencyContactNos)
        assertEquals(studentSpecialCategory.outsideAgenciesInvolved, outsideAgenciesInvolved)
        assertEquals(studentSpecialCategory.toBeInformedPotentialRisks, toBeInformedPotentialRisks)
        assertEquals(studentSpecialCategory.riskAssessmentRaisedBy.id, riskAssessmentRaisedBy.id)
        assertEquals(studentSpecialCategory.riskAssessmentRaisedDate, riskAssessmentRaisedDate)
        assertEquals(studentSpecialCategory.riskAssessmentCarriedOutBy , riskAssessmentCarriedOutBy )
        assertEquals(studentSpecialCategory.riskAssessmentCarriedOutDate, riskAssessmentCarriedOutDate)
        assertEquals(studentSpecialCategory.inEventEmergency, inEventEmergency)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        Date requestDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        SpecialCategory specialCategory = createSpecialCategory()
        Boolean specialConfirmed = true
        Date classificationDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date closedDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        String monitoringNotes = 'Testing'
        Staff staffRequesting = createStaffRequesting()
        Boolean riskAssessmentRequired = true
        Staff riskAssessmentToBeCompletedBy = createRiskAssessmentToBeCompletedBy()
        Boolean informationConfidential = true
        Boolean writtenEvidence = true
        Boolean passToStaffConcerned = true
        Staff staffConcerned = createStaffConcerned()
        String riskToStudentOrOthers = 't'
        String emergencyContactNos = '234324'
        String outsideAgenciesInvolved = '2'
        String toBeInformedPotentialRisks = 'test'
        Staff riskAssessmentRaisedBy = createRiskAssessmentRaisedBy()
        Date riskAssessmentRaisedDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Staff riskAssessmentCarriedOutBy = createRiskAssessmentCarriedOutBy()
        Date riskAssessmentCarriedOutDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        String inEventEmergency = 'testt'
        
        StudentSpecialCategory studentSpecialCategory = new StudentSpecialCategory(student , requestDate, specialCategory, specialConfirmed, classificationDate, closedDate,  monitoringNotes, staffRequesting , riskAssessmentRequired, riskAssessmentToBeCompletedBy,  informationConfidential,  writtenEvidence, passToStaffConcerned, staffConcerned ,  riskToStudentOrOthers, emergencyContactNos,  outsideAgenciesInvolved,  toBeInformedPotentialRisks, riskAssessmentRaisedBy, riskAssessmentRaisedDate, riskAssessmentCarriedOutBy, riskAssessmentCarriedOutDate, inEventEmergency)
        
        assertNotNull(studentSpecialCategory)
        assertEquals(studentSpecialCategory.student.id, student.id)
        assertEquals(studentSpecialCategory.requestDate, requestDate)
        assertEquals(studentSpecialCategory.specialConfirmed, specialConfirmed)
        assertEquals(studentSpecialCategory.classificationDate, classificationDate)
        assertEquals(studentSpecialCategory.monitoringNotes, monitoringNotes)
        assertEquals(studentSpecialCategory.staffRequesting.id, staffRequesting.id)
        assertEquals(studentSpecialCategory.riskAssessmentRequired, riskAssessmentRequired)
        assertEquals(studentSpecialCategory.riskAssessmentToBeCompletedBy.id, riskAssessmentToBeCompletedBy.id)
        assertEquals(studentSpecialCategory.informationConfidential, informationConfidential)
        assertEquals(studentSpecialCategory.writtenEvidence, writtenEvidence)
        assertEquals(studentSpecialCategory.passToStaffConcerned, passToStaffConcerned)
        assertEquals(studentSpecialCategory.staffConcerned.id, staffConcerned.id)
        assertEquals(studentSpecialCategory.riskToStudentOrOthers, riskToStudentOrOthers)
        assertEquals(studentSpecialCategory.emergencyContactNos, emergencyContactNos)
        assertEquals(studentSpecialCategory.outsideAgenciesInvolved, outsideAgenciesInvolved)
        assertEquals(studentSpecialCategory.toBeInformedPotentialRisks, toBeInformedPotentialRisks)
        assertEquals(studentSpecialCategory.riskAssessmentRaisedBy.id, riskAssessmentRaisedBy.id)
        assertEquals(studentSpecialCategory.riskAssessmentRaisedDate, riskAssessmentRaisedDate)
        assertEquals(studentSpecialCategory.riskAssessmentCarriedOutBy , riskAssessmentCarriedOutBy )
        assertEquals(studentSpecialCategory.riskAssessmentCarriedOutDate, riskAssessmentCarriedOutDate)
        assertEquals(studentSpecialCategory.inEventEmergency, inEventEmergency)
    }
    
    @Test
    void testMethod_ToString() {
        StudentSpecialCategory studentSpecialCategorye = new StudentSpecialCategory()
        assertEquals(studentSpecialCategorye.student, studentSpecialCategorye.toString())
    }
}
