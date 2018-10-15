package uk.ac.reigate.repositories.academic

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.academic.InterimReport

interface InterimReportRepository extends CrudRepository<InterimReport, Integer> {
}
