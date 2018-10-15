package uk.ac.reigate.domain.learning_support

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity



@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "initial_assess_level_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class InitialAssessmentLevel extends BaseEntity {
    
    @Column(name = 'initial_assess_level')
    String initialAssessmentLevel
    
    @Column(name = 'abbrv')
    String abbrv
    
    
    /**
     * Default No Args constructor
     */
    InitialAssessmentLevel() {}
    
    /**
     * 
     * @param id
     * @param initialAssessmentLevel
     * @param abbrv
     */
    InitialAssessmentLevel(Integer id, String initialAssessmentLevel, String abbrv) {
        this.id = id;
        this.initialAssessmentLevel = initialAssessmentLevel;
        this.abbrv = abbrv;
    }
    
    InitialAssessmentLevel(String initialAssessmentLevel, String abbrv){
        this(null, initialAssessmentLevel, abbrv)
    }
    
    String toString() {
        return abbrv
    }
}
