package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test

import uk.ac.reigate.domain.academic.AcademicYear;
import uk.ac.reigate.domain.academic.Student

public class HolidayTest {
    
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
        String description = 'TEST'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Boolean halfTerm = true
        
        Holiday holiday = new Holiday(year, description, startDate, endDate, halfTerm)
        
        assertNotNull(holiday)
        assertEquals(holiday.year.id, year.id)
        assertEquals(holiday.description, description)
        assertEquals(holiday.startDate, startDate)
        assertEquals(holiday.endDate, endDate)
        assertEquals(holiday.halfTerm, halfTerm)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        AcademicYear year = createAcademicYear()
        String description = 'TEST'
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/11/01')
        Boolean halfTerm = true
        
        Holiday holiday = new Holiday(id, year, description, startDate, endDate, halfTerm)
        
        assertNotNull(holiday)
        assertEquals(holiday.id, id)
        assertEquals(holiday.year.id, year.id)
        assertEquals(holiday.description, description)
        assertEquals(holiday.startDate, startDate)
        assertEquals(holiday.endDate, endDate)
        assertEquals(holiday.halfTerm, halfTerm)
    }
    
    @Test
    void testMethod_ToString() {
        Holiday holiday = new Holiday()
        holiday.description = 'TEST'
        
        assertEquals(holiday.description, holiday.toString())
    }
}
