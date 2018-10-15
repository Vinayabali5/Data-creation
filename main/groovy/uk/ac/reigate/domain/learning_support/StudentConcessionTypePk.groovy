package uk.ac.reigate.domain.learning_support

import javax.persistence.Embeddable

import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.academic.Student

@Embeddable
@EqualsAndHashCode(includeFields=true)
class StudentConcessionTypePk implements Serializable {
    
    Integer student
    
    Integer concessionType
    
    StudentConcessionTypePk() {}
    
    StudentConcessionTypePk(Integer student, Integer concessionType) {
        super();
        this.student = student;
        this.concessionType = concessionType;
    }
    
    StudentConcessionTypePk(Student student, ConcessionType concessionType) {
        super();
        this.student = student.id;
        this.concessionType = concessionType.id;
    }
    
    StudentConcessionTypePk(StudentConcessionType studentConcessionType){
        this.student = studentConcessionType.student.id
        this.concessionType = studentConcessionType.concessionType.id
    }
}
