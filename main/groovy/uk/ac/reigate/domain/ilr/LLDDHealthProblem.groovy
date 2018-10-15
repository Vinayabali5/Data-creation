package uk.ac.reigate.domain.ilr

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.CodedEntity


@Entity
@Table(name='lldd_health_problem')
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "lldd_health_problem_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class LLDDHealthProblem extends CodedEntity {
    
    @Column(name="short_description")
    String shortDescription
    
    @Column(name="valid_from")
    Date validFrom
    
    @Column(name="valid_to")
    Date validTo
    
    LLDDHealthProblem(){}
    
    LLDDHealthProblem(Integer id, String code, String description, String shortDescription, Date validFrom, Date validTo) {
        this.id = id
        this.code = code;
        this.description = description;
        this.shortDescription = shortDescription;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }
    
    LLDDHealthProblem(String code, String description, String shortDescription, Date validFrom, Date validTo) {
        this(null, code, description, shortDescription, validFrom, validTo);
    }
    
    String toString() {
        return code + ' - ' + shortDescription
    }
}
