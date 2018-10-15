package uk.ac.reigate.domain.admissions;

import static org.junit.Assert.*

import org.junit.Test

import uk.ac.reigate.domain.academic.AcademicYear;
import uk.ac.reigate.domain.academic.Student

public class RequestTest {
    
    /**
     * Helper function to create a dummy student
     * 
     * @return a dummy student
     */
    Student createStudent() {
        Student student = new Student()
        student.id = 1
        return student
    }
    
    /**
     * Helper function to create a dummy academic year
     *
     * @return a dummy academic year
     */
    AcademicYear createAcademicYear() {
        AcademicYear year = new AcademicYear()
    }
    
    @Test
    void testConstructor_StudentAndRequest() {
        Student student = createStudent()
        String requestString = 'TEST'
        
        Request request = new Request(student, requestString)
        assertNotNull(request)
        assertEquals(request.student.id, student.id)
        assertEquals(request.request, requestString)
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        Student student = createStudent()
        AcademicYear academicYear = createAcademicYear()
        String requestString = 'TEST'
        Boolean coreAim = false
        Boolean broadeningSubject = true
        Boolean chosenAgainstAdvice = false
        Boolean allocated = true
        
        Request request = new Request(student, requestString, academicYear, coreAim, broadeningSubject, chosenAgainstAdvice, allocated)
        
        assertNotNull(request)
        assertEquals(request.student.id, student.id)
        assertEquals(request.request, requestString)
        assertEquals(request.academicYear, academicYear)
        assertEquals(request.coreAim, coreAim)
        assertEquals(request.broadeningSubject, broadeningSubject)
        assertEquals(request.chosenAgainstAdvice, chosenAgainstAdvice)
        assertEquals(request.allocated, allocated)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        AcademicYear academicYear = createAcademicYear()
        String requestString = 'TEST'
        Boolean coreAim = false
        Boolean broadeningSubject = true
        Boolean chosenAgainstAdvice = false
        Boolean allocated = true
        
        Request request = new Request(id, student, requestString, academicYear, coreAim, broadeningSubject, chosenAgainstAdvice, allocated)
        
        assertNotNull(request)
        assertEquals(request.id, id)
        assertEquals(request.student.id, student.id)
        assertEquals(request.request, requestString)
        assertEquals(request.academicYear, academicYear)
        assertEquals(request.coreAim, coreAim)
        assertEquals(request.broadeningSubject, broadeningSubject)
        assertEquals(request.chosenAgainstAdvice, chosenAgainstAdvice)
        assertEquals(request.allocated, allocated)
    }
    
    @Test
    void testMethod_ToString() {
        Request request = new Request()
        request.request = 'TEST'
        
        assertEquals(request.request, request.toString())
    }
    
    @Test
    void testMethod_getApplicationId() {
        Student student = createStudent()
        Request request = new Request()
        request.student = student
        
        assertEquals(request.getApplicationId(), student.id)
    }
}
