package uk.ac.reigate.domain.admissions

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
    @AttributeOverride(name = "id", column = @Column(name = "application_status_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class ApplicationStatus extends CodedEntity implements Serializable {
    
    @Column(name = 'consider_withdrawn')
    Boolean considerWithdrawn
    /**
     * Default No Args constructor
     */
    ApplicationStatus(){}
    
    /**
     * 
     * @param id
     * @param code
     * @param description
     */
    ApplicationStatus(Integer id, String code, String description, Boolean considerWithdrawn) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.considerWithdrawn = considerWithdrawn;
    }
    
    ApplicationStatus(String code, String description, Boolean considerWithdrawn) {
        this(null, code, description, considerWithdrawn)
    }
    
    String toString() {
        return this.description
    }
}
