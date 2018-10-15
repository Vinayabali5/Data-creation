package uk.ac.reigate.repositories.exam

import javax.transaction.Transactional

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.exam.ExamType;;


@Transactional
public interface ExamTypeRepository extends CrudRepository<ExamType, Integer> {
    List<ExamType> findByQualificationAndLevel(String qualification, String level);
}
