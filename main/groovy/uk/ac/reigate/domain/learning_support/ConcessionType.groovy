package uk.ac.reigate.domain.learning_support

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.CodedEntityNoIdentity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "concession_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode
class ConcessionType extends CodedEntityNoIdentity {
    
    /**
     * Default No Args constructor
     */
    ConcessionType() {}
    
    /**
     * 
     * @param id
     * @param code
     * @param description
     */
    ConcessionType(Integer id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
    
    ConcessionType(String code, String description) {
        this(null, code, description)
    }
    
    String toString() {
        return description
    }
}
