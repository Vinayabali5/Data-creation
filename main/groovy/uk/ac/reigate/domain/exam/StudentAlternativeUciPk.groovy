package uk.ac.reigate.domain.exam

import groovy.transform.Canonical;
import groovy.transform.EqualsAndHashCode

import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Id
import uk.ac.reigate.domain.academic.Student

@Embeddable
@Canonical
@EqualsAndHashCode(includeFields=true)
class StudentAlternativeUciPk implements Serializable  {
    
    
    Integer student
    
    Integer examBoard
    
    StudentAlternativeUciPk() {}
    
    StudentAlternativeUciPk(Integer student, Integer examBoard){
        this.student = student;
        this.examBoard = examBoard;
    }
    
    StudentAlternativeUciPk(Student student, ExamBoard examBoard){
        this.student = student.id;
        this.examBoard = examBoard.id;
    }
    
    StudentAlternativeUciPk(StudentAlternativeUci studentAlternativeUci) {
        this.student = studentAlternativeUci.student.id
        this.examBoard = studentAlternativeUci.examBoard.id
    }
}