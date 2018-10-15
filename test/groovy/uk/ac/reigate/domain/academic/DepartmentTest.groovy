package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;


public class DepartmentTest {
    
    Faculty createFaculty() {
        Faculty faculty = new Faculty()
    }
    
    Staff createHod() {
        Staff hod = new Staff()
    }
    
    Staff createHod2() {
        Staff hod2 = new Staff()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String name = 'maths'
        String description = 'mathematics'
        Faculty faculty = createFaculty()
        Staff hod = createHod()
        Staff hod2 = createHod2()
        Boolean academic = true
        
        Department department = new Department(name, description, faculty, hod, hod2, true)
        
        assertNotNull(department)
        assertEquals(department.faculty.id, faculty.id)
        assertEquals(department.name, name)
        assertEquals(department.description, description)
        assertEquals(department.hod.id, hod.id)
        assertEquals(department.hod2.id, hod2.id)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String name = 'maths'
        String description = 'mathematics'
        Faculty faculty = createFaculty()
        Staff hod = createHod()
        Staff hod2 = createHod2()
        Boolean academic = true
        
        Department department = new Department(id, name, description, faculty, hod, hod2, true)
        
        assertNotNull(department)
        assertEquals(department.faculty.id, faculty.id)
        assertEquals(department.name, name)
        assertEquals(department.description, description)
        assertEquals(department.hod.id, hod.id)
        assertEquals(department.hod2.id, hod2.id)
    }
    
    @Test
    void testMethod_ToString() {
        Department department = new Department()
        department.description = 'TEST'
        
        assertEquals(department.description, department.toString())
    }
}
