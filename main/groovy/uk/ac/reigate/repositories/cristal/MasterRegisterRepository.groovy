package uk.ac.reigate.repositories.cristal

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor
import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.academic.StudentEntryQualification;
import uk.ac.reigate.domain.cristal.MasterRegister


interface MasterRegisterRepository extends CrudRepository<MasterRegister, Integer> {
    
    List<MasterRegister> findByStudent_Id(Integer studentId)
    
    List<MasterRegister> findByStudentIdAndAcademicYearId(Integer studentId, Integer academicYearId)
}
