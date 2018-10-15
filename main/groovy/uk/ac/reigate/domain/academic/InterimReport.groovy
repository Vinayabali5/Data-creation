package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.CodedEntity



@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "interim_report_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class InterimReport extends CodedEntity {
    
    @OneToOne
    @JoinColumn(name = "academic_year_id")
    AcademicYear year
    
    @Column(name="start_date")
    Date startDate
    
    @Column(name="end_date")
    Date endDate
    
    @Column(name="publish_date")
    Date publishDate
    
    @Column(name="active")
    Boolean active
    
    InterimReport() {}
    
    InterimReport(Integer id, String code, String description, AcademicYear year, Date startDate, Date endDate, Date publishDate, Boolean active){
        this.id = id;
        this.code = code;
        this.description = description;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
        this.publishDate = publishDate;
        this.active = active;
    }
    
    InterimReport(String code, String description, AcademicYear year, Date startDate, Date endDate, Date publishDate, Boolean active){
        this(null, code, description, year, startDate, endDate, publishDate, active)
    }
    
    String toString() {
        return description
    }
}

