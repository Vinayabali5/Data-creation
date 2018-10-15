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
@Table(name = "edi_status_type", catalog = "CID", schema = "Exams")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "edi_status_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class EdiStatusType extends CodedEntity implements Serializable {
    
    EdiStatusType(){}
    
    EdiStatusType(Integer id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
    
    EdiStatusType(String code, String description) {
        this(null, code, description);
    }
    
    String toString() {
        return description
    }
}
