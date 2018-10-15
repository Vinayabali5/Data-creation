package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.CodedEntity



@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "entry_qualification_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class EntryQualificationType extends CodedEntity {
    
    @Column(name="size")
    float size;
    
    EntryQualificationType() {}
    
    EntryQualificationType(Integer id, String code, String description, float size) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.size = size;
    }
    
    EntryQualificationType(String code, String description, float size) {
        this(null, code, description, size)
    }
    
    String toString() {
        return description
    }
}
