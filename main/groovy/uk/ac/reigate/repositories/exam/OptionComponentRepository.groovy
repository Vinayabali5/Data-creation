package uk.ac.reigate.repositories.exam

import javax.transaction.Transactional

import org.springframework.data.repository.CrudRepository

import uk.ac.reigate.domain.exam.OptionComponent
import uk.ac.reigate.domain.exam.OptionComponentPk;;;


@Transactional
public interface OptionComponentRepository extends CrudRepository<OptionComponent, OptionComponentPk> {
}
