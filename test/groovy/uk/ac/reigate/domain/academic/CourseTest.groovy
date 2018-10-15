package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import javax.persistence.OneToOne;

import org.junit.Test
import uk.ac.reigate.domain.exam.ExamBoard
import uk.ac.reigate.domain.lookup.Level
import uk.ac.reigate.domain.lookup.Subject


public class CourseTest {
    
    Level createLevel() {
        Level level = new Level()
    }
    
    Subject createSubject() {
        Subject subject = new Subject()
    }
    
    ExamBoard createExamBoard() {
        ExamBoard examBoard = new ExamBoard()
    }
    
    AcademicYear createValidFrom() {
        AcademicYear validFrom = new AcademicYear()
    }
    
    AcademicYear createValidTo() {
        AcademicYear validTo = new AcademicYear()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Level level = createLevel()
        Subject subject = createSubject()
        Integer glh = 2
        String learningAimReference = '123'
        ExamBoard examBoard = createExamBoard()
        String syllabusCode = 'mat'
        AcademicYear validFrom = createValidFrom()
        AcademicYear validTo = createValidTo()
        String locationPostcode = 'e16'
        String subjectSectorArea = 'london'
        String notes = 'good'
        String spec = 'L-mah'
        
        Course course = new Course(level, subject, glh, learningAimReference, examBoard, syllabusCode, validFrom, validTo, locationPostcode, subjectSectorArea, notes, spec)
        
        assertNotNull(course)
        assertEquals(course.level.id, level.id)
        assertEquals(course.subject.id, subject.id)
        assertEquals(course.glh, glh)
        assertEquals(course.learningAimReference, learningAimReference)
        assertEquals(course.examBoard.id, examBoard.id)
        assertEquals(course.syllabusCode, syllabusCode)
        assertEquals(course.validFrom.id, validFrom.id)
        assertEquals(course.validTo.id, validTo.id)
        assertEquals(course.locationPostcode, locationPostcode)
        assertEquals(course.subjectSectorArea, subjectSectorArea)
        assertEquals(course.notes, notes)
        assertEquals(course.spec, spec)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Level level = createLevel()
        Subject subject = createSubject()
        Integer glh = 2
        String learningAimReference = '123'
        ExamBoard examBoard = createExamBoard()
        String syllabusCode = 'mat'
        AcademicYear validFrom = createValidFrom()
        AcademicYear validTo = createValidTo()
        String locationPostcode = 'e16'
        String subjectSectorArea = 'london'
        String notes = 'good'
        String spec = 'L-mah'
        
        Course course = new Course(id, level, subject, glh, learningAimReference, examBoard, syllabusCode, validFrom, validTo, locationPostcode, subjectSectorArea, notes, spec)
        
        assertNotNull(course)
        assertEquals(course.level.id, level.id)
        assertEquals(course.subject.id, subject.id)
        assertEquals(course.glh, glh)
        assertEquals(course.learningAimReference, learningAimReference)
        assertEquals(course.examBoard.id, examBoard.id)
        assertEquals(course.syllabusCode, syllabusCode)
        assertEquals(course.validFrom.id, validFrom.id)
        assertEquals(course.validTo.id, validTo.id)
        assertEquals(course.locationPostcode, locationPostcode)
        assertEquals(course.subjectSectorArea, subjectSectorArea)
        assertEquals(course.notes, notes)
        assertEquals(course.spec, spec)
    }
    
    @Test
    void testMethod_ToString() {
        Course course = new Course()
        course.spec = 'TEST'
        
        assertEquals(course.spec, course.toString())
    }
}
