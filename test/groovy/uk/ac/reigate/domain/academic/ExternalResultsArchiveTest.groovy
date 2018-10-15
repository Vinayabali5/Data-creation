package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test

import uk.ac.reigate.domain.academic.Student

public class ExternalResultsArchiveTest {
    
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
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        Student student = createStudent()
        String courseSpec = 'TEST'
        String levelDescription = 'A Level'
        String subjectDescription = 'maths'
        String syllabus = 'mat'
        String grade = 'A'
        String mark = 'a'
        String maxMark = 'A'
        Date dateAchieved = null
        String series = 'se'
        String year = '16'
        String examType = 'aqa'
        
        
        ExternalResultsArchive externalResultsArchive = new ExternalResultsArchive(student,  courseSpec, levelDescription, subjectDescription, syllabus, grade,  mark, maxMark, dateAchieved, series, year, examType)
        
        assertNotNull(externalResultsArchive)
        assertEquals(externalResultsArchive.student.id, student.id)
        assertEquals(externalResultsArchive.courseSpec, courseSpec)
        assertEquals(externalResultsArchive.levelDescription, levelDescription)
        assertEquals(externalResultsArchive.subjectDescription, subjectDescription)
        assertEquals(externalResultsArchive.syllabus, syllabus)
        assertEquals(externalResultsArchive.grade, grade)
        assertEquals(externalResultsArchive.mark, mark)
        assertEquals(externalResultsArchive.maxMark, maxMark)
        assertEquals(externalResultsArchive.dateAchieved, dateAchieved)
        assertEquals(externalResultsArchive.series, series)
        assertEquals(externalResultsArchive.year, year)
        assertEquals(externalResultsArchive.examType, examType)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        String courseSpec = 'TEST'
        String levelDescription = 'A Level'
        String subjectDescription = 'maths'
        String syllabus = 'mat'
        String grade = 'A'
        String mark = 'a'
        String maxMark = 'A'
        Date dateAchieved = null
        String series = 'se'
        String year = '16'
        String examType = 'aqa'
        
        ExternalResultsArchive externalResultsArchive = new ExternalResultsArchive(id, student,  courseSpec, levelDescription, subjectDescription, syllabus, grade,  mark, maxMark, dateAchieved, series, year, examType)
        
        assertNotNull(externalResultsArchive)
        assertEquals(externalResultsArchive.id, id)
        assertEquals(externalResultsArchive.student.id, student.id)
        assertEquals(externalResultsArchive.courseSpec, courseSpec)
        assertEquals(externalResultsArchive.levelDescription, levelDescription)
        assertEquals(externalResultsArchive.subjectDescription, subjectDescription)
        assertEquals(externalResultsArchive.syllabus, syllabus)
        assertEquals(externalResultsArchive.grade, grade)
        assertEquals(externalResultsArchive.mark, mark)
        assertEquals(externalResultsArchive.maxMark, maxMark)
        assertEquals(externalResultsArchive.dateAchieved, dateAchieved)
        assertEquals(externalResultsArchive.series, series)
        assertEquals(externalResultsArchive.year, year)
        assertEquals(externalResultsArchive.examType, examType)
    }
    
    @Test
    void testMethod_ToString() {
        ExternalResultsArchive externalResultsArchive = new ExternalResultsArchive()
        Student student = createStudent()
        
        assertEquals(externalResultsArchive.student, externalResultsArchive.toString())
    }
}
