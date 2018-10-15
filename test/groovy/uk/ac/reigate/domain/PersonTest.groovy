package uk.ac.reigate.domain

import static org.junit.Assert.*

import org.junit.Test

import uk.ac.reigate.domain.lookup.Gender;
import uk.ac.reigate.domain.lookup.Title;


public class PersonTest {
    
    Title createTitle() {
        Title title = new Title()
    }
    
    Gender createGender() {
        Gender gender = new Gender()
    }
    
    Address createAddress() {
        Address address = new Address()
    }
    
    @Test
    void testConstructor_AllFieldsWithoutId() {
        Title title = createTitle()
        Gender gender = createGender()
        Address address = createAddress()
        Date dob = new Date().parse('yyyy/MM/dd', '2015/09/01')
        String firstName = 'T'
        String preferredName = 'TEST'
        String middleNames = 'yellow'
        String surname = 'red'
        String legalSurname = 'red'
        String previousSurname = 'London'
        String home = 'canning home'
        String mobile = 'surrey'
        String work = 'e131dd'
        String email ='jupiter house'
        Boolean enabled = true
        Person person = new Person(title, firstName, preferredName, surname, legalSurname, middleNames, previousSurname, dob, gender, address, home, mobile, work, email, enabled, null, 'vbm')
        
        assertNotNull(person)
        assertEquals(person.firstName, firstName)
        assertEquals(person.preferredName, preferredName)
        assertEquals(person.middleNames, middleNames)
        assertEquals(person.surname, surname)
        assertEquals(person.legalSurname, legalSurname)
        assertEquals(person.previousSurname, previousSurname)
        assertEquals(person.home, home)
        assertEquals(person.mobile, mobile)
        assertEquals(person.work, work)
        assertEquals(person.email, email)
    }
    
    @Test
    void testConstructor_AllFieldsWithId() {
        Integer id = 1
        Title title = createTitle()
        Gender gender = createGender()
        Address address = createAddress()
        String firstName = 'T'
        String preferredName = 'TEST'
        Date dob = new Date().parse('yyyy/MM/dd', '2015/09/01')
        String middleNames = 'yellow'
        String surname = 'red'
        String legalSurname = 'red'
        String previousSurname = 'London'
        String home = 'canning home'
        String mobile = 'surrey'
        String work = 'e131dd'
        String email ='jupiter house'
        Boolean enabled = true
        Person person = new Person(id, title, firstName, preferredName, surname, legalSurname, middleNames, previousSurname, dob, gender, address, home, mobile, work, email, enabled, null, 'vbm')
        
        assertNotNull(person)
        assertEquals(person.id, id)
        assertEquals(person.firstName, firstName)
        assertEquals(person.preferredName, preferredName)
        assertEquals(person.middleNames, middleNames)
        assertEquals(person.surname, surname)
        assertEquals(person.legalSurname, legalSurname)
        assertEquals(person.previousSurname, previousSurname)
        assertEquals(person.home, home)
        assertEquals(person.mobile, mobile)
        assertEquals(person.work, work)
        assertEquals(person.email, email)
    }
    
    @Test
    void testMethod_ToString() {
        Person person = new Person()
        
        assertEquals(person.surname + ', ' + person.firstName, person.toString())
    }
}
