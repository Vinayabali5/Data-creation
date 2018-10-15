package uk.ac.reigate.domain.exam

import java.text.SimpleDateFormat;
import java.text.DateFormat;
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
import javax.persistence.OneToMany;
import javax.persistence.Table

import com.fasterxml.jackson.annotation.JsonFormat;;



@Entity
@Table(name = "exam_component", catalog = "CID", schema = "Exams")
@Embeddable
class ExamComponent implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exam_component_id")
    private Integer examComponentId
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "exam_series_id")
    private ExamSeries examSeries
    
    @OneToMany(mappedBy = "examComponent")
    private List<OptionComponent> optionComponents
    
    @Column(name = "code", length = 12)
    private String code
    
    @Column(name = "title", length = 36)
    private String title
    
    @Column(name = "teacher_marks", length = 1)
    private String teacherMarks
    
    @Column(name = "maximum_mark")
    private Integer maximumMark
    
    @Column(name = "gradeset", length = 4)
    private String gradeset
    
    @Column(name = "due_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dueDate
    
    @Column(name = "timetabled", length = 1)
    private String timetabled
    
    @Column(name = "timetable_date")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date timetableDate
    
    @Column(name = "timetable_session", length = 1)
    private String timetableSession
    
    @Column(name = "time_allowed")
    private Integer timeAllowed
    
    public static class Builder {
        private Integer examComponentId;
        private ExamSeries examSeries;
        private List<OptionComponent> optionComponents;
        private String code;
        private String title;
        private String teacherMarks;
        private Integer maximumMark;
        private String gradeset;
        private Date dueDate;
        private String timetabled;
        private Date timetableDate;
        private String timetableSession;
        private Integer timeAllowed;
        
        public Builder() {}
        public Builder examComponentId(Integer examComponentId) {
            this.examComponentId = examComponentId; return this;
        }
        public Builder examSeries(ExamSeries examSeries) {
            this.examSeries = examSeries; return this;
        }
        public Builder optionComponents(List<OptionComponent> optionComponents) {
            this.optionComponents = optionComponents; return this;
        }
        public Builder code(String code) {
            this.code = code; return this;
        }
        public Builder title(String title) {
            this.title = title; return this;
        }
        public Builder teacherMarks(String teacherMarks) {
            this.teacherMarks = teacherMarks; return this;
        }
        public Builder maximumMark(Integer maximumMark) {
            this.maximumMark = maximumMark; return this;
        }
        public Builder gradeset(String gradeset) {
            this.gradeset = gradeset; return this;
        }
        public Builder dueDate(Date dueDate) {
            this.dueDate = dueDate; return this;
        }
        public Builder timetabled(String timetabled) {
            this.timetabled = timetabled; return this;
        }
        public Builder timetableDate(Date timetableDate) {
            this.timetableDate = timetableDate; return this;
        }
        public Builder timetableSession(String timetableSession) {
            this.timetableSession = timetableSession; return this;
        }
        public Builder timeAllowed(Integer timeAllowed) {
            this.timeAllowed = timeAllowed; return this;
        }
        
        public ExamComponent build() {
            return new ExamComponent(this);
        }
    }
    
    /*
     * Constructors:
     */
    public ExamComponent() {}
    
    public ExamComponent(Builder builder){
        if (builder.examComponentId != null) this.examComponentId = builder.examComponentId;
        if (builder.examSeries != null) this.examSeries = builder.examSeries;
        if (builder.optionComponents != null) this.optionComponents = builder.optionComponents;
        if (builder.code != null) this.code = builder.code;
        if (builder.title != null) this.title = builder.title;
        if (builder.teacherMarks != null) this.teacherMarks = builder.teacherMarks;
        if (builder.maximumMark != null) this.maximumMark = builder.maximumMark;
        if (builder.gradeset != null) this.gradeset = builder.gradeset;
        if (builder.dueDate != null) this.dueDate = builder.dueDate;
        if (builder.timetabled != null) this.timetabled = builder.timetabled;
        if (builder.timetableDate != null) this.timetableDate = builder.timetableDate;
        if (builder.timetableSession != null) this.timetableSession = builder.timetableSession;
        if (builder.timeAllowed != null) this.timeAllowed = builder.timeAllowed;
    }
    
    public Integer getExamComponentId() {
        return examComponentId;
    }
    
    public void setComponentId(Integer examComponentId) {
        this.examComponentId = examComponentId;
    }
    
    public ExamSeries getExamSeries() {
        return examSeries;
    }
    
    public void setExamSeries(ExamSeries examSeries) {
        this.examSeries = examSeries;
    }
    
    public List<OptionComponent> getOptionComponents() {
        return optionComponents;
    }
    
    public void setOptionComponents(List<OptionComponent> optionComponents) {
        this.optionComponents = optionComponents;
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
    
    public String getTeacherMarks() {
        return teacherMarks;
    }
    
    public void setTeacherMarks(String teacherMarks) {
        this.teacherMarks = teacherMarks;
    }
    
    public Integer getMaximumMark() {
        return maximumMark;
    }
    
    public void setMaximumMark(Integer maximumMark) {
        this.maximumMark = maximumMark;
    }
    
    public String getGradeset() {
        return gradeset;
    }
    
    public void setGradeset(String gradeset) {
        this.gradeset = gradeset;
    }
    
    public Date getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    
    public String getTimetabled() {
        return timetabled;
    }
    
    public void setTimetabled(String timetabled) {
        this.timetabled = timetabled;
    }
    
    public Date getTimetableDate() {
        return timetableDate;
    }
    
    public void setTimetableDate(Date timetableDate) {
        this.timetableDate = timetableDate;
    }
    
    public String getTimetableSession() {
        return timetableSession;
    }
    
    public void setTimetableSession(String timetableSession) {
        this.timetableSession = timetableSession;
    }
    
    public Integer getTimeAllowed() {
        return timeAllowed;
    }
    
    public void setTimeAllowed(Integer timeAllowed) {
        this.timeAllowed = timeAllowed;
    }
    
    @Override
    public String toString() {
        return "ExamComponent [examComponentId: " + String.valueOf(examComponentId) +
                ", examSeries: " + examSeries.toString() +
                ", code: " + code +
                ", title: " + title +
                ", teacherMarks: " + teacherMarks +
                ", maximumMarks: " + String.valueOf(maximumMark) +
                ", gradeset: " + gradeset +
                ", dueDate: " + dateToString(dueDate) +
                ", timetabled: " + timetabled +
                ", timetableDate: " + dateToString(timetableDate) +
                ", timetableSession: " + timetableSession +
                ", timeAllowed: " + String.valueOf(timeAllowed);
    }
    
    private String dateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (date != null)
            dateFormat.format(date);
    }
}
