package uk.ac.reigate.domain

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.lookup.StaffType

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "staff_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Staff extends BaseEntity {
    
    @NotNull
    @OneToOne(fetch=FetchType.EAGER, cascade=[CascadeType.ALL])
    @JoinColumn(name='person_id')
    Person person
    
    @OneToOne
    @JoinColumn(name='staff_type_id')
    StaffType type
    
    @Column(name="on_timetable")
    Boolean onTimetable
    
    @Column(name="initials")
    String initials
    
    @Column(name="known_as")
    String knownAs
    
    @Column(name="network_login")
    String networkLogin
    
    @Column(name="start_date")
    Date startDate
    
    @Column(name="end_date")
    Date endDate
    
    /**
     * Staff_Ref from cristal
     */
    @Column(name="staff_ref")
    Integer staffRef
    
    /**
     * StaffDetailsID from buildings
     */
    @Column(name="staff_details_id")
    Integer staffDetailsId
    
    Staff(){}
    
    Staff(Integer id, Person person, StaffType type, Boolean onTimetable, String initials, String knownAs, String networkLogin, Date startDate, Date endDate, Integer staffRef, Integer staffDetailsId){
        this.id = id;
        this.person = person;
        this.type = type;
        this.onTimetable = onTimetable;
        this.initials = initials;
        this.knownAs = knownAs;
        this.networkLogin = networkLogin
        this.startDate = startDate;
        this.endDate = endDate;
        this.staffRef = staffRef;
        this.staffDetailsId = staffDetailsId;
    }
    
    Staff(Person person, StaffType type, Boolean onTimetable, String initials, String knownAs, String networkLogin, Date startDate, Date endDate, Integer staffRef, Integer staffDetailsId ){
        this(null, person, type, onTimetable, initials, knownAs, networkLogin, startDate, endDate, staffRef, staffDetailsId)
    }
    
    String toString() {
        return initials + ' - ' + person
    }
}
