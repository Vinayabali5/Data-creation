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
    @AttributeOverride(name = "id", column = @Column(name = "offer_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class OfferType extends CodedEntity {
    
    OfferType(){}
    
    OfferType(Integer id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
    
    OfferType(String code, String description) {
        this(null, code, description)
    }
    
    String toString() {
        return this.description + ' (' + this.code + ')'
    }
}
