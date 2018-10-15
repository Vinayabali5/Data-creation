package uk.ac.reigate.domain.admissions;

import static org.junit.Assert.*

import java.util.Date;

import org.junit.Test

import uk.ac.reigate.domain.academic.Student

public class CollegeFundPaymentTest {
    
    /**
     * Helper function to create a dummy student
     * 
     * @return a dummy student
     */
    Student createStudent() {
        Student student = new Student()
        student.id = 1
        return student
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        Student student = createStudent()
        String payeeString = 'TEST'
        Date paymentDate = null
        float amount = 2.1
        boolean giftAid = false
        boolean cash = true
        Date chequeDate = null
        
        CollegeFundPayment collegeFundPayment = new CollegeFundPayment(student, paymentDate, amount, payeeString, giftAid, cash, chequeDate)
        
        assertNotNull(collegeFundPayment)
        assertEquals(collegeFundPayment.student.id, student.id)
        assertEquals(collegeFundPayment.payee, payeeString)
        assertEquals(collegeFundPayment.paymentDate, paymentDate)
        assertEquals(collegeFundPayment.amount, amount, 0.0f)
        assertEquals(collegeFundPayment.giftAid, giftAid)
        assertEquals(collegeFundPayment.cash, cash)
        assertEquals(collegeFundPayment.chequeDate, chequeDate)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        String payeeString = 'TEST'
        Date paymentDate = null
        float amount = 2.1f
        boolean giftAid = false
        boolean cash = true
        Date chequeDate = null
        
        CollegeFundPayment collegeFundPayment = new CollegeFundPayment(id, student, paymentDate, amount, payeeString, giftAid, cash, chequeDate)
        
        assertNotNull(collegeFundPayment)
        assertEquals(collegeFundPayment.id, id)
        assertEquals(collegeFundPayment.student.id, student.id)
        assertEquals(collegeFundPayment.payee, payeeString)
        assertEquals(collegeFundPayment.paymentDate, paymentDate)
        assertEquals(collegeFundPayment.amount, amount, 0.0f)
        assertEquals(collegeFundPayment.giftAid, giftAid)
        assertEquals(collegeFundPayment.cash, cash)
        assertEquals(collegeFundPayment.chequeDate, chequeDate)
    }
    
    @Test
    void testMethod_ToString() {
        CollegeFundPayment collegeFundPayment = new CollegeFundPayment()
        collegeFundPayment.payee = 'TEST'
        
        assertEquals(collegeFundPayment.payee, collegeFundPayment.toString())
    }
    
    @Test
    void testMethod_getStudentId() {
        Student student = createStudent()
        CollegeFundPayment collegeFundPayment = new CollegeFundPayment()
        collegeFundPayment.student = student
        
        assertEquals(collegeFundPayment.getStudentId(), student.id)
    }
}
