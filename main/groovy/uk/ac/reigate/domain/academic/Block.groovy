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
    @AttributeOverride(name = "id", column = @Column(name = "block_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Block extends CodedEntity {
    
    @Column(name = 'html_colour')
    String htmlColour
    
    @Column(name = 'access_colour')
    String accessColour
    
    Block(){}
    
    Block(Integer id, String code, String description, String htmlColour) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.htmlColour = htmlColour;
    }
    
    Block(String code, String description, String htmlColour) {
        this(null, code, description, htmlColour)
    }
    
    String toString() {
        return description
    }
}
