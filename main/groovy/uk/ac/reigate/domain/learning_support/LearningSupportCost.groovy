package uk.ac.reigate.domain.learning_support

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import groovy.transform.EqualsAndHashCode
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.academic.Student



@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "learning_support_cost_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class LearningSupportCost extends BaseEntity {
    
    @NotNull
    @OneToOne
    @JoinColumn(name = 'student_id')
    Student student
    
    @Column(name = 'start_date')
    Date startDate
    
    @Column(name = 'end_date')
    Date endDate
    
    @Column(name = 'hours_per_week')
    Double hoursPerWeek
    
    @Column(name = 'weeks')
    Double weeks
    
    @Column(name = 'rate')
    Double rate
    
    @OneToOne
    @JoinColumn(name = 'learning_support_cost_category_id')
    LearningSupportCostCategory costCategory
    
    @Column(name='description')
    String description
    
    @Column(name='period_description')
    String periodDescription
    
    @OneToOne
    @JoinColumn(name = 'staff_id')
    Staff staff
    
    
    /**
     * Default No Args constructor
     */
    LearningSupportCost() {}
    
    LearningSupportCost(Integer id, Student student, Date startDate, Date endDate, Double hoursPerWeek, Double weeks, Double rate, LearningSupportCostCategory costCategory, String description, String periodDescription, Staff staff) {
        this.id = id;
        this.student = student;
        this.startDate = startDate;
        this.endDate = endDate;
        this.hoursPerWeek = hoursPerWeek;
        this.weeks = weeks;
        this.rate = rate;
        this.costCategory = costCategory;
        this.description = description;
        this.periodDescription = periodDescription;
        this.staff = staff;
    }
    
    LearningSupportCost(Student student, Date startDate, Date endDate, Double hoursPerWeek, Double weeks, Double rate, LearningSupportCostCategory costCategory, String description, String periodDescription, Staff staff) {
        this(null, student, startDate, endDate, hoursPerWeek, weeks, rate, costCategory, description, periodDescription, staff)
    }
    
    String toString() {
        return description
    }
}
