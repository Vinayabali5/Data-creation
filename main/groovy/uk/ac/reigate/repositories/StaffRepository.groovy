package uk.ac.reigate.repositories

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.Person
import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.lookup.StaffType

interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {
    
    Staff findByPerson(Person person)
    
    List<Staff> findByEndDateIsNull()
    
    @Query("select s from Staff s where s.endDate is null AND s.type.needInitials = True")
    List<Staff> findAllCurrent()
    
    @Query("select s from Staff s where s.endDate is null AND s.type.needInitials = True")
    Page<Staff> findAllCurrent(Pageable page)
    
    List<Staff> findByType_NeedInitialsTrue()
    
    List<Staff> findByTypeIn(List<StaffType> staffTypes)
}
