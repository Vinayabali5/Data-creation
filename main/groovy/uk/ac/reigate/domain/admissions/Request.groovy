package uk.ac.reigate.domain.admissions

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.academic.AcademicYear
import uk.ac.reigate.domain.academic.Student;

import com.fasterxml.jackson.annotation.JsonIgnore

import groovy.transform.EqualsAndHashCode;

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "request_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Request extends BaseEntity implements Serializable {
    
    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name='student_id')
    Student student
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name='academic_year_id')
    AcademicYear academicYear
    
    @Column(name="request")
    String request
    
    @Column(name="core_aim")
    Boolean coreAim
    
    @Column(name="broadening_subject")
    Boolean broadeningSubject
    
    @Column(name="chosen_against_advice")
    Boolean chosenAgainstAdvice
    
    @Column(name="allocated")
    Boolean allocated
    
    /**
     * Default NoArgs constructor
     */
    Request() {}
    
    Request(Integer id, Student student, String request, AcademicYear academicYear, Boolean coreAim, Boolean broadeningSubject, Boolean chosenAgainstAdvice, Boolean allocated) {
        this.id = id;
        this.student = student;
        this.request = request;
        this.academicYear = academicYear;
        this.coreAim = coreAim;
        this.broadeningSubject = broadeningSubject;
        this.chosenAgainstAdvice = chosenAgainstAdvice;
        this.allocated = allocated;
    }
    
    Request(Student student, String request, AcademicYear academicYear, Boolean coreAim, Boolean broadeningSubject, Boolean chosenAgainstAdvice, Boolean allocated){
        this.student = student;
        this.request = request;
        this.academicYear = academicYear;
        this.coreAim = coreAim;
        this.broadeningSubject = broadeningSubject;
        this.chosenAgainstAdvice = chosenAgainstAdvice;
        this.allocated = allocated;
    }
    
    Request(Student student, String request) {
        this.student = student;
        this.request = request;
    }
    
    Integer getApplicationId() {
        return student.id
    }
    
    String toString() {
        return request
    }
}
