package uk.ac.reigate.domain.lookup

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.CodedEntity
import uk.ac.reigate.domain.CodedEntityNoIdentity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "punctuality_monitoring_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class PunctualityMonitoring extends CodedEntityNoIdentity {
    
    @Column(name='warning_colour')
    String warningColour
    
    PunctualityMonitoring(){}
    
    PunctualityMonitoring(Integer id, String code, String description, String warningColour) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.warningColour = warningColour;
    }
    
    PunctualityMonitoring(String code, String description, String warningColour) {
        this(null, code, description, warningColour);
    }
    
    String toString() {
        return description
    }
}
