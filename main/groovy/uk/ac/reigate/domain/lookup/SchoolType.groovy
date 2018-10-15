package uk.ac.reigate.domain.lookup

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.CodedEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "school_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class SchoolType extends CodedEntity {
    
    SchoolType(){}
    
    SchoolType(Integer id, String code, String description) {
        this.id = id
        this.code = code;
        this.description = description;
    }
    
    SchoolType(String code, String description) {
        this(null, code, description);
    }
    /**
     * toString method the returns the "code" of the SchoolType
     */
    String toString() {
        return code
    }
}
