package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne

import com.fasterxml.jackson.annotation.JsonIgnore

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.ilr.AimType
import uk.ac.reigate.domain.ilr.CompletionStatus
import uk.ac.reigate.domain.ilr.FundingModel
import uk.ac.reigate.domain.ilr.Outcome
import uk.ac.reigate.domain.ilr.SourceOfFunding
import uk.ac.reigate.domain.ilr.WithdrawalReason
import uk.ac.reigate.domain.lookup.CentralMonitoring

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "enrolment_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Enrolment extends BaseEntity {
    
    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name='student_id')
    Student student
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name='academic_year_id')
    AcademicYear year
    
    @OneToOne
    @JoinColumn(name='course_id')
    Course course
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name='course_group_id')
    CourseGroup courseGroup
    
    @Column(name="start_date")
    Date startDate
    
    @Column(name="end_date")
    Date endDate
    
    /**
     * This is the ILR field Learning Delivery > Qualification Start Date
     */
    @Column(name="qualification_start_date")
    Date qualificationStartDate
    
    /**
     * This is the ILR field Learning Delivery > Learning Planned End Date
     */
    @Column(name="planned_end_date")
    Date plannedEndDate
    
    
    
    /**
     * This is the ILR field Learning Delivery > Aim Type
     */
    @OneToOne
    @JoinColumn(name='aim_type_id')
    AimType aimType
    
    /**
     * This is the ILR field Learning Delivery > Completion Status
     */
    @OneToOne
    @JoinColumn(name='completion_status_id')
    CompletionStatus completionStatus
    
    /**
     * This is the ILR field Learning Delivery > Withdrawal Reason
     */
    @OneToOne
    @JoinColumn(name='withdrawal_reason_id')
    WithdrawalReason withdrawalReason
    
    /**
     * This is the ILR field Learning Delivery > Outcome
     */
    @OneToOne
    @JoinColumn(name='outcome_id')
    Outcome outcome
    
    /**
     * This is the ILR field Learning Delivery > Outcome Grade
     */
    @Column(name="grade")
    String grade
    
    /**
     * This column is used to determine if the enrolment is returned on the ILR.
     */
    @Column(name = 'ilr_return')
    Boolean ilr
    
    @OneToOne
    @JoinColumn(name='central_monitoring_id')
    CentralMonitoring centralMonitoring
    
    @Column(name="plh")
    Integer plh
    
    @Column(name="peeph")
    Integer peeph
    
    @OneToOne
    @JoinColumn(name='funding_model_id')
    FundingModel fundingModel
    
    @OneToOne
    @JoinColumn(name='source_of_funding_id')
    SourceOfFunding sourceOfFunding
    
    
    @Column(name='notes')
    String notes
    
    /**
     * Default No Args constructor
     */
    Enrolment(){}
    
    Enrolment(Integer id, Student student, AcademicYear year, Course course, CourseGroup courseGroup, Date startDate, Date endDate, Date qualificationStartDate, Date plannedEndDate, AimType aimType, CompletionStatus completionStatus, WithdrawalReason withdrawalReason, Outcome outcome, String grade, Boolean ilr, CentralMonitoring centralMonitoring, Integer plh, Integer peeph, FundingModel fundingModel, SourceOfFunding sourceOfFunding, String notes){
        this.id = id;
        this.student = student;
        this.year = year;
        this.course= course;
        this.courseGroup = courseGroup;
        this.startDate = startDate;
        this.endDate = endDate;
        this.qualificationStartDate = qualificationStartDate;
        this.plannedEndDate = plannedEndDate;
        this.aimType = aimType;
        this.completionStatus = completionStatus;
        this.withdrawalReason = withdrawalReason;
        this.outcome = outcome;
        this.grade = grade;
        this.ilr = ilr;
        this.centralMonitoring = centralMonitoring;
        this.plh = plh;
        this.peeph = peeph;
        this.fundingModel = fundingModel;
        this.sourceOfFunding = sourceOfFunding;
        this.notes = notes;
    }
    
    Enrolment(Student student, AcademicYear year, Course course, CourseGroup courseGroup, Date startDate, Date endDate, Date qualificationStartDate, Date plannedEndDate, AimType aimType, CompletionStatus completionStatus, WithdrawalReason withdrawalReason, Outcome outcome, String grade, Boolean ilr, CentralMonitoring centralMonitoring, Integer plh, Integer peeph, FundingModel fundingModel, SourceOfFunding sourceOfFunding, String notes){
        this(null, student, year, course, courseGroup, startDate, endDate, qualificationStartDate, plannedEndDate, aimType, completionStatus, withdrawalReason, outcome, grade, ilr, centralMonitoring, plh, peeph, fundingModel, sourceOfFunding, notes)
    }
    
    String toString() {
        return student
    }
}




