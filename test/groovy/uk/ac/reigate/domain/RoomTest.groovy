package uk.ac.reigate.domain;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.CourseGroup;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject


public class RoomTest {
    
    Person createPerson() {
        Person person = new Person()
    }
    
    RoomType createRoomType() {
        RoomType roomType = new RoomType()
    }
    
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        String code = 't'
        String description = 'tt'
        RoomType roomType = createRoomType()
        Integer capacity = 1
        
        Room room = new Room(code, description, roomType, capacity)
        
        assertNotNull(room)
        assertEquals(room.code, code)
        assertEquals(room.roomType.id, roomType.id)
        assertEquals(room.description, description)
        assertEquals(room.capacity, capacity)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 't'
        String description = 'tt'
        RoomType roomType = createRoomType()
        Integer capacity = 1
        
        Room room = new Room(id, code, description, roomType, capacity)
        
        assertNotNull(room)
        assertEquals(room.code, code)
        assertEquals(room.roomType.id, roomType.id)
        assertEquals(room.description, description)
        assertEquals(room.capacity, capacity)
    }
    
    @Test
    void testMethod_ToString() {
        Room room = new Room()
        
        assertEquals(room.description, room.toString())
    }
}
