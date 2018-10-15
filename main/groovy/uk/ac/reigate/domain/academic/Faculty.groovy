package uk.ac.reigate.domain.academic

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.CodedEntity
import uk.ac.reigate.domain.Staff

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "faculty_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Faculty extends CodedEntity {
    
    /**
     * The hof is the Head of the Faculty
     */
    @OneToOne
    @JoinColumn(name='hof_id')
    Staff hof
    
    /**
     * The dol is the Director of Learning
     */
    @OneToOne
    @JoinColumn(name='dol_id')
    Staff dol
    
    /**
     * The adol is the Associate Director of Learning
     */
    @OneToOne
    @JoinColumn(name='adol_id')
    Staff adol
    
    /**
     * The pd is the Principal Director 
     */
    @OneToOne
    @JoinColumn(name='pd_id')
    Staff pd
    
    /**
     * The apd is the Associate Principal Director 
     */
    @OneToOne
    @JoinColumn(name='apd_id')
    Staff apd
    
    @Column(name="valid_from")
    Date validFrom
    
    @Column(name="valid_to")
    Date validTo
    
    Faculty(){}
    
    Faculty(Integer id, String code, String description, Staff hof, Staff dol, Staff adol, Staff pd, Staff apd, Date validFrom, Date validTo) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.hof =hof;
        this.dol = dol;
        this.adol = adol;
        this.pd = pd;
        this.apd = apd;
        this.validFrom = validFrom
        this.validTo = validTo
    }
    
    Faculty(String code, String description, Staff hof, Staff dol, Staff adol, Staff pd, Staff apd, Date validFrom, Date validTo){
        this(null, code, description, hof, dol, adol, pd, apd, validFrom, validTo)
    }
    
    String toString() {
        return description
    }
}
