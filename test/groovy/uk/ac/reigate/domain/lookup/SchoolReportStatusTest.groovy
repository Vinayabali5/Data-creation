package uk.ac.reigate.domain.lookup;

import static org.junit.Assert.*

import org.junit.Test


public class SchoolReportStatusTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        
        SchoolReportStatus schoolReportStatus = new SchoolReportStatus(code, description)
        
        assertNotNull(schoolReportStatus)
        assertEquals(schoolReportStatus.code, code)
        assertEquals(schoolReportStatus.description, description)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        
        SchoolReportStatus schoolReportStatus = new SchoolReportStatus(id, code, description)
        
        assertNotNull(schoolReportStatus)
        assertEquals(schoolReportStatus.id, id)
        assertEquals(schoolReportStatus.code, code)
        assertEquals(schoolReportStatus.description, description)
    }
    
    @Test
    void testMethod_ToString() {
        SchoolReportStatus schoolReportStatus = new SchoolReportStatus()
        schoolReportStatus.description = 'TEST'
        
        assertEquals(schoolReportStatus.code + ' - ' + schoolReportStatus.description, schoolReportStatus.toString())
    }
}
