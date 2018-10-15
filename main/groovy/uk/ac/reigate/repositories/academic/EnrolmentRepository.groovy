package uk.ac.reigate.repositories.academic

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.academic.AcademicYear
import uk.ac.reigate.domain.academic.Course
import uk.ac.reigate.domain.academic.Enrolment
import uk.ac.reigate.domain.academic.Student

interface EnrolmentRepository extends PagingAndSortingRepository<Enrolment, Integer> {
    
    List<Enrolment> findByCourse(Course course)
    
    List<Enrolment> findByCourseGroup_Id(Integer courseGroupId)
    
    List<Enrolment> findByCourseGroup_IdAndYear(Integer courseGroupId, AcademicYear year)
    
    List<Enrolment> findByCourse_Id(Integer courseId)
    
    List<Enrolment> findByCourse_IdAndYear(Integer courseId, AcademicYear year)
    
    List<Enrolment> findByYear_Id(Integer yearId)
    
    List<Enrolment> findByStudentAndYear(Student student, AcademicYear year);
    
    List<Enrolment> findByStudent_Id(Integer Student)
    
    List<Enrolment> findByStudent_IdAndCourse_IdAndYear_IdAndEndDateIsNull(Integer studentId, Integer courseGroupId, Integer YearId)
    
    List<Enrolment> findByStudent_IdAndYear_Id(Integer studentId, Integer yearId)
}
