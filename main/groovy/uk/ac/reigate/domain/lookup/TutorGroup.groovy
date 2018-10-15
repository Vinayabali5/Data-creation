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

import uk.ac.reigate.domain.CodedEntity
import uk.ac.reigate.domain.Room
import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.academic.Faculty

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "tutor_group_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode
class TutorGroup extends CodedEntity implements Serializable {
    
    @OneToOne
    @JoinColumn(name='faculty_id')
    Faculty faculty
    
    @OneToOne
    @JoinColumn(name='tutor_id')
    Staff tutor
    
    @OneToOne
    @JoinColumn(name='senior_tutor_id')
    Staff seniorTutor
    
    @OneToOne
    @JoinColumn(name='room_id')
    Room room
    
    @Column(name = "in_use")
    Boolean inUse;
    
    TutorGroup(){}
    
    TutorGroup(Integer id, String code, String description, Faculty faculty) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.faculty = faculty;
    }
    
    TutorGroup(Integer id, String code, String description, Faculty faculty, Staff tutor, Staff seniorTutor, Room room, Boolean inUse) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.faculty = faculty;
        this.tutor = tutor;
        this.seniorTutor = seniorTutor;
        this.room = room;
        this.inUse = inUse;
    }
    
    TutorGroup(String code, String description, Faculty faculty, Staff tutor, Staff seniorTutor, Room room, Boolean inUse) {
        this(null, code, description, faculty, tutor, seniorTutor, room, inUse);
    }
    
    String toString() {
        return code
    }
}

