package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class ProgrammeTypeTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        ProgrammeType programmeType = new ProgrammeType(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(programmeType)
        assertEquals(programmeType.code, code)
        assertEquals(programmeType.description, description)
        assertEquals(programmeType.shortDescription, shortDescription)
        assertEquals(programmeType.validFrom, validFrom)
        assertEquals(programmeType.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        ProgrammeType programmeType = new ProgrammeType(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(programmeType)
        assertEquals(programmeType.id, id)
        assertEquals(programmeType.code, code)
        assertEquals(programmeType.description, description)
        assertEquals(programmeType.shortDescription, shortDescription)
        assertEquals(programmeType.validFrom, validFrom)
        assertEquals(programmeType.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        ProgrammeType programmeType = new ProgrammeType()
        programmeType.description = 'TEST'
        
        assertEquals(programmeType.description, programmeType.toString())
    }
}
