package uk.ac.reigate.domain.academic

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.OneToMany

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import groovy.transform.Canonical
import uk.ac.reigate.domain.CodedEntityNoIdentity

@Entity
@Canonical(excludes=["holidays"])
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "academic_year_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
class AcademicYear extends CodedEntityNoIdentity {
    
    @Column(name="start_date")
    Date startDate
    
    @Column(name="end_date")
    Date endDate
    
    @OneToMany(mappedBy='year', fetch = FetchType.LAZY)
    Set<Holiday> holidays
    
    /**
     * Default NoArgs constructor
     */
    AcademicYear(){}
    
    /**
     * Default property based constructor
     * 
     * @param id the id for the academic year
     * @param code the textual code for the academic year
     * @param description the description for the academic year
     * @param startDate the start date for the academic year
     * @param endDate the end date for the academic year
     */
    AcademicYear(Integer id, String code, String description, Date startDate, Date endDate) {
        this.id = id
        this.code = code;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    AcademicYear(String code, String description, Date startDate, Date endDate) {
        this(null, code, description, startDate, endDate);
    }
    
    String toString() {
        return this.description + ' (' + this.code + ')'
    }
}
