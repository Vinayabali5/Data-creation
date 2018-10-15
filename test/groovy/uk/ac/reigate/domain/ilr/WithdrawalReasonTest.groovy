package uk.ac.reigate.domain.ilr;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test


public class WithdrawalReasonTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        WithdrawalReason withdrawalReason = new WithdrawalReason(code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(withdrawalReason)
        assertEquals(withdrawalReason.code, code)
        assertEquals(withdrawalReason.description, description)
        assertEquals(withdrawalReason.shortDescription, shortDescription)
        assertEquals(withdrawalReason.validFrom, validFrom)
        assertEquals(withdrawalReason.validTo, validTo)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String description = 'TEST'
        String shortDescription = 'red'
        Date validFrom = new Date().parse('yyyy/MM/dd', '2015/09/01')
        Date validTo = new Date().parse('yyyy/MM/dd', '2015/11/01')
        WithdrawalReason withdrawalReason = new WithdrawalReason(id, code, description, shortDescription, validFrom, validTo)
        
        assertNotNull(withdrawalReason)
        assertEquals(withdrawalReason.id, id)
        assertEquals(withdrawalReason.code, code)
        assertEquals(withdrawalReason.description, description)
        assertEquals(withdrawalReason.shortDescription, shortDescription)
        assertEquals(withdrawalReason.validFrom, validFrom)
        assertEquals(withdrawalReason.validTo, validTo)
    }
    
    @Test
    void testMethod_ToString() {
        WithdrawalReason withdrawalReason = new WithdrawalReason()
        withdrawalReason.description = 'TEST'
        
        assertEquals(withdrawalReason.description, withdrawalReason.toString())
    }
}
