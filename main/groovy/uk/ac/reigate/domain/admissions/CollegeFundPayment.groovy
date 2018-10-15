package uk.ac.reigate.domain.admissions

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.FetchType
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

import com.fasterxml.jackson.annotation.JsonIgnore

import groovy.transform.EqualsAndHashCode;

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.academic.Student;;


@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "college_fund_payment_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class CollegeFundPayment extends BaseEntity {
    
    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name='student_id')
    Student student
    
    @Column(name="payment_date")
    Date paymentDate
    
    @Column(name="amount")
    float amount
    
    @Column(name="payee")
    String payee
    
    @Column(name="gift_aid")
    boolean giftAid
    
    @Column(name="cash")
    boolean cash
    
    @Column(name="cheque_date")
    Date chequeDate
    
    /**
     * Default No Args constructor
     */
    CollegeFundPayment() {
        giftAid = true
        cash = true
    }
    
    /**
     * 
     * @param id
     * @param student
     * @param paymentDate
     * @param amount
     * @param payee
     * @param giftAid
     * @param cash
     * @param chequeDate
     */
    CollegeFundPayment (Integer id, Student student, Date paymentDate, float amount, String payee, boolean giftAid, boolean cash, Date chequeDate) {
        this.id= id;
        this.student = student
        this.paymentDate = paymentDate
        this.amount = amount
        this.payee = payee
        this.giftAid = giftAid
        this.cash = cash
        this.chequeDate = chequeDate
    }
    
    CollegeFundPayment (Student student, Date paymentDate, float amount, String payee, boolean giftAid, boolean cash, Date chequeDate) {
        this(null, student, paymentDate, amount, payee, giftAid, cash, chequeDate)
    }
    
    Integer getStudentId() {
        return student.id
    }
    
    String toString() {
        return payee
    }
}
