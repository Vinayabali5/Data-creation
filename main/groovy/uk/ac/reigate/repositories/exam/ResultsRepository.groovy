package uk.ac.reigate.repositories.exam

import org.springframework.data.repository.PagingAndSortingRepository
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.exam.Results

interface ResultsRepository extends PagingAndSortingRepository<Results,Integer>{
    
    List<Results> findByStudent_Id(Integer studentId)
}
