package uk.ac.reigate.domain;

import static org.junit.Assert.*

import org.junit.Test


public class RoomTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        Boolean timetableable = true
        RoomType roomType = new RoomType(code, description, timetableable)
        
        assertNotNull(roomType)
        assertEquals(roomType.code, code)
        assertEquals(roomType.description, description)
        assertEquals(roomType.timetableable, timetableable)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        Boolean timetableable = true
        RoomType roomType = new RoomType(id, code, description, timetableable)
        
        assertNotNull(roomType)
        assertEquals(roomType.id, id)
        assertEquals(roomType.code, code)
        assertEquals(roomType.description, description)
        assertEquals(roomType.timetableable, timetableable)
    }
    
    @Test
    void testMethod_ToString() {
        RoomType roomType = new RoomType()
        roomType.description = 'TEST'
        
        assertEquals(roomType.description, roomType.toString())
    }
}
