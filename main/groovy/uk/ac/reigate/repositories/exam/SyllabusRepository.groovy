package uk.ac.reigate.repositories.exam

import javax.transaction.Transactional

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.querydsl.QueryDslPredicateExecutor
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param

import uk.ac.reigate.domain.exam.Syllabus

@Transactional
public interface SyllabusRepository extends PagingAndSortingRepository<Syllabus, Integer>, QueryDslPredicateExecutor<Syllabus> {
    
    List<Syllabus> findByCode(String code);
    
    @Query("select s from Syllabus s where s.examSeries.examBoard.id = :examBoardId")
    List<Syllabus> findByExamSeries(@Param("examBoardId") Integer examBoardId);
    
    @Query("select s from Syllabus s where s.examSeries.examBoard.id = :examBoardId")
    Page<Syllabus> findByExamSeries(@Param("examBoardId") Integer examBoardId, @Param("pageRequest") Pageable pageable);
    
    //    @Query("select s from Syllabus s join ExamOption eo where ")
    //    List<Syllabus> findByExamOptionEntryCode(@Param("entryCode") String entryCode)
    
    List<Syllabus> findByExamOptions_OptionEntryCode(String entryCode)
    
    @Query("select s from Syllabus s where s.examSeries.academicYear.id = :yearId")
    List<Syllabus> findByYearId(@Param("yearId") Integer yearId)
}
