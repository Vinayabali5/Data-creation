package uk.ac.reigate.domain.lookup

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.NamedEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "contact_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class ContactType extends NamedEntity implements Serializable{
    
    ContactType() { }
    
    ContactType(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    ContactType(String name, String description){
        this(null, name, description);
    }
    
    String toString() {
        return description
    }
}
