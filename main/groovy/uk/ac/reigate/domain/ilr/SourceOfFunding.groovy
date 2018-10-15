package uk.ac.reigate.domain.ilr

import java.util.Date;

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "source_of_funding_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class SourceOfFunding extends ILREntity {
    
    SourceOfFunding() {}
    
    SourceOfFunding(Integer id, String code, String description, String shortDescription,  Date validFrom, Date validTo) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.shortDescription = shortDescription;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }
    
    SourceOfFunding(String code, String description, String shortDescription,  Date validFrom, Date validTo){
        this(null, code, description, shortDescription, validFrom, validTo);
    }
    
    String toString() {
        return description
    }
}
