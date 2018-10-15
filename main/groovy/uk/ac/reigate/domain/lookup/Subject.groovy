package uk.ac.reigate.domain.lookup

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
@Table(name="subject")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "subject_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Subject extends CodedEntity implements Serializable {
    
    Subject() {}
    
    Subject(Integer id, String code, String description) {
        this.id = id
        this.code = code;
        this.description = description;
    }
    
    Subject(String code, String description) {
        this(null, code, description);
    }
    
    String toString() {
        return description
    }
}
