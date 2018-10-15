package uk.ac.reigate.domain.ilp;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test


import uk.ac.reigate.domain.academic.Student


public class TargetTest {
    
    ILPInterview createILPInterview() {
        ILPInterview interview = new ILPInterview()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        ILPInterview interview = createILPInterview()
        String target = 'T'
        String byWhen = 'Mr'
        Boolean sendLetter = true
        
        Target targe = new Target(target, byWhen, interview, sendLetter)
        
        assertNotNull(targe)
        assertEquals(targe.interview.id, interview.id)
        assertEquals(targe.target, target)
        assertEquals(targe.byWhen, byWhen)
        assertEquals(targe.sendLetter, sendLetter)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        ILPInterview interview = createILPInterview()
        String target = 'T'
        String byWhen = 'Mr'
        Boolean sendLetter = true
        
        Target targe = new Target(id, target, byWhen, interview, sendLetter)
        
        assertNotNull(target)
        assertEquals(targe.interview.id, interview.id)
        assertEquals(targe.target, target)
        assertEquals(targe.byWhen, byWhen)
        assertEquals(targe.sendLetter, sendLetter)
    }
    
    @Test
    void testMethod_ToString() {
        Target target = new Target()
        
        assertEquals(target.target, target.toString())
    }
}
