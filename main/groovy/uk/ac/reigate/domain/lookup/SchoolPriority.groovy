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
    @AttributeOverride(name = "id", column = @Column(name = "school_priority_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class SchoolPriority extends CodedEntity {
    
    SchoolPriority() {}
    
    SchoolPriority(Integer id, String code, String description) {
        this.id = id
        this.code = code;
        this.description = description;
    }
    
    SchoolPriority(String code, String description) {
        this(null, code, description);
    }
    
    String toString() {
        return this.description + ' (' + this.code + ')'
    }
}
