package uk.ac.reigate.domain

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate


@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "room_type_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class RoomType extends CodedEntity {
    
    @Column(name="timetableable")
    Boolean timetableable
    
    RoomType() {}
    
    RoomType(Integer id, String code, String description, Boolean timetableable) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.timetableable = timetableable;
    }
    
    RoomType(String code, String description, Boolean timetableable) {
        this(null, code, description, timetableable)
    }
    
    String toString() {
        return description
    }
}
