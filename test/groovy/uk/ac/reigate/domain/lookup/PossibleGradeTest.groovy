package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test



public class PossibleGradeTest {
    
    PossibleGradeSet createPossibleGradeSet() {
        PossibleGradeSet gradeSet = new PossibleGradeSet()
    }
    
    Level createLevel() {
        Level level = new Level()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        PossibleGradeSet gradeSet = createPossibleGradeSet()
        Level level = createLevel()
        String grade = 'A'
        Integer ucasPoints = 120
        Boolean useForKeyAssessment = true
        PossibleGrade possibleGrade = new PossibleGrade(code, description, gradeSet, level, grade, ucasPoints, useForKeyAssessment)
        
        assertNotNull(possibleGrade)
        assertEquals(possibleGrade.code, code)
        assertEquals(possibleGrade.description, description)
        assertEquals(possibleGrade.grade, grade)
        assertEquals(possibleGrade.ucasPoints, ucasPoints)
        assertEquals(possibleGrade.useForKeyAssessment, useForKeyAssessment)
        assertEquals(possibleGrade.level.id, level.id)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        PossibleGradeSet gradeSet = createPossibleGradeSet()
        Level level = createLevel()
        String grade = 'A'
        Integer ucasPoints = 120
        Boolean useForKeyAssessment = true
        PossibleGrade possibleGrade = new PossibleGrade(id, code, description, gradeSet, level, grade, ucasPoints, useForKeyAssessment)
        
        assertNotNull(possibleGrade)
        assertEquals(possibleGrade.id, id)
        assertEquals(possibleGrade.code, code)
        assertEquals(possibleGrade.description, description)
        assertEquals(possibleGrade.grade, grade)
        assertEquals(possibleGrade.ucasPoints, ucasPoints)
        assertEquals(possibleGrade.useForKeyAssessment, useForKeyAssessment)
        assertEquals(possibleGrade.level.id, level.id)
    }
    
    @Test
    void testMethod_ToString() {
        PossibleGrade possibleGrade = new PossibleGrade()
        possibleGrade.description = 'TEST'
        
        assertEquals(possibleGrade.description, possibleGrade.toString())
    }
}
