package uk.ac.reigate.domain

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;

/**
 * This is a lookup table that describes different types of Note object that can be created.
 * 
 * @author Michael Horgan
 *
 */
@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "note_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class NoteType extends CodedEntity {
    
    /**
     * Default No Args constructor
     */
    NoteType(){}
    
    /**
     * 
     * @param id
     * @param code
     * @param description
     */
    NoteType(Integer id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
    
    NoteType(String code, String description) {
        this(null, code, description)
    }
    
    String toString() {
        return description
    }
}
