package uk.ac.reigate.domain.lookup

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.NamedEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "nationality_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Nationality extends NamedEntity implements Serializable {
    
    Nationality(){}
    
    Nationality(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    Nationality(String name, String description){
        this(null, name, description);
    }
    
    String toString() {
        return description
    }
}
