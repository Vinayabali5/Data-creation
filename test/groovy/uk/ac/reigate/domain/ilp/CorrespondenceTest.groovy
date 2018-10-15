package uk.ac.reigate.domain.ilp;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.academic.CourseGroup;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject


public class CorrespondenceTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    CourseGroup createCourseGroup() {
        CourseGroup course = new CourseGroup()
    }
    
    Letter createLetter() {
        Letter letter = new Letter()
    }
    
    CorrespondenceType createCorrespondenceType() {
        CorrespondenceType type = new CorrespondenceType()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Student student = createStudent()
        CourseGroup course = createCourseGroup()
        String correspondence = 'T'
        String title = 'Mr'
        Date date = new Date().parse('yyyy/MM/dd', '2015/08/01')
        String from = '123'
        String to = 'Test'
        Letter letter = createLetter()
        Date staffAdvised = new Date().parse('yyyy/MM/dd', '2015/07/01')
        CorrespondenceType type = createCorrespondenceType()
        String producedBy = 'mat'
        Boolean privateEntry = true
        Integer processStage = 1
        String attachmentsSent = 'TT'
        
        Correspondence correspondenc = new Correspondence(student, course, correspondence, title, date, from, to, letter, staffAdvised, type, producedBy, privateEntry, processStage,  attachmentsSent)
        
        assertNotNull(correspondenc)
        assertEquals(correspondenc.student.id, student.id)
        assertEquals(correspondenc.course.id, course.id)
        assertEquals(correspondenc.correspondence, correspondence)
        assertEquals(correspondenc.title, title)
        assertEquals(correspondenc.date, date)
        assertEquals(correspondenc.from, from)
        assertEquals(correspondenc.to, to)
        assertEquals(correspondenc.letter.id, letter.id)
        assertEquals(correspondenc.type.id, type.id)
        assertEquals(correspondenc.producedBy, producedBy)
        assertEquals(correspondenc.privateEntry, privateEntry)
        assertEquals(correspondenc.processStage, processStage)
        assertEquals(correspondenc.attachmentsSent, attachmentsSent)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        CourseGroup course = createCourseGroup()
        String correspondence = 'T'
        String title = 'Mr'
        Date date = new Date().parse('yyyy/MM/dd', '2015/08/01')
        String from = '123'
        String to = 'Test'
        Letter letter = createLetter()
        Date staffAdvised = new Date().parse('yyyy/MM/dd', '2015/07/01')
        CorrespondenceType type = createCorrespondenceType()
        String producedBy = 'mat'
        Boolean privateEntry = true
        Integer processStage = 1
        String attachmentsSent = 'TT'
        
        Correspondence correspondenc = new Correspondence(id, student, course, correspondence, title, date, from, to, letter, staffAdvised, type, producedBy, privateEntry, processStage,  attachmentsSent)
        
        assertNotNull(correspondenc)
        assertEquals(correspondenc.student.id, student.id)
        assertEquals(correspondenc.course.id, course.id)
        assertEquals(correspondenc.correspondence, correspondence)
        assertEquals(correspondenc.title, title)
        assertEquals(correspondenc.date, date)
        assertEquals(correspondenc.from, from)
        assertEquals(correspondenc.to, to)
        assertEquals(correspondenc.letter.id, letter.id)
        assertEquals(correspondenc.type.id, type.id)
        assertEquals(correspondenc.producedBy, producedBy)
        assertEquals(correspondenc.privateEntry, privateEntry)
        assertEquals(correspondenc.processStage, processStage)
        assertEquals(correspondenc.attachmentsSent, attachmentsSent)
    }
    
    @Test
    void testMethod_ToString() {
        Correspondence correspondence = new Correspondence()
        Student student = createStudent()
        correspondence.student = student
        
        assertEquals(correspondence.student.id, correspondence.toString())
    }
}
