package uk.ac.reigate.domain.exam

import java.io.Serializable

import javax.persistence.CascadeType;
import javax.persistence.Column
import javax.persistence.EmbeddedId;
import javax.persistence.Entity
import javax.persistence.Id;
import javax.persistence.IdClass
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne
import javax.persistence.OneToOne;
import javax.persistence.Table
import javax.validation.constraints.NotNull

import com.fasterxml.jackson.annotation.JsonIgnore;

import uk.ac.reigate.domain.academic.Course;;

@Entity
@Table(name = "course_option", catalog = "CID", schema = "Exams")
@IdClass(CourseOptionPk.class)
class CourseOption implements Serializable {
    
    @Id
    @NotNull
    @ManyToOne(cascade=[CascadeType.MERGE])
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    //	@JsonIgnore
    Course course
    
    @Id
    @NotNull
    @OneToOne(cascade=[CascadeType.MERGE])
    @JoinColumn(name = "exam_option_id", updatable = false, insertable = false, referencedColumnName = "exam_option_id")
    //	@JsonIgnore
    ExamOption examOption
    
    public CourseOption() {}
    
    public CourseOption(Course course, ExamOption examOption) {
        this.course = course;
        this.examOption = examOption;
    }
}
