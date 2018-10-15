package uk.ac.reigate.domain.learning_support;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test
import uk.ac.reigate.domain.ilr.LLDDHealthProblemCategory



public class ReferralReasonTest {
    
    LLDDHealthProblemCategory createLLDDHealthProblemCategory() {
        LLDDHealthProblemCategory llddHealthProblemCategory = new LLDDHealthProblemCategory()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        LLDDHealthProblemCategory lddHealthProblemCategory = createLLDDHealthProblemCategory()
        String reason = '2'
        
        ReferralReason referralReason = new ReferralReason(reason, lddHealthProblemCategory)
        
        assertNotNull(referralReason)
        assertEquals(referralReason.reason, reason)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        LLDDHealthProblemCategory lddHealthProblemCategory = createLLDDHealthProblemCategory()
        String reason = '2'
        
        ReferralReason referralReason = new ReferralReason(reason, lddHealthProblemCategory)
        
        assertNotNull(referralReason)
        assertEquals(referralReason.reason, reason)
    }
    
    @Test
    void testMethod_ToString() {
        ReferralReason referralReasone = new ReferralReason()
        assertEquals(referralReasone.reason, referralReasone.toString())
    }
}
