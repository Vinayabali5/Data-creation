package uk.ac.reigate.domain.system

import java.io.Serializable

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import groovy.transform.EqualsAndHashCode
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.NamedEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "letter_template_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class LetterTemplate extends BaseEntity implements Serializable {
    
    @Column(name= 'name')
    String name
    
    @Column(name = 'description')
    String description
    
    @Column(name = 'template_text')
    String templateText
    
    @Column(name = 'in_use')
    Boolean inUse
    
    
    LetterTemplate(){
    }
    
    LetterTemplate(Integer id, String name, String description, String templateText, Boolean inUse){
        this.id = id
        this.name = name
        this.description = description
        this.templateText = templateText
        this.inUse = inUse
    }
}