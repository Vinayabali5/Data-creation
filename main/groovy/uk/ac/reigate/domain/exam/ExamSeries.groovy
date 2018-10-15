package uk.ac.reigate.domain.exam

import java.util.logging.Logger

import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.persistence.UniqueConstraint
import uk.ac.reigate.domain.academic.AcademicYear
import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides


@Entity
@Table(name = "exam_series", catalog = "CID", schema = "Exams")
@Embeddable
class ExamSeries implements Serializable {
    private final static Logger log = Logger.getLogger(ExamSeries.class.getName())
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exam_series_id")
    private Integer examSeriesId
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "exam_board_id")
    private ExamBoard examBoard
    
    @Column(name = "exam_year", length = 4)
    private String examYear
    
    @Column(name = "exam_series", length = 2)
    private String examSeries
    
    @Column(name = "entry_submitted")
    private Boolean entrySubmitted
    
    @Column(name = "next_sequence_no")
    private Integer nextSequenceNo
    
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "academic_year_id")
    private AcademicYear academicYear
    
    public static class Builder {
        private Integer examSeriesId;
        private ExamBoard examBoard;
        private String examYear;
        private String examSeries;
        private Boolean entrySubmitted;
        private Integer nextSequenceNo;
        private AcademicYear academicYear;
        
        public Builder() {}
        
        public Builder examSeriesId(Integer examSeriesId) {
            this.examSeriesId = examSeriesId; return this;
        }
        public Builder examBoard(ExamBoard examBoard) {
            this.examBoard = examBoard; return this;
        }
        public Builder examYear(String examYear) {
            this.examYear = examYear; return this;
        }
        public Builder examSeries(String examSeries) {
            this.examSeries = examSeries; return this;
        }
        public Builder entrySubmitted(Boolean entrySubmitted) {
            this.entrySubmitted = entrySubmitted; return this;
        }
        public Builder nextSequenceNo(Integer nextSequenceNo) {
            this.nextSequenceNo = nextSequenceNo; return this;
        }
        public Builder academicYear(AcademicYear academicYear){
            this.academicYear = academicYear; return this;
        }
        
        public ExamSeries build() {
            return new ExamSeries(this);
        }
    }
    
    public ExamSeries() {}
    
    public ExamSeries(Builder builder) {
        if (builder.examSeriesId != null) this.examSeriesId = builder.examSeriesId;
        if (builder.examBoard != null) this.examBoard = builder.examBoard;
        if (builder.examYear != null) this.examYear = builder.examYear;
        if (builder.examSeries != null) this.examSeries = builder.examSeries;
        if (builder.entrySubmitted != null) this.entrySubmitted = builder.entrySubmitted;
        if (builder.nextSequenceNo != null) this.nextSequenceNo = builder.nextSequenceNo;
        if (builder.academicYear != null) this.academicYear = builder.academicYear;
    }
    
    public Integer getExamSeriesId() {
        return examSeriesId;
    }
    
    public void setExamSeriesId(Integer examSeriesId) {
        this.examSeriesId = examSeriesId;
    }
    
    public ExamBoard getExamBoard() {
        return examBoard;
    }
    
    public void setExamBoard(ExamBoard examBoard) {
        this.examBoard = examBoard;
    }
    
    public String getExamYear() {
        return examYear;
    }
    
    public void setExamYear(String examYear) {
        this.examYear = examYear;
    }
    
    public String getExamSeries() {
        return examSeries;
    }
    
    public void setExamSeries(String examSeries) {
        this.examSeries = examSeries;
    }
    
    public Boolean getEntrySubmitted() {
        return entrySubmitted;
    }
    
    public void setEntrySubmitted(Boolean entrySubmitted) {
        this.entrySubmitted = entrySubmitted;
    }
    
    public void nextSequenceNo(Integer nextSequenceNo) {
        this.nextSequenceNo = nextSequenceNo;
    }
    
    
    @Override
    public String toString() {
        return "ExamSeries [examSeriesId: " + String.valueOf(this.examSeriesId) +
                ", examBoard: " + this.examBoard.toString() +
                ", examYear: " + this.examYear +
                ", examSeries: " + this.examSeries +
                ", entrySubmitted: " + String.valueOf(this.entrySubmitted) +
                ", nextSequenceNo: " + String.valueOf(this.nextSequenceNo)
        "]";
    }
}
