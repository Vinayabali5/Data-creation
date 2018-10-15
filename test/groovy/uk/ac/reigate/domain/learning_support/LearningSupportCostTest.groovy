package uk.ac.reigate.domain.learning_support;

import static org.junit.Assert.*

import java.util.Date;

import javax.persistence.OneToOne;

import org.junit.Test

import uk.ac.reigate.domain.Staff;
import uk.ac.reigate.domain.academic.CourseGroup;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Subject


public class LearningSupportCostTest {
    
    Student createStudent() {
        Student student = new Student()
    }
    
    Staff createStaff() {
        Staff staff = new Staff()
    }
    
    LearningSupportCostCategory createLearningSupportCostCategory() {
        LearningSupportCostCategory CostCategory = new LearningSupportCostCategory()
    }
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        
        Student student = createStudent()
        LearningSupportCostCategory costCategory = createLearningSupportCostCategory()
        String description = 'T'
        Staff staff = createStaff()
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Double hoursPerWeek = 2.1
        Double weeks = 1.1
        Double rate = 1.1
        String periodDescription = '2'
        
        LearningSupportCost learningSupportCost = new LearningSupportCost(student, startDate, endDate, hoursPerWeek, weeks, rate, costCategory, description, periodDescription, staff)
        
        assertNotNull(learningSupportCost)
        assertEquals(learningSupportCost.student.id, student.id)
        assertEquals(learningSupportCost.description, description)
        assertEquals(learningSupportCost.startDate, startDate)
        assertEquals(learningSupportCost.endDate, endDate)
        assertEquals(learningSupportCost.hoursPerWeek, hoursPerWeek, 0.0f)
        assertEquals(learningSupportCost.weeks, weeks, 0.0f)
        assertEquals(learningSupportCost.staff.id, staff.id)
        assertEquals(learningSupportCost.rate, rate, 0.0f)
        assertEquals(learningSupportCost.periodDescription, periodDescription)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Student student = createStudent()
        LearningSupportCostCategory costCategory = createLearningSupportCostCategory()
        String description = 'T'
        Staff staff = createStaff()
        Date startDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Date endDate = new Date().parse('yyyy/MM/dd', '2015/08/01')
        Double hoursPerWeek = 2.1
        Double weeks = 1.1
        Double rate = 1.1
        String periodDescription = '2'
        
        LearningSupportCost learningSupportCost = new LearningSupportCost(id, student, startDate, endDate, hoursPerWeek, weeks, rate, costCategory, description, periodDescription, staff)
        
        assertNotNull(learningSupportCost)
        assertEquals(learningSupportCost.student.id, student.id)
        assertEquals(learningSupportCost.description, description)
        assertEquals(learningSupportCost.startDate, startDate)
        assertEquals(learningSupportCost.endDate, endDate)
        assertEquals(learningSupportCost.hoursPerWeek, hoursPerWeek, 0.0f)
        assertEquals(learningSupportCost.weeks, weeks, 0.0f)
        assertEquals(learningSupportCost.staff.id, staff.id)
        assertEquals(learningSupportCost.rate, rate, 0.0f)
        assertEquals(learningSupportCost.periodDescription, periodDescription)
    }
    
    @Test
    void testMethod_ToString() {
        LearningSupportCost learningSupportCoste = new LearningSupportCost()
        
        assertEquals(learningSupportCoste.description, learningSupportCoste.toString())
    }
}
