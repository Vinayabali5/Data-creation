package uk.ac.reigate.domain.exam

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.CodedEntity
import javax.persistence.Table;

@Entity
@Table(name = "status_type", catalog = "CID", schema = "Exams")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "status_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class StatusType extends CodedEntity implements Serializable {
    
    StatusType(){}
    
    StatusType(Integer id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
    
    StatusType(String code, String description) {
        this(null, code, description);
    }
    
    String toString() {
        return description
    }
}
