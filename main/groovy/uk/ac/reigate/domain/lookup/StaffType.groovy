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
    @AttributeOverride(name = "id", column = @Column(name = "staff_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class StaffType extends CodedEntity{
    
    @Column(name='need_initials')
    Boolean needInitials
    
    StaffType(){}
    
    StaffType(Integer id, String code, String description, Boolean needInitials) {
        this.id = id
        this.code = code;
        this.description = description;
        this.needInitials = needInitials;
    }
    
    StaffType(String code, String description, Boolean needInitials) {
        this(null, code, description, needInitials);
    }
    
    String toString() {
        return description
    }
}
