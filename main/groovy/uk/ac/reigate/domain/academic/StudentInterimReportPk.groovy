package uk.ac.reigate.domain.academic

import groovy.transform.Canonical;
import groovy.transform.EqualsAndHashCode

import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Id

@Embeddable
@Canonical
@EqualsAndHashCode(includeFields=true)
class StudentInterimReportPk implements Serializable {
    
    //    @Id
    //    @Column(name = "student_id")
    Integer student
    
    //    @Id
    //    @Column(name = "interim_report_id")
    Integer interimReport
    
    //    @Id
    //    @Column(name = "course_id")
    Integer course
    
    StudentInterimReportPk() {}
    
    StudentInterimReportPk(Integer student, Integer interimReport, Integer course){
        this.student = student;
        this.interimReport = interimReport;
        this.course = course;
    }
    
    StudentInterimReportPk(Student student, InterimReport interimReport, Course course){
        this.student = student.id;
        this.interimReport = interimReport.id;
        this.course = course.id
    }
    
}