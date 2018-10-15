package uk.ac.reigate.domain

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "room_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Room extends CodedEntity {
    
    @OneToOne
    @JoinColumn(name='room_type_id')
    RoomType roomType
    
    @Column(name="capacity")
    Integer capacity
    
    @Column(name="default_rows")
    Integer defaultRows
    
    @Column(name="default_cols")
    Integer defaultCols
    
    /**
     * Default No Args constructor
     */
    Room(){}
    
    /**
     * This constructor is used to create a room using only the basic information
     *
     * @param id The ID to use for the room
     * @param code The code to use for the room
     * @param description A description of the room
     */
    Room(Integer id, String code, String description, RoomType roomType, Integer capacity, Integer defaultRows, Integer defaultCols) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.roomType = roomType;
        this.capacity = capacity;
        this.defaultRows = defaultRows;
        this.defaultCols = defaultCols;
    }
    
    /**
     * This constructor is used to create a room using only the basic information
     * 
     * @param id The ID to use for the room
     * @param code The code to use for the room
     * @param description A description of the room
     */
    Room(Integer id, String code, String description, RoomType roomType, Integer capacity) {
        this(id, code, description, roomType, capacity, null, null);
    }
    
    /**
     * This constructor is used to create a room using only the basic information
     * 
     * @param code The code to use for the room
     * @param description A description of the room
     */
    Room(String code, String description, RoomType roomType, Integer capacity) {
        this(null, code, description, roomType, capacity, null, null);
    }
    
    /**
     * The default toString method    
     */
    String toString() {
        return description
    }
}
