package uk.ac.reigate.domain.lookup

import groovy.transform.EqualsAndHashCode

import java.util.Date

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.NamedEntity
import uk.ac.reigate.domain.academic.AcademicYear

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "reporting_period_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class ReportingPeriod extends BaseEntity{
    
    @OneToOne
    @JoinColumn(name = 'academic_year_id')
    AcademicYear academicYear
    
    @Column(name='name', columnDefinition = "nvarchar")
    String name
    
    @Column(name="start_date")
    Date startDate
    
    @Column(name="end_date")
    Date endDate
    
    ReportingPeriod() { }
    
    ReportingPeriod(Integer id, AcademicYear academicYear, String name, Date startDate, Date endDate) {
        this.id = id;
        this.academicYear = academicYear;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    ReportingPeriod(AcademicYear academicYear, String name, Date startDate, Date endDate){
        this(null, academicYear, name, startDate, endDate);
    }
    
    String toString() {
        return name
    }
}
