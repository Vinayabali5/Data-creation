package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test

import uk.ac.reigate.domain.academic.AcademicYear;
import uk.ac.reigate.domain.academic.Student

public class InterimReportTest {
    
    /**
     * Helper function to create a dummy academic year
     *
     * @return a dummy academic year
     */
    AcademicYear createAcademicYear() {
        AcademicYear year = new AcademicYear()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        AcademicYear year = createAcademicYear()
        String code = 'T'
        String description = 'TEST'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Date publishDate = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Boolean active = true
        
        InterimReport interimReport = new InterimReport(code, description, year, startDate, endDate, publishDate, active)
        
        assertNotNull(interimReport)
        assertEquals(interimReport.year.id, year.id)
        assertEquals(interimReport.description, description)
        assertEquals(interimReport.startDate, startDate)
        assertEquals(interimReport.endDate, endDate)
        assertEquals(interimReport.active, active)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        AcademicYear year = createAcademicYear()
        String code = 'T'
        String description = 'TEST'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Boolean active = true
        Date publishDate = new Date().parse('yyyy/MM/dd', '2015/11/01')
        InterimReport interimReport = new InterimReport(id, code, description, year, startDate, endDate, publishDate, active)
        
        assertNotNull(interimReport)
        assertEquals(interimReport.id, id)
        assertEquals(interimReport.year.id, year.id)
        assertEquals(interimReport.description, description)
        assertEquals(interimReport.startDate, startDate)
        assertEquals(interimReport.endDate, endDate)
        assertEquals(interimReport.active, active)
    }
    
    @Test
    void testMethod_ToString() {
        InterimReport interimReport = new InterimReport()
        interimReport.description = 'TEST'
        
        assertEquals(interimReport.description, interimReport.toString())
    }
}
