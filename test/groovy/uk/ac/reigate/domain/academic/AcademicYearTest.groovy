package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class AcademicYearTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String descriptionString = 'TEST'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        
        AcademicYear academicYear = new AcademicYear(code, descriptionString, startDate, endDate)
        
        assertNotNull(academicYear)
        assertEquals(academicYear.code, code)
        assertEquals(academicYear.description, descriptionString)
        assertEquals(academicYear.startDate, startDate)
        assertEquals(academicYear.endDate, endDate)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String descriptionString = 'TEST'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        AcademicYear academicYear = new AcademicYear(id, code, descriptionString, startDate, endDate)
        
        assertNotNull(academicYear)
        assertEquals(academicYear.id, id)
        assertEquals(academicYear.code, code)
        assertEquals(academicYear.description, descriptionString)
        assertEquals(academicYear.startDate, startDate)
        assertEquals(academicYear.endDate, endDate)
    }
    
    @Test
    void testMethod_ToString() {
        AcademicYear academicYear = new AcademicYear()
        academicYear.code = 'T'
        academicYear.description = 'TEST'
        
        assertEquals(academicYear.description + ' (' + academicYear.code + ')', academicYear.toString())
    }
}
