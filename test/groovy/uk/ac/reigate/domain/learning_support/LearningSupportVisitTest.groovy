package uk.ac.reigate.domain.learning_support;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.CourseGroup;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject


public class LearningSupportVisitTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Student student = createStudent()
        Date date = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date time = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Integer duration = 2
        String details = '2'
        
        LearningSupportVisit learningSupportVisit = new LearningSupportVisit(student, date, duration, details, time)
        
        assertNotNull(learningSupportVisit)
        assertEquals(learningSupportVisit.student.id, student.id)
        assertEquals(learningSupportVisit.date, date)
        assertEquals(learningSupportVisit.time, time)
        assertEquals(learningSupportVisit.duration, duration)
        assertEquals(learningSupportVisit.details, details)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        Date date = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date time = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Integer duration = 2
        String details = '2'
        
        LearningSupportVisit learningSupportVisit = new LearningSupportVisit(student, date, duration, details, time)
        
        assertNotNull(learningSupportVisit)
        assertEquals(learningSupportVisit.student.id, student.id)
        assertEquals(learningSupportVisit.date, date)
        assertEquals(learningSupportVisit.time, time)
        assertEquals(learningSupportVisit.duration, duration)
        assertEquals(learningSupportVisit.details, details)
    }
    
    @Test
    void testMethod_ToString() {
        LearningSupportVisit learningSupportVisite = new LearningSupportVisit()
        assertEquals(learningSupportVisite.student, learningSupportVisite.toString())
    }
}
