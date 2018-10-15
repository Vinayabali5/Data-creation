package uk.ac.reigate.domain.ilr

import groovy.transform.EqualsAndHashCode

import java.io.Serializable

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.CodedEntityNoIdentity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "destination_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Destination extends CodedEntityNoIdentity {
    
    @Column(name="type")
    String type
    
    @Column(name="short_description")
    String shortDescription
    
    @Column(name='valid_from',columnDefinition="smalldatetime")
    Date validFrom
    
    @Column(name='valid_to',columnDefinition="smalldatetime")
    Date validTo
    
    
    Destination(){ }
    
    Destination(Integer id, String type, String code, String description, String shortDescription, Date validFrom, Date validTo){
        this.id = id
        this.type = type
        this.code = code;
        this.description = description;
        this.shortDescription = shortDescription
        this.validFrom = validFrom
        this.validTo = validTo
    }
    
    Destination(String type, String code, String description, String shortDescription, Date validFrom, Date validTo){
        this(null, type, code, description, shortDescription, validFrom, validTo )
    }
    
    String toString() {
        return description
    }
}
