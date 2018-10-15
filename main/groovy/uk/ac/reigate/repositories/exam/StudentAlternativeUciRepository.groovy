package uk.ac.reigate.repositories.exam

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.exam.StudentAlternativeUci
import uk.ac.reigate.domain.exam.StudentAlternativeUciPk

interface StudentAlternativeUciRepository extends CrudRepository<StudentAlternativeUci, StudentAlternativeUciPk>{
    
    List <StudentAlternativeUci> findByStudent(Student student)
    
    List <StudentAlternativeUci> findByStudent_Id(Integer studentId)
    
    List<StudentAlternativeUci> findAll()
    
    StudentAlternativeUci findByStudent_IdAndExamBoard_Id(Integer studentId,Integer examBoardId)
}
