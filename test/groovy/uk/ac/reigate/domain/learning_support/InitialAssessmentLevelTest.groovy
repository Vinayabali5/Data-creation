package uk.ac.reigate.domain.learning_support;

import static org.junit.Assert.*

import org.junit.Test


public class InitialAssessmentLevelTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String initialAssessmentLevel = 'T'
        String abbrv = 'TEST'
        
        InitialAssessmentLevel initialAssessmentLeve = new InitialAssessmentLevel(initialAssessmentLevel, abbrv)
        
        assertNotNull(initialAssessmentLeve)
        assertEquals(initialAssessmentLeve.initialAssessmentLevel, initialAssessmentLevel)
        assertEquals(initialAssessmentLeve.abbrv, abbrv)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String initialAssessmentLevel = 'T'
        String abbrv = 'TEST'
        
        InitialAssessmentLevel initialAssessmentLeve = new InitialAssessmentLevel(id, initialAssessmentLevel, abbrv)
        
        assertNotNull(initialAssessmentLeve)
        assertEquals(initialAssessmentLeve.id, id)
        assertEquals(initialAssessmentLeve.initialAssessmentLevel, initialAssessmentLevel)
        assertEquals(initialAssessmentLeve.abbrv, abbrv)
    }
    
    @Test
    void testMethod_ToString() {
        InitialAssessmentLevel initialAssessmentLevel = new InitialAssessmentLevel()
        initialAssessmentLevel.abbrv = 'TEST'
        
        assertEquals(initialAssessmentLevel.abbrv, initialAssessmentLevel.toString())
    }
}
