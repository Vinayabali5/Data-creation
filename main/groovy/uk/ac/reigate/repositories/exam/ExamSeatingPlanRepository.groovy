package uk.ac.reigate.repositories.exam

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.exam.ExamSeatingPlan

interface ExamSeatingPlanRepository extends PagingAndSortingRepository<ExamSeatingPlan, Integer> {
    
    List<ExamSeatingPlan> findByExamSession_DateAndExamSession_Session(Date date, String session)
    ExamSeatingPlan findByExamSession_IdAndRoom_Id(Integer examSessionId, Integer roomId)
}
