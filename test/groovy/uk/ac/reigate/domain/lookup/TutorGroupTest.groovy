package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test

import uk.ac.reigate.domain.Room;
import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.Faculty;



public class TutorGroupTest {
    
    Faculty createFaculty() {
        Faculty faculty = new Faculty()
    }
    
    Staff createTutor() {
        Staff tutor = new Staff()
    }
    
    Staff createSeniorTutor() {
        Staff seniorTutor = new Staff()
    }
    
    Room createRoom() {
        Room room = new Room()
    }
    
    
    
    @Test
    void testConstructor_AllFieldsWithIdAndFaculty() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        Faculty faculty = createFaculty()
        
        TutorGroup tutorGroup = new TutorGroup(id, code, description, faculty)
        
        assertNotNull(tutorGroup)
        assertEquals(tutorGroup.code, code)
        assertEquals(tutorGroup.description, description)
        assertEquals(tutorGroup.faculty.id, faculty.id)
    }
    
    @Test
    void testConstructor_AllFieldsWithIdAndStaff() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        Faculty faculty = createFaculty()
        Staff tutor = createTutor()
        Staff seniorTutor = createSeniorTutor()
        Room room = createRoom()
        Boolean inUse = 0
        TutorGroup tutorGroup = new TutorGroup(id, code, description, faculty, tutor, seniorTutor, room, inUse)
        
        assertNotNull(tutorGroup)
        assertEquals(tutorGroup.code, code)
        assertEquals(tutorGroup.description, description)
        assertEquals(tutorGroup.faculty.id, faculty.id)
        assertEquals(tutorGroup.tutor.id, tutor.id)
        assertEquals(tutorGroup.seniorTutor.id, seniorTutor.id)
        assertEquals(tutorGroup.room.id, room.id)
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        Faculty faculty = createFaculty()
        Staff tutor = createTutor()
        Staff seniorTutor = createSeniorTutor()
        Room room = createRoom()
        Boolean inUse = 1
        TutorGroup tutorGroup = new TutorGroup(code, description, faculty, tutor, seniorTutor, room, inUse)
        
        assertNotNull(tutorGroup)
        assertEquals(tutorGroup.code, code)
        assertEquals(tutorGroup.description, description)
        assertEquals(tutorGroup.faculty.id, faculty.id)
        assertEquals(tutorGroup.tutor.id, tutor.id)
        assertEquals(tutorGroup.seniorTutor.id, seniorTutor.id)
        assertEquals(tutorGroup.room.id, room.id)
    }
    
    @Test
    void testMethod_ToString() {
        TutorGroup tutorGroup = new TutorGroup()
        tutorGroup.code = 'T'
        
        assertEquals(tutorGroup.code, tutorGroup.toString())
    }
}
