package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.lookup.PossibleGrade

@Entity
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
@IdClass(StudentInterimReportPk.class)
class StudentInterimReport {
    
    @Id
    @OneToOne
    @JoinColumn(name = "student_id")
    Student student
    
    @Id
    @OneToOne
    @JoinColumn(name = "interim_report_id")
    InterimReport interimReport
    
    @Id
    @OneToOne
    @JoinColumn(name = "course_id")
    Course course
    
    @OneToOne
    @JoinColumn(name = "staff_id")
    Staff staff
    
    @Column(columnDefinition = "tinyint")
    Integer motivation
    
    @Column(columnDefinition = "tinyint")
    Integer classEthic
    
    @Column(columnDefinition = "tinyint")
    Integer timeManagement
    
    @Column(columnDefinition = "smallint")
    Integer totalPossible
    
    @Column(columnDefinition = "smallint")
    Integer absence
    
    @Column(columnDefinition = "smallint")
    Integer authorisedAbsence
    
    @Column(columnDefinition = "smallint")
    Integer late
    
    @OneToOne
    @JoinColumn(name="current_predicted_grade_id")
    PossibleGrade currentPredictedGrade
    
    @OneToOne
    @JoinColumn(name="key_assessment_1_id")
    PossibleGrade keyAssessment1
    
    @OneToOne
    @JoinColumn(name="key_assessment_2_id")
    PossibleGrade keyAssessment2
}


