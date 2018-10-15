package uk.ac.reigate.repositories.exam

import javax.transaction.Transactional

import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.exam.ExamOption
import uk.ac.reigate.domain.exam.Syllabus;;;


@Transactional
public interface ExamOptionRepository extends PagingAndSortingRepository<ExamOption, Integer> {
    
    List<ExamOption> findByOptionEntryCode(String optionEntryCode);
    
    List<ExamOption> findByOptionEntryCodeContaining(String optionEntryCode);
    
    List<ExamOption> findBySyllabus(Syllabus syllabus);
    
    List<ExamOption> findBySyllabus(Syllabus syllabus, PageRequest pageRequest);
}
