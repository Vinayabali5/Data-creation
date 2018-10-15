package uk.ac.reigate.repositories.lookup


import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import uk.ac.reigate.domain.lookup.TutorGroup

interface TutorGroupRepository extends PagingAndSortingRepository<TutorGroup, Integer> {
    
    TutorGroup findById(Integer id)
    
    List<TutorGroup> findAll()
    
    TutorGroup findByCode(String code)
    
    @Query("select s from TutorGroup s where s.inUse = :inUse ")
    List<TutorGroup> findBy_InUse(@Param("inUse") Boolean inUse)
}

