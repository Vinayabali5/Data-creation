package uk.ac.reigate.domain.lookup

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.CodedEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "possible_grade_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class PossibleGrade extends CodedEntity {
    
    @OneToOne
    @JoinColumn(name = 'possible_grade_set_id')
    PossibleGradeSet gradeSet
    
    @OneToOne
    @JoinColumn(name='level_id')
    Level level
    
    @Column(name='grade')
    String grade
    
    @Column(name='ucas_points')
    Integer ucasPoints
    
    @Column(name = 'key_assessment_grade')
    Boolean useForKeyAssessment
    
    PossibleGrade(){}
    
    PossibleGrade(Integer id, String code, String description, PossibleGradeSet gradeSet, Level level, String grade, Integer ucasPoints, Boolean useForKeyAssessment) {
        this.id = id
        this.code = code;
        this.description = description;
        this.gradeSet = gradeSet;
        this.level = level;
        this.grade = grade;
        this.ucasPoints = ucasPoints;
        this.useForKeyAssessment = useForKeyAssessment;
    }
    
    PossibleGrade(String code, String description, PossibleGradeSet gradeSet, Level level, String grade, Integer ucasPoints, Boolean useForKeyAssessment) {
        this(null, code, description, gradeSet, level, grade, ucasPoints, useForKeyAssessment);
    }
    
    String toString() {
        return description
    }
}
