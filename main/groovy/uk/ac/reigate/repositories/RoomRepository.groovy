package uk.ac.reigate.repositories

import org.springframework.data.repository.PagingAndSortingRepository

import uk.ac.reigate.domain.Room

interface RoomRepository extends PagingAndSortingRepository<Room, Integer> {
    
    Room findByCode(String code)
    
    Room findById(Integer id)
}
