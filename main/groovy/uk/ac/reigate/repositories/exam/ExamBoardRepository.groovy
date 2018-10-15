package uk.ac.reigate.repositories.exam

import java.util.List

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;

import uk.ac.reigate.domain.exam.ExamBoard

@Transactional
public interface ExamBoardRepository extends PagingAndSortingRepository<ExamBoard, Integer> {
    
    ExamBoard findByName(String name);
    
    List<ExamBoard> findByBoardCode(String boardCode);
    List<ExamBoard> findByBoardIdentifier(String boardIdentifier);
}
