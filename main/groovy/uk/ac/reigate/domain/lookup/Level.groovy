package uk.ac.reigate.domain.lookup

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.CodedEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "level_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Level extends CodedEntity {
    
    @OneToOne
    @JoinColumn(name = "possible_grade_set_id")
    PossibleGradeSet possibleGradeSet
    
    @Column(name="progression_to")
    Integer progressionTo
    
    @Column(name = "alis_qual_code", columnDefinition = "nvarchar")
    String alisQualCode
    
    Level() {}
    
    Level(Integer id, String code, String description, PossibleGradeSet possibleGradeSet, Integer progressionTo, String alisQualCode) {
        this.id = id
        this.code = code;
        this.description = description;
        this.possibleGradeSet = possibleGradeSet;
        this.progressionTo = progressionTo;
        this.alisQualCode = alisQualCode;
    }
    
    Level(String code, String description, PossibleGradeSet possibleGradeSet, Integer progressionTo, String alisQualCode) {
        this(null, code, description, possibleGradeSet, progressionTo, alisQualCode);
    }
    
    String toString() {
        return this.description + ' (' + this.code + ')'
    }
}
