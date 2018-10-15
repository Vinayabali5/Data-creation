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
import uk.ac.reigate.domain.academic.Student

@Entity
@Table(name = "student_option_entry", catalog = "CID", schema = "Exams")
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
@IdClass(StudentOptionEntryPk.class)
class StudentOptionEntry  implements Serializable {
    
    @Id
    @OneToOne
    @JoinColumn(name = "student_id")
    Student student
    
    @Id
    @OneToOne
    @JoinColumn(name = "exam_option_id")
    ExamOption examOption
    
    @OneToOne
    @JoinColumn(name='status_type_id')
    StatusType statusType
    
    @OneToOne
    @JoinColumn(name='edi_status_type_id')
    EdiStatusType ediStatusType
    
    @Column(name='resit')
    Boolean resit
    
    @Column(name='private_student')
    Boolean privateStudent
    
    StudentOptionEntry() {}
    
    StudentOptionEntry(Student student, ExamOption examOption, StatusType statusType, EdiStatusType ediStatusType, Boolean resit, Boolean privateStudent){
        this.student = student;
        this.examOption = examOption;
        this.statusType = statusType;
        this.ediStatusType = ediStatusType;
        this.resit = resit;
        this.privateStudent = privateStudent;
    }
    //
    //    OptionEntry(Student student, Option option, Integer status, Integer ediStatus, Boolean resit, Boolean privateStudent){
    //        this(null, student, option, status, ediStatus, resit, privateStudent)
    //    }
    //
    String toString() {
        return student
    }
}

