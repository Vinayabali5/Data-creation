package uk.ac.reigate.domain.exam

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

import javax.persistence.Embeddable
import uk.ac.reigate.domain.academic.Student


@Embeddable
@EqualsAndHashCode(includeFields=true)
@Canonical
class StudentOptionEntryPk implements Serializable {
    
    Integer student
    
    Integer examOption
    
    /**
     * Default NoArgs constructor
     */
    StudentOptionEntryPk() {}
    
    /**
     * Default fields based constructor
     * 
     * @param student the studentId to use to create the object
     * @param option the academicYearId to use to create the object
     */
    StudentOptionEntryPk(Integer student, Integer examOption) {
        super();
        this.student = student;
        this.examOption = examOption;
    }
    
    /**
     * Default fields based constructor
     * 
     * @param student the Student object to use to create the object
     * @param option the AcademicYear object to use to create the object
     */
    StudentOptionEntryPk(Student student, ExamOption examOption) {
        super();
        this.student = student.id;
        this.examOption = examOption.examOptionId;
    }
    StudentOptionEntryPk(StudentOptionEntry studentOptionEntry){
        this.student =  studentOptionEntry.student.id
        this.examOption = studentOptionEntry.examOption.examOptionId
    }
}
