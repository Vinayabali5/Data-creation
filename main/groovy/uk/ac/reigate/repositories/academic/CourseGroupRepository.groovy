package uk.ac.reigate.repositories.academic

import org.springframework.data.jpa.repository.Query
import org.springframework.data.querydsl.QueryDslPredicateExecutor
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

import uk.ac.reigate.domain.academic.AcademicYear;
import uk.ac.reigate.domain.academic.Course
import uk.ac.reigate.domain.academic.CourseGroup

interface CourseGroupRepository extends CrudRepository<CourseGroup, Integer> , QueryDslPredicateExecutor{
    
    List <CourseGroup> findByYear(AcademicYear year);
    
    @Query("SELECT c FROM CourseGroup c WHERE year.id <= :yearId")
    List<CourseGroup> findCourseGroupYear(@Param(value = "yearId") Integer yearId)
    
    List<CourseGroup> findByCourse(Course course);
    
    @Query("SELECT c FROM CourseGroup c WHERE course.id <= :courseId")
    List<CourseGroup> findCourseGroupCourse(@Param(value = "courseId") Integer courseId)
    
    List<CourseGroup> findBySpec(String spec);
    
    List<CourseGroup> findBySpecLike(String spec);
    
    //   List<CourseGroup> findByYear_IdAndCourse_IdAndSpec(Integer yearId, Integer courseId, String spec);
    
    @Query("SELECT c FROM CourseGroup c WHERE c.year = :year or c.course = :course")
    List<CourseGroup> findByYearOrCourse(@Param(value = "year") AcademicYear year,
    @Param(value = "course") Course course)
    
    List<CourseGroup> findByYearAndSpecLike(AcademicYear year, String spec)
    
    @Query("SELECT c FROM CourseGroup c WHERE ((:yearId != NULL AND c.year.id = :yearId) OR :yearId = NULL) AND ((:courseId != NULL AND c.course.id =:courseId) OR :courseId = NULL) AND ((:spec != NULL AND c.spec = :spec) OR :spec = NULL)")
    List<CourseGroup> findByYear_IdAndCourse_IdAndSpec(@Param(value = "yearId") Integer yearId, @Param(value = "courseId") Integer courseId, @Param(value = "spec") String spec);
    
    List<CourseGroup> findByCourse_IdAndYear(Integer courseId, AcademicYear year)
    
    
    @Query("SELECT c FROM CourseGroup c WHERE year.id = :yearId")
    List<CourseGroup> findCourseGroupYearId(@Param(value = "yearId") Integer yearId)
    
    
    @Query("SELECT c FROM CourseGroup c WHERE c.id = :courseGroupId AND  year.id <= :yearId" )
    CourseGroup findCourseGroupByIdYearId(@Param(value="courseGroupId") Integer courseGroupId, @Param(value = "yearId") Integer yearId)
    
    List<CourseGroup> findByCourseLeader_IdAndYear_Id(Integer courseLeaderId, Integer yearId)
    
}
