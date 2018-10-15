package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import org.junit.Test


public class EntryQualificationTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String descriptionString = 'TEST'
        float size = 2.1
        
        
        EntryQualificationType entryQualificationType = new EntryQualificationType(code, descriptionString, size)
        
        assertNotNull(entryQualificationType)
        assertEquals(entryQualificationType.code, code)
        assertEquals(entryQualificationType.description, descriptionString)
        assertEquals(entryQualificationType.size, size, 0.0f)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String descriptionString = 'TEST'
        float size = 2.1
        
        EntryQualificationType entryQualificationType = new EntryQualificationType(id, code, descriptionString, size)
        
        assertNotNull(entryQualificationType)
        assertEquals(entryQualificationType.id, id)
        assertEquals(entryQualificationType.code, code)
        assertEquals(entryQualificationType.description, descriptionString)
        assertEquals(entryQualificationType.size, size, 0.0f)
    }
    
    @Test
    void testMethod_ToString() {
        EntryQualificationType entryQualificationType = new EntryQualificationType()
        entryQualificationType.description = 'TEST'
        
        assertEquals(entryQualificationType.description, entryQualificationType.toString())
    }
}
