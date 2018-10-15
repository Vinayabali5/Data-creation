package uk.ac.reigate.domain.admissions

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.BaseEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "college_fund_paid_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class CollegeFundPaid extends BaseEntity {
    
    @Column(name="college_fund_paid")
    String collegeFundPaid
    
    /**
     * Default No Args constructor
     */
    CollegeFundPaid(){}
    
    /**
     * 
     * @param id
     * @param collegeFundPaid
     */
    CollegeFundPaid(Integer id, String collegeFundPaid){
        this.id = id;
        this.collegeFundPaid = collegeFundPaid;
    }
    
    CollegeFundPaid(String collegeFundPaid){
        this(null, collegeFundPaid)
    }
    
    String toString() {
        return collegeFundPaid
    }
}
