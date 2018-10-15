package uk.ac.reigate.repositories.ilp

import java.util.List;

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.ilp.Target


interface TargetRepository extends CrudRepository<Target, Integer> {
}
