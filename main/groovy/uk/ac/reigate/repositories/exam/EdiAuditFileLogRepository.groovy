package uk.ac.reigate.repositories.exam


import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.exam.EdiAuditFileLog

interface EdiAuditFileLogRepository extends CrudRepository<EdiAuditFileLog, Integer> {
}
