package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.exam.ExamBoard
import uk.ac.reigate.domain.lookup.Level
import uk.ac.reigate.domain.lookup.Subject


public class FacultyTest {
    
    Staff createHof() {
        Staff hof = new Staff()
    }
    
    Staff createDol() {
        Staff dol = new Staff()
    }
    
    Staff createAdol() {
        Staff adol = new Staff()
    }
    
    Staff createPd() {
        Staff pd = new Staff()
    }
    
    Staff createApd() {
        Staff apd = new Staff()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'A'
        String description = 'B'
        Staff hof = createHof()
        Staff dol = createDol()
        Staff adol = createAdol()
        Staff pd = createPd()
        Staff apd = createApd()
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/10/01')
        
        Faculty faculty = new Faculty(code, description, hof, dol, adol, pd, apd, validFrom, validTo)
        
        assertNotNull(faculty)
        assertEquals(faculty.code, code)
        assertEquals(faculty.description, description)
        assertEquals(faculty.hof.id, hof.id)
        assertEquals(faculty.dol.id, dol.id)
        assertEquals(faculty.adol.id, adol.id)
        assertEquals(faculty.pd.id, pd.id)
        assertEquals(faculty.apd.id, apd.id)
        assertEquals(faculty.validTo, validTo)
        assertEquals(faculty.validFrom, validFrom)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'A'
        String description = 'B'
        Staff hof = createHof()
        Staff dol = createDol()
        Staff adol = createAdol()
        Staff pd = createPd()
        Staff apd = createApd()
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/10/01')
        
        Faculty faculty = new Faculty(id, code, description, hof, dol, adol, pd, apd, validFrom, validTo)
        
        assertNotNull(faculty)
        assertEquals(faculty.code, code)
        assertEquals(faculty.description, description)
        assertEquals(faculty.hof.id, hof.id)
        assertEquals(faculty.dol.id, dol.id)
        assertEquals(faculty.adol.id, adol.id)
        assertEquals(faculty.pd.id, pd.id)
        assertEquals(faculty.apd.id, apd.id)
        assertEquals(faculty.validTo, validTo)
        assertEquals(faculty.validFrom, validFrom)
    }
    
    @Test
    void testMethod_ToString() {
        Faculty faculty = new Faculty()
        faculty.description = 'TEST'
        
        assertEquals(faculty.description, faculty.toString())
    }
}
