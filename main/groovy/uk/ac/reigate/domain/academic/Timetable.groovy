package uk.ac.reigate.domain.academic

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.OneToMany
import javax.persistence.OneToOne

import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.Room
import uk.ac.reigate.domain.Staff
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "timetable_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Timetable extends BaseEntity {
    
    @OneToOne
    @JoinColumn(name='course_group_id')
    CourseGroup courseGroup
    
    @OneToOne
    @JoinColumn(name='period_id')
    Period period
    
    @OneToOne
    @JoinColumn(name='room_id')
    Room room
    
    @OneToOne
    @JoinColumn(name='teacher_id')
    Staff teacher
    
    @OneToMany
    @JoinTable(
    joinColumns=@JoinColumn(name='timetable_id', referencedColumnName="timetable_id"),
    inverseJoinColumns=@JoinColumn(name='staff_id', referencedColumnName="staff_id")
    )
    Set<Staff> additionalStaff
    
    @Column(name="valid_from")
    Date validFrom
    
    @Column(name="valid_to")
    Date validTo
    
    /**
     * Default No Args constructor
     */
    Timetable() {}
    
    Timetable(Integer id, CourseGroup courseGroup, Period period, Room room, Staff teacher, Date validFrom, Date validTo){
        this.id = id;
        this.courseGroup = courseGroup;
        this.period = period;
        this.room = room;
        this.teacher = teacher;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }
    
    Timetable(CourseGroup courseGroup, Period period, Room room, Staff teacher, Date validFrom, Date validTo ){
        this(null, courseGroup, period, room, teacher, validFrom, validTo);
    }
    
    String toString() {
        return courseGroup.id
    }
}
