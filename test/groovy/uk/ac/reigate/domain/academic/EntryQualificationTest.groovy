package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test

import uk.ac.reigate.domain.academic.EntryQualificationType

public class EntryQualificationTest {
    
    /**
     * Helper function to create a dummy student
     * 
     * @return a dummy student
     */
    EntryQualificationType createEntryQualificationType() {
        EntryQualificationType type = new EntryQualificationType()
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        EntryQualificationType type = createEntryQualificationType()
        String title = 'TEST'
        Boolean basicList = false
        Boolean shortCourse = true
        String dataMatchCode = 'A'
        Integer webLinkCode = 1
        
        EntryQualification entryQualification = new EntryQualification(id, title, type, basicList, shortCourse, dataMatchCode, webLinkCode)
        
        assertNotNull(entryQualification)
        assertEquals(entryQualification.id, id)
        assertEquals(entryQualification.type.id, type.id)
        assertEquals(entryQualification.title, title)
        assertEquals(entryQualification.basicList, basicList)
        assertEquals(entryQualification.shortCourse, shortCourse)
        assertEquals(entryQualification.dataMatchCode, dataMatchCode)
        assertEquals(entryQualification.webLinkCode, webLinkCode)
    }
    
    @Test
    void testMethod_ToString() {
        EntryQualification entryQualification = new EntryQualification()
        EntryQualificationType type = createEntryQualificationType()
        entryQualification.title = 'TEST'
        
        assertEquals(entryQualification.type + " " + entryQualification.title, entryQualification.toString())
    }
}
