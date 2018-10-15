package uk.ac.reigate.repositories

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param

import uk.ac.reigate.domain.academic.School

interface SchoolRepository extends PagingAndSortingRepository<School, Integer> {
    
    School findById(@Param("id") Integer id)
    
    School findByName(@Param("name") String name)
    
    School findByUrn(@Param("urn") String urn)
    
    List<School> findByNameLikeIgnoreCase(@Param("name") String name)
    
    List<School> findByNameContainingIgnoreCase(@Param("name") String name)
}
