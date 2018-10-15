package uk.ac.reigate.repositories.exam


import java.util.List;
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.exam.ExamOption
import uk.ac.reigate.domain.exam.Syllabus
import uk.ac.reigate.domain.exam.ExamSeries
import uk.ac.reigate.domain.exam.StudentOptionEntry
import uk.ac.reigate.domain.exam.StudentOptionEntryPk

interface StudentOptionEntryRepository extends CrudRepository<StudentOptionEntry, StudentOptionEntryPk> {
    
    StudentOptionEntry findByStudentAndExamOption(Student student, ExamOption examOption)
    
    StudentOptionEntry findByStudent_IdAndExamOption_ExamOptionId(Integer studentId, Integer examOptionId)
    
    List<StudentOptionEntry> findByStudent_Id(Integer studentId)
    
    StudentOptionEntry findByStudent(Student student)
    
    //  StudentOptionEntry findByStudent_Id(Integer studentId)
    
    StudentOptionEntry findByExamOption_ExamOptionId(Integer examOptionId)
    
    List<StudentOptionEntry> findByExamOption_OptionComponents_ExamComponentId(Integer examComponentId)
    
    List<StudentOptionEntry> findByExamOption_OptionComponents_ExamComponentIdAndStatusType_Id(Integer examComponentId, Integer statusTypeId)
    
    @Query(value="SELECT c FROM StudentOptionEntry c WHERE c.examOption.syllabus.examSeries.academicYear.id = :academicYearId AND student.id = :studentId")
    List<StudentOptionEntry> findByOptionYearIdAndStudentId(@Param(value="academicYearId") Integer academicYearId, @Param(value="studentId") Integer studentId)
    
}
