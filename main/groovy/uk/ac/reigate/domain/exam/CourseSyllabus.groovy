package uk.ac.reigate.domain.exam

import java.io.Serializable

import javax.persistence.Column;
import javax.persistence.Entity
import javax.persistence.Id;
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import uk.ac.reigate.domain.academic.Course

@Entity
@Table(name = "course_syllabus", catalog = "CID", schema = "Exams")
@IdClass(CourseSyllabusPk.class)
class CourseSyllabus implements Serializable {
    
    @Id
    @Column(name = "course_id")
    Integer courseId;
    
    @Id
    @Column(name = "syllabus_id")
    Integer syllabusId;
    
    @ManyToOne
    @JoinColumn(name = "course_id", insertable = false, updatable = false, referencedColumnName = "course_id")
    Course course
    
    @Id
    @ManyToOne
    @JoinColumn(name = "syllabus_id", insertable = false, updatable = false, referencedColumnName = "syllabus_id")
    Syllabus syllabus
    
    public CourseSyllabus() {}
    
    public CourseSyllabus(Course course, Syllabus syllabus) {
        this.course = course;
        this.courseId = course.id;
        this.syllabus = syllabus;
        this.syllabusId = syllabus.syllabusId;
    }
}
