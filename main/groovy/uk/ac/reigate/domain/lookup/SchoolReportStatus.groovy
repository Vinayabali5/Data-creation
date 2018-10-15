package uk.ac.reigate.domain.lookup

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.CodedEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "school_report_status_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class SchoolReportStatus extends CodedEntity {
    
    SchoolReportStatus(){}
    
    SchoolReportStatus(Integer id, String code, String description) {
        this.id = id;
        this.code = code;
        this.description = description;
    }
    
    SchoolReportStatus(String code, String description) {
        this(null, code, description);
    }
    
    String toString() {
        return code + ' - ' + description
    }
}
