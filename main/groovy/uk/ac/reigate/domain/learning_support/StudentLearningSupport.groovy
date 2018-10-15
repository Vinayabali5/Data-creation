package uk.ac.reigate.domain.learning_support

import groovy.transform.EqualsAndHashCode

import javax.annotation.concurrent.Immutable;
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.academic.Student



@Entity
//@AttributeOverrides([
//    @AttributeOverride(name = "id", column = @Column(name = "support_type_id"))
//])
@Immutable
//@DynamicInsert(true)
//@DynamicUpdate(true)
//@EqualsAndHashCode(includeFields=true)
@Table(name = "student_learning_support")
class StudentLearningSupport implements Serializable {
    
    @Id
    @Column(name="student_id")
    private Integer studentId;
    
    @OneToOne
    @PrimaryKeyJoinColumn(name="student_id", referencedColumnName="student_id")
    Student student
    
    @Column(name = 'referral_notes')
    String referralNotes
    
    @OneToOne
    @JoinColumn(name = 'support_type_id')
    SupportType supportType
    
    @Column(name = 'support_notes')
    String supportNotes
    
    @Column(name = 'assessment_date')
    Date assessmentDate
    
    @Column(name = 'previous_concession')
    String previousConcession
    
    @Column(name = 'concession_application')
    Boolean concessionApplication
    
    @Column(name = 'exam_concession_approved')
    Boolean examConcessionApproved
    
    @Column(name = 'btec_concession_approved')
    Boolean btecConcessionApproved
    
    @Column(name = 'fs_concession_approved')
    Boolean fsConcessionApproved
    
}
