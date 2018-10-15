package uk.ac.reigate.domain.ilr

import groovy.transform.EqualsAndHashCode

import java.util.Date;

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate



@Entity
@Table(name = 'mcf')
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "mcf_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class MathsConditionOfFunding extends ILREntity {
    
    MathsConditionOfFunding() {}
    
    MathsConditionOfFunding(Integer id, String code, String description, String shortDescription,  Date validFrom, Date validTo) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.shortDescription = shortDescription;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }
    
    MathsConditionOfFunding(String code, String description, String shortDescription,  Date validFrom, Date validTo){
        this(null, code, description, shortDescription, validFrom, validTo);
    }
    
    String toString() {
        return description
    }
}
