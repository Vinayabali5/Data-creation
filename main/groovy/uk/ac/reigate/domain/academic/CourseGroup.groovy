package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode;

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToMany;
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.lookup.YearGroup

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "course_group_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class CourseGroup extends BaseEntity {
    
    /**
     * The YearGroup for the CourseGroup.  
     */
    @NotNull
    @OneToOne
    @JoinColumn(name='year_group_id')
    YearGroup yearGroup
    
    /**
     * The Course that is being taught in the CourseGroup.
     */
    @NotNull
    @OneToOne
    @JoinColumn(name='course_id')
    Course course
    
    /**
     * The AcademicYear that this CourseGroup is offered in.
     */
    @NotNull
    @OneToOne
    @JoinColumn(name='academic_year_id')
    AcademicYear year
    
    /**
     * This field is the group code for the CourseGroup. These will be used to identify one group from another in the same level and subject. 
     */
    @NotNull
    @Column(name = 'code', length = 10)
    String code
    
    /**
     * This is the Department that runs this CourseGroup
     */
    @OneToOne
    @JoinColumn(name='department_id')
    Department department
    
    /**
     * This is the member of Staff that is the Course Leader for this CourseGroup.
     */
    @OneToOne
    @JoinColumn(name='course_leader_id')
    Staff courseLeader
    
    /**
     * This fields is used to determine if the CourseGroup should be displayed on the timetable.
     */
    @Column(name="display_on_timetable")
    Boolean displayOnTimetable
    
    /**
     * This field is used to determine if this CourseGroup has a register. 
     */
    @Column(name="has_register")
    Boolean hasRegister
    
    /**
     * This is a notes field to be used to provided details about the CourseGroup.
     */
    @Column(name="notes")
    String notes
    
    @Column(name="start_date")
    Date startDate
    
    @Column(name="end_date")
    Date endDate
    
    /**
     * The default Planned Learning Hours to use for this Course Group
     */
    @Column(name = 'plh')
    Integer plh
    
    /**
     * The default Planned Support Hours to use for this Course Group
     */
    @Column(name = 'peeph')
    Integer peeph
    
    /**
     * The Course Group spec is a calculated fields that is produced by the SQL database. This is a READ-ONLY field.
     */
    @Column(name = "COURSEGROUPSPEC", updatable = false, insertable = false, columnDefinition = "nvarchar")
    String spec
    
    @OneToMany(mappedBy = 'courseGroup')
    List<Enrolment> enrolments
    
    CourseGroup(){}
    
    CourseGroup(Integer id, YearGroup yearGroup, Course course, AcademicYear year, String code, Department department, Staff courseLeader, Boolean displayOnTimetable, Boolean hasRegister, String notes, String spec, Integer plh, Integer peeph){
        this.id = id;
        this.yearGroup = yearGroup;
        this.course = course;
        this.year = year;
        this.code = code;
        this.department = department;
        this.courseLeader = courseLeader;
        this.displayOnTimetable = displayOnTimetable;
        this.hasRegister = hasRegister;
        this.notes = notes;
        this.spec = spec;
        this.plh = plh;
        this.peeph = peeph;
    }
    
    CourseGroup(YearGroup yearGroup, Course course, AcademicYear year, String code, Department department, Staff courseLeader, Boolean displayOnTimetable, Boolean hasRegister, String notes, String spec, Integer plh, Integer peeph){
        this(null, yearGroup, course, year, code, department, courseLeader, displayOnTimetable, hasRegister, notes, spec, plh, peeph)
    }
    
    String toString() {
        return yearGroup + '-' + course + '-' + code
    }
}
