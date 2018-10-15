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
import uk.ac.reigate.domain.exam.ExamBoard

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "student_entry_qualification_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
//@IdClass(StudentEntryQualificationPk.class)
class StudentEntryQualification extends BaseEntity implements Serializable {
    
    @OneToOne
    @JoinColumn(name = "student_id")
    Student student
    
    @OneToOne
    @JoinColumn(name = "entry_qualification_id")
    EntryQualification qualification
    
    @Column(name="date")
    Date date
    
    @Column(name="grade")
    String grade
    
    @Column(name="checked")
    Boolean checked
    
    @OneToOne
    @JoinColumn(name = "exam_board_id")
    ExamBoard examBoard
    
    StudentEntryQualification() {}
    
    StudentEntryQualification(Integer id, Student student, EntryQualification qualification, Date date, String grade, boolean checked, ExamBoard examBoard){
        this.id = id;
        this.student = student;
        this.qualification = qualification;
        this.date = date;
        this.grade = grade;
        this.checked = checked;
        this.examBoard = examBoard;
    }
    
    StudentEntryQualification(Student student, EntryQualification qualification, Date date, String grade, boolean checked, ExamBoard examBoard){
        this(null, student, qualification, date, grade, checked, examBoard)
    }
    
    String toString() {
        return student
    }
}

