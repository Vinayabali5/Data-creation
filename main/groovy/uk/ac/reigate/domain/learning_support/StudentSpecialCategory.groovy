package uk.ac.reigate.domain.learning_support

import groovy.transform.EqualsAndHashCode

import java.util.Date;

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.academic.SpecialCategory
import uk.ac.reigate.domain.academic.Student


@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "student_special_category_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class StudentSpecialCategory extends BaseEntity {
    
    @OneToOne
    @JoinColumn(name = 'student_id')
    Student student
    
    @Column(name='request_date')
    Date requestDate
    
    @OneToOne
    @JoinColumn(name = 'special_category_id')
    SpecialCategory specialCategory
    
    @Column(name='special_confirmed')
    Boolean specialConfirmed
    
    @Column(name='classification_date')
    Date classificationDate
    
    @Column(name='closed_date')
    Date closedDate
    
    @Column(name='monitoring_notes')
    String monitoringNotes
    
    @OneToOne
    @JoinColumn(name = 'staff_requesting_id')
    Staff staffRequesting
    
    @Column(name='risk_assessment_required')
    Boolean riskAssessmentRequired
    
    @OneToOne
    @JoinColumn(name = 'risk_assessment_to_be_completed_by_id')
    Staff riskAssessmentToBeCompletedBy
    
    @Column(name='information_confidential')
    Boolean informationConfidential
    
    @Column(name='written_evidence')
    Boolean writtenEvidence
    
    @Column(name='pass_to_staff_concerned')
    Boolean passToStaffConcerned
    
    @OneToOne
    @JoinColumn(name = 'staff_concerned_id')
    Staff staffConcerned
    
    @Column(name='risk_to_student_or_others')
    String riskToStudentOrOthers
    
    @Column(name='emergency_contact_nos')
    String emergencyContactNos
    
    @Column(name='outside_agencies_involved')
    String outsideAgenciesInvolved
    
    @Column(name='to_be_informed_potential_risks')
    String toBeInformedPotentialRisks
    
    @OneToOne
    @JoinColumn(name = 'risk_assessment_raised_by_id')
    Staff riskAssessmentRaisedBy
    
    @Column(name='risk_assessment_raised_date')
    Date riskAssessmentRaisedDate
    
    @OneToOne
    @JoinColumn(name = 'risk_assessment_carried_out_by_id')
    Staff riskAssessmentCarriedOutBy
    
    @Column(name='risk_assessment_carried_out_date')
    Date riskAssessmentCarriedOutDate
    
    @Column(name='in_event_emergency')
    String inEventEmergency
    
    StudentSpecialCategory(){}
    
    
    StudentSpecialCategory(Integer id, Student student, Date requestDate, SpecialCategory specialCategory, Boolean specialConfirmed, Date classificationDate, Date closedDate, String monitoringNotes, Staff staffRequesting, Boolean riskAssessmentRequired, Staff riskAssessmentToBeCompletedBy, Boolean informationConfidential, Boolean writtenEvidence, Boolean passToStaffConcerned, Staff staffConcerned, String riskToStudentOrOthers, String emergencyContactNos, String outsideAgenciesInvolved, String toBeInformedPotentialRisks, Staff riskAssessmentRaisedBy, Date riskAssessmentRaisedDate, Staff riskAssessmentCarriedOutBy, Date riskAssessmentCarriedOutDate, String inEventEmergency) {
        this.id = id;
        this.student = student;
        this.requestDate = requestDate;
        this.specialCategory = specialCategory;
        this.specialConfirmed = specialConfirmed;
        this.classificationDate = classificationDate;
        this.closedDate = closedDate;
        this.monitoringNotes = monitoringNotes;
        this.staffRequesting = staffRequesting;
        this.riskAssessmentRequired = riskAssessmentRequired;
        this.riskAssessmentToBeCompletedBy = riskAssessmentToBeCompletedBy;
        this.informationConfidential = informationConfidential;
        this.writtenEvidence = writtenEvidence;
        this.passToStaffConcerned = passToStaffConcerned;
        this.staffConcerned = staffConcerned;
        this.riskToStudentOrOthers = riskToStudentOrOthers;
        this.emergencyContactNos = emergencyContactNos;
        this.outsideAgenciesInvolved = outsideAgenciesInvolved;
        this.toBeInformedPotentialRisks = toBeInformedPotentialRisks;
        this.riskAssessmentRaisedBy = riskAssessmentRaisedBy;
        this.riskAssessmentRaisedDate = riskAssessmentRaisedDate;
        this.riskAssessmentCarriedOutBy = riskAssessmentCarriedOutBy;
        this.riskAssessmentCarriedOutDate = riskAssessmentCarriedOutDate;
        this.inEventEmergency = inEventEmergency;
    }
    
    public StudentSpecialCategory(Student student, Date requestDate, SpecialCategory specialCategory, Boolean specialConfirmed, Date classificationDate, Date closedDate, String monitoringNotes, Staff staffRequesting, Boolean riskAssessmentRequired, Staff riskAssessmentToBeCompletedBy, Boolean informationConfidential, Boolean writtenEvidence, Boolean passToStaffConcerned, Staff staffConcerned, String riskToStudentOrOthers, String emergencyContactNos, String outsideAgenciesInvolved, String toBeInformedPotentialRisks, Staff riskAssessmentRaisedBy, Date riskAssessmentRaisedDate, Staff riskAssessmentCarriedOutBy, Date riskAssessmentCarriedOutDate, String inEventEmergency) {
        this(null, student , requestDate, specialCategory, specialConfirmed, classificationDate, closedDate,  monitoringNotes, staffRequesting , riskAssessmentRequired, riskAssessmentToBeCompletedBy,  informationConfidential,  writtenEvidence, passToStaffConcerned, staffConcerned ,  riskToStudentOrOthers, emergencyContactNos,  outsideAgenciesInvolved,  toBeInformedPotentialRisks, riskAssessmentRaisedBy, riskAssessmentRaisedDate, riskAssessmentCarriedOutBy, riskAssessmentCarriedOutDate, inEventEmergency )
    }
    
    String toString() {
        return student
    }
}
