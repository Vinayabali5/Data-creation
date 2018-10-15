package uk.ac.reigate.repositories.exam

import javax.transaction.Transactional

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

import uk.ac.reigate.domain.academic.AcademicYear
import uk.ac.reigate.domain.exam.ExamSeat
import uk.ac.reigate.domain.exam.ExamSeatPk

@Transactional
public interface ExamSeatRepository extends CrudRepository<ExamSeat, ExamSeatPk> {
    
    @Query(value = "SELECT s AS student,ec as examComponent,(SELECT es.examSeatingPlan FROM ExamSeat es WHERE (es.examComponent = ec.examComponentId AND es.student = s.id)) as examSeatingPlan, (SELECT es.row FROM ExamSeat es WHERE (es.examComponent = ec.examComponentId AND es.student = s.id)) as row, (SELECT es.col FROM ExamSeat es WHERE (es.examComponent = ec.examComponentId AND es.student = s.id)) as col FROM StudentOptionEntry soe INNER JOIN soe.examOption eo INNER JOIN eo.optionComponents oc INNER JOIN oc.examComponent ec INNER JOIN soe.student s WHERE soe.statusType.id = 1 AND ec.examComponentId = :examComponentId")
    List<ExamSeat> findByExamComponentId(@Param(value = "examComponentId") Integer examComponentId)
    
    
    ExamSeat findByStudent_IdAndExamComponent_ExamComponentId(@Param(value = "studentId") Integer studentId, @Param(value = "examComponentId") Integer examComponentId)
    
    //    @Query(value = "SELECT s AS student,ec as examComponent,(SELECT es.examSeatingPlan FROM ExamSeat es WHERE (es.examComponent = ec.examComponentId AND es.student = s.id)) as examSeatingPlan, (SELECT es.row FROM ExamSeat es WHERE (es.examComponent = ec.examComponentId AND es.student = s.id)) as row, (SELECT es.col FROM ExamSeat es WHERE (es.examComponent = ec.examComponentId AND es.student = s.id)) as col FROM StudentYear sy INNER sy.student StudentOptionEntry soe INNER JOIN soe.examOption eo INNER JOIN eo.optionComponents oc INNER JOIN oc.examComponent ec INNER JOIN soe.student s INNER JOIN StudentYear sy WHERE soe.statusType.id = 1 AND ec.examComponentId = :examComponentId AND sy.year = :academicYear")
    //    List<ExamSeat> findByExamComponentIdAndAcademicYear(@Param(value = "examComponentId") Integer examComponentId, @Param(value = "academicYear") AcademicYear academicYear)
}
