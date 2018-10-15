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
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.academic.AcademicYear
import uk.ac.reigate.domain.academic.Student

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "warning_code_change_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class WarningCodeChange extends BaseEntity{
    
    @OneToOne
    @JoinColumn(name = 'student_id')
    Student student
    
    @OneToOne
    @JoinColumn(name = 'academic_year_id')
    AcademicYear year
    
    @OneToOne
    @JoinColumn(name = 'previous_am_id')
    AttendanceMonitoring previousAm
    
    @OneToOne
    @JoinColumn(name = 'current_am_id')
    AttendanceMonitoring currentAm
    
    @OneToOne
    @JoinColumn(name = 'previous_pm_id')
    PunctualityMonitoring previousPm
    
    @OneToOne
    @JoinColumn(name = 'current_pm_id')
    PunctualityMonitoring currentPm
    
    @Column(name = 'change_date')
    Date changeDate
    
    WarningCodeChange(){}
    
    
    WarningCodeChange(Integer id, Student student, AcademicYear year, AttendanceMonitoring previousAm, AttendanceMonitoring currentAm, PunctualityMonitoring previousPm, PunctualityMonitoring currentPm, Date changeDate){
        this.id = id;
        this.student = student;
        this.year = year;
        this.previousAm = previousAm;
        this.currentAm = currentAm;
        this.previousPm = previousPm;
        this.currentPm = currentPm;
        this.changeDate = changeDate;
    }
    
    WarningCodeChange(Student student, AcademicYear year, AttendanceMonitoring previousAm, AttendanceMonitoring currentAm, PunctualityMonitoring previousPm, PunctualityMonitoring currentPm, Date changeDate){
        this(null, student, year, previousAm, currentAm, previousPm, currentPm, changeDate)
    }
    
    String toString() {
        return changeDate
    }
}
