package uk.ac.reigate.repositories.exam

import javax.transaction.Transactional

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.exam.ExamSeries;


@Transactional
public interface ExamSeriesRepository extends PagingAndSortingRepository<ExamSeries, Integer> {
    
    List<ExamSeries> findByExamYearAndExamSeries(String examYear, String examSeries);
    
    List<ExamSeries> findByExamBoard_Id(Integer examBoardId);
    
    List<ExamSeries> findByAcademicYear_Id(Integer yearId);
    
    List<ExamSeries> findByExamBoard_IdAndAcademicYear_Id(Integer examBoardId, Integer yearId);
    
    List<ExamSeries> findByExamBoard_Id(Integer examBoardId, Pageable pageable);
}
