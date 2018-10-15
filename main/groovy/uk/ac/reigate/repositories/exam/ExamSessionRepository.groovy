package uk.ac.reigate.repositories.exam

import javax.transaction.Transactional

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.exam.ExamSession;

@Transactional
public interface ExamSessionRepository extends PagingAndSortingRepository<ExamSession, Integer> {
    
    ExamSession findByDateAndSession(Date date, String session)
}
