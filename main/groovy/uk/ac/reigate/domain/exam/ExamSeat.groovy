package uk.ac.reigate.domain.exam
import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.Room;
import uk.ac.reigate.domain.academic.Student

@Entity
@Table(name = "exam_seat", catalog = "CID", schema = "Exams")
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
@IdClass(ExamSeatPk.class)
class ExamSeat  implements Serializable {
    
    @Id
    @OneToOne
    @JoinColumn(name='exam_seating_plan_id')
    ExamSeatingPlan examSeatingPlan
    
    @Id
    @JoinColumn(name='row')
    Integer row
    
    @Id
    @JoinColumn(name='column')
    Integer col
    
    @OneToOne
    @JoinColumn(name = "student_id")
    Student student
    
    @OneToOne
    @JoinColumn(name = "exam_component_id")
    ExamComponent examComponent
    
    ExamSeat() {}
    
    ExamSeat(Student student, ExamComponent examComponent, ExamSeatingPlan examSeatingPlan, Integer row, Integer col){
        this.student = student;
        this.examComponent = examComponent;
        this.examSeatingPlan = examSeatingPlan;
        this.row = row;
        this.col = col;
    }
}

