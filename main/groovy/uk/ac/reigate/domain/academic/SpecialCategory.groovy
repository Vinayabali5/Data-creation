package uk.ac.reigate.domain.academic

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity

import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.CodedEntity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "special_category_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class SpecialCategory extends CodedEntity {
    
    @Column(name="details")
    String details
    
    @Column(name="priority")
    Integer priority
    
    /**
     * Default No Args constructor
     */
    SpecialCategory(){}
    
    SpecialCategory(Integer id, String code, String description, String details, Integer priority) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.details = details
        this.priority = priority
    }
    
    SpecialCategory(String code, String description, String details, Integer priority) {
        this(null, code, description, details, priority)
    }
    
    String toString() {
        return description
    }
}
