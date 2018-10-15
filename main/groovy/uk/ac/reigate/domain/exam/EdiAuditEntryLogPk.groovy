package uk.ac.reigate.domain.exam

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

import javax.persistence.Embeddable
import uk.ac.reigate.domain.academic.Student


@Embeddable
@EqualsAndHashCode(includeFields=true)
@Canonical
class EdiAuditEntryLogPk implements Serializable {
    
    Integer student
    
    Integer examOption
    
    Integer ediAuditFileLog
    
    /**
     * Default NoArgs constructor
     */
    EdiAuditEntryLogPk() {}
    
    /**
     * Default fields based constructor
     * 
     * @param student the studentId to use to create the object
     * @param examOption the academicYearId to use to create the object
     */
    EdiAuditEntryLogPk(Integer student, Integer examOption, Integer ediAuditFileLog) {
        super();
        this.student = student;
        this.examOption = examOption;
        this.ediAuditFileLog = ediAuditFileLog;
    }
    
    /**
     * Default fields based constructor
     * 
     * @param student the Student object to use to create the object
     * @param examOption the AcademicYear object to use to create the object
     */
    EdiAuditEntryLogPk(Student student, ExamOption examOption, EdiAuditFileLog ediAuditFileLog) {
        super();
        this.student = student.id;
        this.examOption = examOption.id;
        this.ediAuditFileLog = ediFileAuditLog.id
    }
}
