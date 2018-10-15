package uk.ac.reigate.repositories.academic

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.academic.Department

interface DepartmentRepository extends CrudRepository<Department, Integer> {
    
    Department findByName(String name)
    
    List<Department> findByFaculty_Id(Integer facultyId)
}
