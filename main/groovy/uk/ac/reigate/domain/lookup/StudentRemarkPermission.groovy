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
    @AttributeOverride(name = "id", column = @Column(name = "student_remark_permission_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class StudentRemarkPermission extends CodedEntity {
    
    StudentRemarkPermission(){}
    
    StudentRemarkPermission(Integer id, String code, String description) {
        this.id = id
        this.code = code;
        this.description = description;
    }
    
    StudentRemarkPermission(String code, String description) {
        this(null, code, description);
    }
    /**
     * toString method the returns the "code" of the StudentRemarkPermission
     */
    String toString() {
        return code
    }
}
