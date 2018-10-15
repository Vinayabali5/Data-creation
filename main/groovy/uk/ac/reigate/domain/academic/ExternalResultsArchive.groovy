package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.BaseEntity

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "external_result_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class ExternalResultsArchive extends BaseEntity implements Serializable {
    
    
    @OneToOne
    @JoinColumn(name = "student_id")
    Student student
    
    @Column(name="course_spec")
    String courseSpec
    
    @Column(name="level_description")
    String levelDescription
    
    @Column(name="subject_description")
    String subjectDescription
    
    @Column(name="syllabus")
    String syllabus
    
    @Column(name="grade")
    String grade
    
    @Column(name="mark")
    String mark
    
    @Column(name="max_mark")
    String maxMark
    
    @Column(name="date_achieved")
    Date dateAchieved
    
    @Column(name="series")
    String series
    
    @Column(name="year")
    String year
    
    @Column(name="exam_type")
    String examType
    
    ExternalResultsArchive() {}
    
    ExternalResultsArchive(Integer id, Student student, String courseSpec, String levelDescription, String subjectDescription, String syllabus, String grade, String mark, String maxMark, Date dateAchieved, String series, String year, String examType){
        this.id = id;
        this.student = student;
        this.courseSpec = courseSpec;
        this.levelDescription = levelDescription;
        this.subjectDescription = subjectDescription;
        this.syllabus = syllabus;
        this.grade = grade;
        this.mark = mark;
        this.maxMark = maxMark;
        this.dateAchieved = dateAchieved;
        this.series = series;
        this.year = year;
        this.examType = examType;
    }
    
    ExternalResultsArchive(Student student, String courseSpec, String levelDescription, String subjectDescription, String syllabus, String grade, String mark, String maxMark, Date dateAchieved, String series, String year, String examType){
        this(null, student,  courseSpec, levelDescription, subjectDescription, syllabus, grade,  mark, maxMark, dateAchieved, series, year, examType)
    }
    
    String toString() {
        return student
    }
}

