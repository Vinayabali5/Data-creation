package uk.ac.reigate.domain.exam

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.academic.Student;;

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "candidate_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Candidate extends BaseEntity {
    
    @OneToOne
    @JoinColumn(name="student_id", nullable=false)
    Student student
    
    @Column(name="candidate_number",nullable=false)
    Integer candidateNumber
    
    Candidate(){}
    
    Candidate(Integer id, Student student, Integer candidateNumber){
        this.id= id;
        this.student = student;
        this.candidateNumber = candidateNumber;
    }
    
    Candidate(Student student, Integer candidateNumber){
        this(null, student, candidateNumber)
    }
    
    String toString() {
        return student
    }
}
