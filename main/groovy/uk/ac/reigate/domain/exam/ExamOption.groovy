package uk.ac.reigate.domain.exam

import java.util.logging.Logger

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.persistence.CascadeType

import javax.persistence.OneToMany
import javax.persistence.OrderColumn;
import javax.persistence.JoinTable



@Entity
@Table(name = "exam_option", catalog = "CID", schema = "Exams")
class ExamOption implements Serializable {
    private final static Logger log = Logger.getLogger(ExamOption.class.getName())
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exam_option_id")
    private Integer examOptionId
    
    @ManyToOne(cascade=[CascadeType.DETACH])
    @JoinColumn(name = "exam_type_cert", referencedColumnName = "exam_type_id")
    private ExamType examTypeCert
    
    @ManyToOne(cascade=[CascadeType.DETACH])
    @JoinColumn(name = "exam_type_unit", referencedColumnName = "exam_type_id")
    private ExamType examTypeUnit
    
    @OneToMany(mappedBy = "examOption")
    private List<OptionComponent> optionComponents
    
    @Column(name = "option_entry_code", length = 6)
    private String optionEntryCode
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "syllabus_id")
    private Syllabus syllabus
    
    @Column(name = "process", length = 1)
    private String process
    
    @Column(name = "qca_classification_code", length = 4)
    private String qcaClassificationCode
    
    @Column(name = "qca_accreditation_no", length = 8)
    private String qcaAccreditationNo
    
    @Column(name = "option_title", length = 36)
    private String optionTitle
    
    @Column(name = "fee_defined", length = 1)
    private String feeDefined
    
    @Column(name = "examination_fee")
    private Integer examinationFee
    
    @Column(name = "first_forecast_grade_gradeset", length = 4)
    private String firstForecastGradeGradeset
    
    @Column(name = "second_forecast_grade_gradeset", length = 4)
    private String secondForecastGradeGradeset
    
    @Column(name = "result_type", length = 1)
    private String resultType
    
    @Column(name = "first_grade_result_gradeset", length = 4)
    private String firstGradeResultGradeset
    
    @Column(name = "second_grade_result_gradeset", length = 4)
    private String secondGradeResultGradeset
    
    @Column(name = "endorsement_to_first_grade_result_gradeset", length = 4)
    private String endorsementToFirstGradeResultGradeset
    
    @Column(name = "endorsement_to_second_grade_result_gradeset", length = 4)
    private String endorsementToSecondGradeResultGradeset
    
    @Column(name = "max_mark_ums")
    private Integer maxMarkUms
    
    @Column(name = "no_of_components")
    private Integer noOfComponents
    
    public static class Builder {
        private Integer examOptionId
        private ExamType examTypeCert
        private ExamType examTypeUnit
        private List<OptionComponent> optionComponents
        private String optionEntryCode
        private Syllabus syllabus
        private String process
        private String qcaClassificationCode
        private String qcaAccreditationNo
        private String optionTitle
        private String feeDefined
        private Integer examinationFee
        private String firstForecastGradeGradeset
        private String secondForecastGradeGradeset
        private String resultType
        private String firstGradeResultGradeset
        private String secondGradeResultGradeset
        private String endorsementToFirstGradeResultGradeset
        private String endorsementToSecondGradeResultGradeset
        private Integer maxMarkUms
        private Integer noOfComponents
        
        public Builder() {}
        public Builder examOptionId(Integer examOptionId) {
            this.examOptionId = examOptionId; return this;
        }
        public Builder examTypeCert(ExamType examTypeCert) {
            this.examTypeCert = examTypeCert; return this;
        }
        public Builder examTypeUnit(ExamType examTypeUnit) {
            this.examTypeUnit = examTypeUnit; return this;
        }
        public Builder optionComponents(List<OptionComponent> optionComponents) {
            this.optionComponents = optionComponents; return this;
        }
        public Builder optionEntryCode(String optionEntryCode) {
            this.optionEntryCode = optionEntryCode; return this;
        }
        public Builder syllabus(Syllabus syllabus) {
            this.syllabus = syllabus; return this;
        }
        public Builder process(String process) {
            this.process = process; return this;
        }
        public Builder qcaClassificationCode(String qcaClassificationCode) {
            this.qcaClassificationCode = qcaClassificationCode; return this;
        }
        public Builder qcaAccreditationNo(String qcaAccreditationNo) {
            this.qcaAccreditationNo = qcaAccreditationNo; return this;
        }
        public Builder optionTitle(String optionTitle) {
            this.optionTitle = optionTitle; return this;
        }
        public Builder feeDefined(String feeDefined) {
            this.feeDefined = feeDefined; return this;
        }
        public Builder examinationFee(Integer examinationFee) {
            this.examinationFee = examinationFee; return this;
        }
        public Builder firstForecastGradeGradeset(String firstForecastGradeGradeset) {
            this.firstForecastGradeGradeset = firstForecastGradeGradeset; return this;
        }
        public Builder secondForecastGradeGradeset(String secondForecastGradeGradeset) {
            this.secondForecastGradeGradeset = secondForecastGradeGradeset; return this;
        }
        public Builder resultType(String resultType) {
            this.resultType = resultType; return this;
        }
        public Builder firstGradeResultGradeset(String firstGradeResultGradeset) {
            this.firstGradeResultGradeset = firstGradeResultGradeset; return this;
        }
        public Builder secondGradeResultGradeset(String secondGradeResultGradeset) {
            this.secondGradeResultGradeset = secondGradeResultGradeset; return this;
        }
        public Builder endorsementToFirstGradeResultGradeset(String endorsementToFirstGradeResultGradeset) {
            this.endorsementToFirstGradeResultGradeset = endorsementToFirstGradeResultGradeset; return this;
        }
        public Builder endorsementToSecondGradeResultGradeset(String endorsementToSecondGradeResultGradeset) {
            this.endorsementToSecondGradeResultGradeset = endorsementToSecondGradeResultGradeset; return this;
        }
        public Builder maxMarkUms(Integer maxMarkUms) {
            this.maxMarkUms = maxMarkUms; return this;
        }
        public Builder noOfComponents(Integer noOfComponents) {
            this.noOfComponents = noOfComponents; return this;
        }
        public ExamOption build() {
            return new ExamOption(this);
        }
    }
    
    public ExamOption() {}
    
    private ExamOption(Builder builder){
        if (builder.examOptionId != null) this.examOptionId = builder.examOptionId;
        if (builder.examTypeCert != null) this.examTypeCert = builder.examTypeCert;
        if (builder.examTypeUnit != null) this.examTypeUnit = builder.examTypeUnit;
        if (builder.optionComponents != null) this.optionComponents = builder.optionComponents;
        if (builder.optionEntryCode != null) this.optionEntryCode = builder.optionEntryCode;
        if (builder.syllabus != null) this.syllabus = builder.syllabus;
        if (builder.process != null) this.process = builder.process;
        if (builder.qcaClassificationCode != null) this.qcaClassificationCode = builder.qcaClassificationCode;
        if (builder.qcaAccreditationNo != null) this.qcaAccreditationNo = builder.qcaAccreditationNo;
        if (builder.optionTitle != null) this.optionTitle = builder.optionTitle
        if (builder.feeDefined != null) this.feeDefined = builder.feeDefined
        if (builder.examinationFee != null) this.examinationFee = builder.examinationFee
        if (builder.firstForecastGradeGradeset != null) this.firstForecastGradeGradeset = builder.firstForecastGradeGradeset
        if (builder.secondForecastGradeGradeset != null) this.secondForecastGradeGradeset = builder.secondForecastGradeGradeset
        if (builder.resultType != null) this.resultType = builder.resultType
        if (builder.firstGradeResultGradeset != null) this.firstGradeResultGradeset = builder.firstGradeResultGradeset
        if (builder.secondGradeResultGradeset != null) this.secondGradeResultGradeset = builder.secondGradeResultGradeset
        if (builder.endorsementToFirstGradeResultGradeset != null) this.endorsementToFirstGradeResultGradeset = builder.endorsementToFirstGradeResultGradeset
        if (builder.endorsementToSecondGradeResultGradeset != null) this.endorsementToSecondGradeResultGradeset = builder.endorsementToSecondGradeResultGradeset
        if (builder.maxMarkUms != null) this.maxMarkUms = builder.maxMarkUms
        if (builder.noOfComponents != null) this.noOfComponents = builder.noOfComponents
    }
    
    public Integer getExamOptionId() {
        return examOptionId;
    }
    
    public void setExamOptionId(Integer examOptionId) {
        this.examOptionId = examOptionId;
    }
    
    public ExamType getExamTypeCert() {
        return examTypeCert;
    }
    
    public void setExamTypeCert(ExamType examTypeCert) {
        this.examTypeCert = examTypeCert;
    }
    
    public ExamType getExamTypeUnit() {
        return examTypeUnit;
    }
    
    public void setExamTypeUnit(ExamType examTypeUnit) {
        this.examTypeUnit = examTypeUnit;
    }
    
    public List<OptionComponent> getOptionComponents() {
        return optionComponents
    }
    
    public void setOptionComponents(List<OptionComponent> optionComponents) {
        this.optionComponents = optionComponents;
    }
    public String getOptionEntryCode() {
        return optionEntryCode;
    }
    
    public void setOptionEntryCode(String optionEntryCode) {
        this.optionEntryCode = optionEntryCode;
    }
    
    public Syllabus getSyllabus() {
        return syllabus;
    }
    
    public void setSyllabus(Syllabus syllabus) {
        this.syllabus = syllabus;
    }
    
    public String getProcess() {
        return process;
    }
    
    public void setProcess(String process) {
        this.process = process;
    }
    
    public String getQcaClassificationCode() {
        return qcaClassificationCode;
    }
    
    public void setQcaClassificationCode(String qcaClassificationCode) {
        this.qcaClassificationCode = qcaClassificationCode;
    }
    
    public String getQcaAccreditationNo() {
        return qcaAccreditationNo;
    }
    
    public void setQcaAccreditationNo(String qcaAccreditationNo) {
        this.qcaAccreditationNo = qcaAccreditationNo;
    }
    
    public String getOptionTitle() {
        return optionTitle;
    }
    
    public void setOptionTitle(String optionTitle) {
        this.optionTitle = optionTitle;
    }
    
    public String getFeeDefined() {
        return feeDefined;
    }
    
    public void setFeeDefined(String feeDefined) {
        this.feeDefined = feeDefined;
    }
    
    public Integer getExaminationFee() {
        return examinationFee;
    }
    
    public void setExaminationFee(Integer examinationFee) {
        this.examinationFee = examinationFee;
    }
    
    public String getFirstForecastGradeGradeset() {
        return firstForecastGradeGradeset;
    }
    
    public void setFirstForecastGradeGradeset(String firstForecastGradeGradeset) {
        this.firstForecastGradeGradeset = firstForecastGradeGradeset;
    }
    
    public String getSecondForecastGradeGradeset() {
        return secondForecastGradeGradeset;
    }
    
    public void setSecondForecastGradeGradeset(String secondForecastGradeGradeset) {
        this.secondForecastGradeGradeset = secondForecastGradeGradeset;
    }
    
    public String getResultType() {
        return resultType;
    }
    
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
    
    public String getFirstGradeResultGradeset() {
        return firstGradeResultGradeset;
    }
    
    public void setFirstGradeResultGradeset(String firstGradeResultGradeset) {
        this.firstGradeResultGradeset = firstGradeResultGradeset;
    }
    
    public String getSecondGradeResultGradeset() {
        return secondGradeResultGradeset;
    }
    
    public void setSecondGradeResultGradeset(String secondGradeResultGradeset) {
        this.secondGradeResultGradeset = secondGradeResultGradeset;
    }
    
    public String getEndorsementToFirstGradeResultGradeset() {
        return endorsementToFirstGradeResultGradeset;
    }
    
    public void setEndorsementToFirstGradeResultGradeset(String endorsementToFirstGradeResultGradeset) {
        this.endorsementToFirstGradeResultGradeset = endorsementToFirstGradeResultGradeset;
    }
    
    public String getEndorsementToSecondGradeResultGradeset() {
        return endorsementToSecondGradeResultGradeset;
    }
    
    public void setEndorsementToSecondGradeResultGradeset(String endorsementToSecondGradeResultGradeset) {
        this.endorsementToSecondGradeResultGradeset = endorsementToSecondGradeResultGradeset;
    }
    
    public Integer getMaxMarkUms() {
        return maxMarkUms;
    }
    
    public void setMaxMarkUms(Integer maxMarkUms) {
        this.maxMarkUms = maxMarkUms;
    }
    
    public Integer getNoOfComponents() {
        return noOfComponents;
    }
    
    public void setNoOfComponents(Integer noOfComponents) {
        this.noOfComponents = noOfComponents;
    }
    
    @Override
    public String toString() {
        return "Option [examOptionId: " + String.valueOf(this.examOptionId) +
                ", optionEntryCode: " + this.optionEntryCode +
                ", syllabus: " + this.syllabus.toString() +
                ", " + this.examTypeCert.toString() +
                ", " + this.examTypeUnit.toString() +
                ", process: " + this.process +
                ", qcaClassificationCode: " + this.qcaClassificationCode +
                ", qcaAccreditationNo: " + this.qcaAccreditationNo +
                ", optionTitle: " + this.optionTitle +
                ", feeDefined: " + this.feeDefined +
                ", examinationFee: " + String.valueOf(this.examinationFee) +
                ", firstForecastGradeGradeset: " + this.firstForecastGradeGradeset +
                ", secondForecastGradeGradeset: " + this.secondForecastGradeGradeset +
                ", resultType: " + this.resultType +
                ", firstGradeResultGradeset: " + this.firstGradeResultGradeset +
                ", secondGradeResultGradeset: " + this.secondGradeResultGradeset +
                ", endorsementToFirstGradeResultGradeset: " + this.endorsementToFirstGradeResultGradeset +
                ", endorsementToSecondGradeResultGradeset: " + this.endorsementToSecondGradeResultGradeset +
                ", maxMarkUms: " + String.valueOf(this.maxMarkUms) +
                ", noOfComponents: " + String.valueOf(noOfComponents) + "]"
    }
}
