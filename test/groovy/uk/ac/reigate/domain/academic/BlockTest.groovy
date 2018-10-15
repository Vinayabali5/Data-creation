package uk.ac.reigate.domain.academic;

import static org.junit.Assert.*

import org.junit.Test


public class BlockTest {
    
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        String code = 'T'
        String descriptionString = 'TEST'
        String htmlColour = 'yellow'
        String accessColour = 'red'
        
        Block block = new Block(code, descriptionString, htmlColour)
        
        assertNotNull(block)
        assertEquals(block.code, code)
        assertEquals(block.description, descriptionString)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        String code = 'T'
        String descriptionString = 'TEST'
        String htmlColour = 'yellow'
        String accessColour = 'red'
        
        Block block = new Block(id, code, descriptionString, htmlColour)
        
        assertNotNull(block)
        assertEquals(block.id, id)
        assertEquals(block.code, code)
        assertEquals(block.description, descriptionString)
    }
    
    @Test
    void testMethod_ToString() {
        Block block = new Block()
        block.description = 'TEST'
        
        assertEquals(block.description, block.toString())
    }
}
