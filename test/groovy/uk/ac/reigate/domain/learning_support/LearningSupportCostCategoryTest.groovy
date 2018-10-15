package uk.ac.reigate.domain.learning_support;

import static org.junit.Assert.*

import org.junit.Test


public class LearningSupportCostCategoryTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String category = 'TEST'
        
        LearningSupportCostCategory learningSupportCostCategory = new LearningSupportCostCategory(category)
        
        assertNotNull(learningSupportCostCategory)
        assertEquals(learningSupportCostCategory.category, category)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String category = 'TEST'
        
        LearningSupportCostCategory learningSupportCostCategory = new LearningSupportCostCategory(id, category)
        
        assertNotNull(learningSupportCostCategory)
        assertEquals(learningSupportCostCategory.id, id)
        assertEquals(learningSupportCostCategory.category, category)
    }
    
    @Test
    void testMethod_ToString() {
        LearningSupportCostCategory learningSupportCostCategory = new LearningSupportCostCategory()
        learningSupportCostCategory.category = 'TEST'
        
        assertEquals(learningSupportCostCategory.category, learningSupportCostCategory.toString())
    }
}
