package uk.ac.reigate.domain.exam
import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.academic.Student


@Entity
@Table(name = "edi_audit_file_log", catalog = "CID", schema = "Exams")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "edi_audit_file_log_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class EdiAuditFileLog extends BaseEntity implements Serializable {
    
    @OneToOne
    @JoinColumn(name = "exam_series_id")
    ExamSeries examSeries
    
    /**
     * The text representation of the Edi File Name
     */
    @Column(name="edi_file_name")
    String ediFileName
    
    @Column(name="file_time_stamp")
    Date fileTimeStamp
    
    
    EdiAuditFileLog() {}
    
    EdiAuditFileLog(Integer id, ExamSeries examSeries, String ediFileName, Date fileTimeStamp){
        this.id = id;
        this.examSeries = examSeries;
        this.ediFileName = ediFileName;
        this.fileTimeStamp = fileTimeStamp;
    }
    
    String toString() {
        return "EdiAuditFileLog [id: " + String.valueOf(this.id) +
                ", examSeries: " + this.examSeries.toString() +
                ", ediFileName: " + this.ediFileName +
                ", fileTimeStamp: " + this.fileTimeStamp.toString();
    }
}

