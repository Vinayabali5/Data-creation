package uk.ac.reigate.domain.admissions;

import static org.junit.Assert.*

import org.junit.Test


public class CollegeFundPaidTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String collegeFundPaidString = 'TEST'
        
        
        CollegeFundPaid collegeFundPaid = new CollegeFundPaid(collegeFundPaidString)
        
        assertNotNull(collegeFundPaid)
        assertEquals(collegeFundPaid.collegeFundPaid, collegeFundPaidString)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String collegeFundPaidString = 'TEST'
        
        CollegeFundPaid collegeFundPaid = new CollegeFundPaid(id, collegeFundPaidString)
        
        assertNotNull(collegeFundPaid)
        assertEquals(collegeFundPaid.id, id)
        assertEquals(collegeFundPaid.collegeFundPaid, collegeFundPaidString)
    }
    
    @Test
    void testMethod_ToString() {
        CollegeFundPaid collegeFundPaid = new CollegeFundPaid()
        collegeFundPaid.collegeFundPaid = 'TEST'
        
        assertEquals(collegeFundPaid.collegeFundPaid, collegeFundPaid.toString())
    }
}
