package uk.ac.reigate.domain.learning_support

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import groovy.transform.EqualsAndHashCode
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.BaseEntityNoIdentity
import uk.ac.reigate.domain.ilr.LLDDHealthProblemCategory

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "referral_reason_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class ReferralReason extends BaseEntityNoIdentity {
    
    @Column(name = 'referral_reason')
    String reason
    
    @OneToOne
    @JoinColumn(name = 'lldd_health_problem_category_id')
    LLDDHealthProblemCategory llddHealthProblemCategory
    
    /**
     * Default No Args constructor
     */
    ReferralReason() {}
    
    ReferralReason(Integer id, String reason, LLDDHealthProblemCategory llddHealthProblemCategory) {
        this.id = id;
        this.reason = reason;
        this.llddHealthProblemCategory = llddHealthProblemCategory;
    }
    
    ReferralReason(String reason, LLDDHealthProblemCategory llddHealthProblemCategory) {
        this(null, reason, llddHealthProblemCategory)
    }
    
    String toString() {
        return reason
    }
}
