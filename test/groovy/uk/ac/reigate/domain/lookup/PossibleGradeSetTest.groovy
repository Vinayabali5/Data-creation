package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class PossibleGradeSetTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        PossibleGradeSet possibleGradeSet = new PossibleGradeSet(code, description)
        
        assertNotNull(possibleGradeSet)
        assertEquals(possibleGradeSet.code, code)
        assertEquals(possibleGradeSet.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        PossibleGradeSet possibleGradeSet = new PossibleGradeSet(id, code, description)
        
        assertNotNull(possibleGradeSet)
        assertEquals(possibleGradeSet.id, id)
        assertEquals(possibleGradeSet.code, code)
        assertEquals(possibleGradeSet.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        PossibleGradeSet possibleGradeSet = new PossibleGradeSet()
        possibleGradeSet.description = 'TEST'
        
        assertEquals(possibleGradeSet.description, possibleGradeSet.toString())
    }
}
