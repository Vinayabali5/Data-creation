package uk.ac.reigate.repositories.exam

import java.util.List

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.exam.CourseSyllabus;
import uk.ac.reigate.domain.exam.CourseSyllabusPk;

@Transactional
public interface CourseSyllabusRepository extends PagingAndSortingRepository<CourseSyllabus, CourseSyllabusPk> {
}
