package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class LevelTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        Integer progressionTo = 1
        String alisQualCode = 'A'
        
        Level level = new Level(code, description, null, progressionTo, alisQualCode)
        
        assertNotNull(level)
        assertEquals(level.code, code)
        assertEquals(level.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        Integer progressionTo = 1
        String alisQualCode = 'A'
        
        Level level = new Level(id, code, description, null, progressionTo, alisQualCode)
        
        assertNotNull(level)
        assertEquals(level.id, id)
        assertEquals(level.code, code)
        assertEquals(level.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        Level level = new Level()
        level.description = 'TEST'
        
        assertEquals(level.description + ' (' + level.code + ')', level.toString())
    }
}
