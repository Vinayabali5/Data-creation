package uk.ac.reigate.register;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.academic.Period;
import uk.ac.reigate.domain.register.RegisteredSession



public class RegisteredSessionedSessionTest {
    
    Period createPeriod() {
        Period period = new Period()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Period period = createPeriod()
        Date date = new Date().parse('yyyy/MM/dd', '2015/08/01')
        
        RegisteredSession registeredSession = new RegisteredSession(date, period)
        
        assertNotNull(registeredSession)
        assertEquals(registeredSession.period.id, period.id)
        assertEquals(registeredSession.date, date)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Period period = createPeriod()
        Date date = new Date().parse('yyyy/MM/dd', '2015/08/01')
        
        RegisteredSession registeredSession = new RegisteredSession(id, date, period)
        
        assertNotNull(registeredSession)
        assertEquals(registeredSession.period.id, period.id)
        assertEquals(registeredSession.date, date)
    }
    
    @Test
    void testMethod_ToString() {
        RegisteredSession registeredSessione = new RegisteredSession()
        
        assertEquals(registeredSessione.date, registeredSessione.toString())
    }
}
