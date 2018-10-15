package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity


@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "holiday_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Holiday extends BaseEntity {
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name='academic_year_id')
    AcademicYear year
    
    @Column(name="description")
    String description
    
    @Column(name="start_date")
    Date startDate
    
    @Column(name="end_date")
    Date endDate
    
    @Column(name="half_term")
    Boolean halfTerm
    
    
    
    /**
     * Default No Args constructor
     */
    Holiday(){}
    
    Holiday(Integer id, AcademicYear year, String description, Date startDate, Date endDate, Boolean halfTerm){
        this.id = id;
        this.year = year;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.halfTerm = halfTerm;
    }
    
    Holiday(AcademicYear year, String description, Date startDate, Date endDate, Boolean halfTerm){
        this(null, year, description, startDate, endDate, halfTerm)
    }
    
    String toString(){
        return description;
    }
}
