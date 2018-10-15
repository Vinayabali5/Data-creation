package uk.ac.reigate.domain.learning_support

import groovy.transform.EqualsAndHashCode

import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.academic.Student

@Entity
//@AttributeOverrides([
//    @AttributeOverride(name = "id", column = @Column(name = "support_type_id"))
//])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
@IdClass(StudentReferralReasonPk.class)
class StudentReferralReason implements Serializable {
    
    @Id
    @OneToOne
    @JoinColumn(name = 'student_id')
    Student student
    
    @Id
    @OneToOne
    @JoinColumn(name = 'referral_reason_id')
    ReferralReason referralReason
    
    @Column(name = '`primary`')
    Boolean primary
    
    StudentReferralReason() {}
    
    StudentReferralReason(Student student, ReferralReason referralReason, Boolean primary){
        this.student = student;
        this.referralReason = referralReason;
        this.primary = primary;
    }
    
    String toString() {
        return student
    }
}

