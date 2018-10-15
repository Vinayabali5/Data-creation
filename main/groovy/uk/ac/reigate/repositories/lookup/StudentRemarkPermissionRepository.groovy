package uk.ac.reigate.repositories.lookup

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.lookup.StudentRemarkPermission

interface StudentRemarkPermissionRepository extends PagingAndSortingRepository<StudentRemarkPermission, Integer> {
    
    StudentRemarkPermission findById(Integer id)
    
    List<StudentRemarkPermission> findAll()
    
    StudentRemarkPermission findByCode(String code)
}
