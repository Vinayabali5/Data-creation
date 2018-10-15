package uk.ac.reigate.domain.exam

import java.util.logging.Logger

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne;
import javax.persistence.Table
import javax.persistence.UniqueConstraint;
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides


@Entity
@Table(name = "exam_type", catalog = "CID", schema = "Exams", uniqueConstraints = @UniqueConstraint(columnNames = ["exam_type_id", "qualification", "level"]))
class ExamType implements Serializable {
    private final static Logger log = Logger.getLogger(ExamType.class.getName())
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exam_type_id")
    private long examTypeId
    
    @Column(name = "qualification", length = 4)
    private String qualification
    
    @Column(name = "level", length = 3)
    private String level
    
    public static class Builder {
        private Integer examTypeId
        private String qualification
        private String level
        
        public Builder() {}
        public Builder examTypeId(Integer examTypeId) {
            this.examTypeId = examTypeId; return this;
        }
        public Builder qualification(String qualification) {
            this.qualification = qualification; return this;
        }
        public Builder level(String level) {
            this.level = level; return this;
        }
        public ExamType build() {
            return new ExamType(this);
        }
    }
    
    public ExamType() {}
    
    private ExamType(Builder builder){
        if (builder.examTypeId != null) this.examTypeId = builder.examTypeId;
        if (builder.qualification != null) this.qualification = builder.qualification;
        if (builder.level != null) this.level = builder.level;
    }
    
    public String getQualification() {
        return qualification;
    }
    
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    public long getExamTypeId() {
        return examTypeId;
    }
    
    public void setExamTypeId(long examTypeId) {
        this.examTypeId = examTypeId;
    }
    
    public String getLevel() {
        return level;
    }
    
    public void setLevel(String level) {
        this.level = level;
    }
    
    @Override
    public String toString() {
        return "ExamType [examTypeId: " + String.valueOf(this.examTypeId) + ", qualification: " + this.qualification + ", level: " + this.level + "]";
    }
}
