package uk.ac.reigate.repositories.exam

import java.util.List

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.exam.CourseComponent;
import uk.ac.reigate.domain.exam.CourseComponentPk;

@Transactional
public interface CourseComponentRepository extends PagingAndSortingRepository<CourseComponent, CourseComponentPk> {
}
