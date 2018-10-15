package uk.ac.reigate.repositories.exam

import java.util.List

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.exam.CourseOption
import uk.ac.reigate.domain.exam.CourseOptionPk;;

@Transactional
public interface CourseOptionRepository extends PagingAndSortingRepository<CourseOption, CourseOptionPk> {
}
