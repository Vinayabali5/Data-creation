package uk.ac.reigate.domain.exam

import java.io.Serializable

import javax.persistence.CascadeType;
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne
import javax.persistence.OneToOne;
import javax.persistence.Table;;;

@Entity
@Table(name = "course_component", catalog = "CID", schema = "Exams")
@IdClass(CourseComponentPk.class)
class CourseComponent implements Serializable {
    
    @Id
    @Column(name = "course_id")
    Integer courseId
    
    @Id
    @Column(name = "exam_option_id")
    Integer examOptionId
    
    @Id
    @Column(name = "exam_component_id")
    Integer examComponentId
    
    @ManyToOne(fetch=FetchType.EAGER, cascade=[CascadeType.MERGE])
    @JoinColumns([
        @JoinColumn(name = "course_id", insertable = false, updatable = false, referencedColumnName = "course_id"),
        @JoinColumn(name = "exam_option_id", insertable = false, updatable = false, referencedColumnName = "exam_option_id")
    ])
    CourseOption courseOption;
    
    @OneToOne
    @JoinColumn(name = "exam_component_id", updatable = false, insertable = false, referencedColumnName = "exam_component_id")
    ExamComponent examComponent;
    
    public CourseComponent() {}
    
    public CourseComponent(CourseOption courseOption, ExamComponent examComponent) {
        this.courseOption = courseOption;
        this.courseId = courseOption.course.id;
        this.examOptionId = courseOption.examOption.examOptionId;
        this.examComponent = examComponent;
        this.examComponentId = examComponent.examComponentId;
    }
}
