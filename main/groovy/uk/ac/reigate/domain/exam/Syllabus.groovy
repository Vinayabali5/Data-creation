package uk.ac.reigate.domain.exam

import java.util.logging.Logger

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table



@Entity
@Table(name = "syllabus", catalog = "CID", schema = "Exams")
class Syllabus implements Serializable {
    private final static Logger log = Logger.getLogger(Syllabus.class.getName())
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "syllabus_id")
    private Integer syllabusId
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "exam_series_id")
    private ExamSeries examSeries
    
    @Column(name = "Code", length = 6)
    private String code
    
    @Column(name = "title", length = 36)
    private String title
    
    @OneToMany(mappedBy = 'syllabus')
    List<ExamOption> examOptions
    
    public static class Builder {
        private Integer syllabusId;
        private ExamSeries examSeries;
        private String code;
        private String title;
        
        public Builder() {}
        public Builder syllabusId(Integer syllabusId) {
            this.syllabusId = syllabusId; return this;
        }
        public Builder examSeries(ExamSeries examSeries) {
            this.examSeries = examSeries; return this;
        }
        public Builder code(String code) {
            this.code = code; return this;
        }
        public Builder title(String title) {
            this.title = title; return this;
        }
        public Syllabus build() {
            return new Syllabus(this);
        }
    }
    
    public Syllabus() {}
    
    public Syllabus(Builder builder){
        if (builder.syllabusId != null) this.syllabusId = builder.syllabusId;
        if (builder.examSeries != null) this.examSeries = builder.examSeries;
        if (builder.code != null) this.code = builder.code;
        if (builder.title != null) this.title = builder.title;
    }
    
    public ExamSeries getExamSeries() {
        return examSeries;
    }
    
    public void setExamSeries(ExamSeries examSeries) {
        this.examSeries = examSeries;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Integer getSyllabusId() {
        return syllabusId;
    }
    
    public void setSyllabusId(Integer syllabusId) {
        this.syllabusId = syllabusId;
    }
    
    @Override
    public String toString() {
        return "Syllabus [syllabusId: " + String.valueOf(syllabusId) +
                ", examSeries: " + examSeries.toString() +
                ", code: " + code +
                ", title: " + title +
                "]";
    }
}
