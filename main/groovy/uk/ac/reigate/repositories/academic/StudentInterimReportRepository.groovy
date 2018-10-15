package uk.ac.reigate.repositories.academic

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param;
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.academic.StudentInterimReport
import uk.ac.reigate.domain.academic.StudentInterimReportPk


interface StudentInterimReportRepository extends CrudRepository<StudentInterimReport, StudentInterimReportPk> {
    
    List<StudentInterimReport> findByStudent(Student student)
    
    List<StudentInterimReport> findByStudent_Id(Integer studentId)
    
    List <StudentInterimReport> findByStudent_IdAndInterimReport_Id(Integer studentId, Integer interimReportId)
    
    @Query("select s from StudentInterimReport s where s.student.id= :studentId AND s.interimReport.year.id = :yearId")
    List <StudentInterimReport> findByStudentAndYearId(@Param("studentId")Integer studentId, @Param("yearId")Integer yearId)
}