package uk.ac.reigate.domain.ilp

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.academic.AcademicYear
import uk.ac.reigate.domain.academic.CourseGroup
import uk.ac.reigate.domain.academic.Student

@Entity
@Table(name = "ilp_interview", catalog = "CID", schema = "ILP")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "ilp_interview_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class ILPInterview extends BaseEntity {
    
    
    @OneToOne
    @JoinColumn(name = "student_id")
    Student student
    
    @OneToOne
    @JoinColumn(name = "ilp_interview_type_id")
    ILPInterviewType type
    
    @OneToOne
    @JoinColumn(name = "course_group_id")
    CourseGroup courseGroup
    
    @OneToOne
    @JoinColumn(name = "staff_id")
    Staff staff
    
    @Column(name = "discussion", columnDefinition = "nvarchar")
    String discussion
    
    @Column(name = "ilp_interview_date")
    Date interviewDate
    
    @Column(name = "ilp_interview_time")
    Date interviewTime
    
    @Column(name= "target", columnDefinition = "nvarchar")
    String target
    
    @Column(name =  "target_by_when",columnDefinition = "nvarchar")
    String targetByWhen
    
    @Column(name = "refer_lip")
    Boolean referLip
    
    @Column(name = "lip_referral_date")
    Date lipReferDate
    
    @Column(name = "private")
    Boolean privateEntry
    
    @Column(name = "office_action", columnDefinition = "nvarchar")
    String officeAction
    
    @Column(name = "office_notes", columnDefinition = "nvarchar")
    String officeNotes
    
    @Column(name = "to_file")
    Boolean toFile
    
    @Column(name = "letter_sent")
    Boolean letterSent
    
    @OneToOne(fetch=FetchType.EAGER, mappedBy = 'interview')
    Letter letter
    
    @OneToOne
    @JoinColumn(name="academic_year_id")
    AcademicYear year
    
    ILPInterview() {}
    
    ILPInterview(Integer id, Student student, ILPInterviewType type, CourseGroup courseGroup, Staff staff, String discussion, Date interviewDate, Date interviewTime, Boolean referLip, Date lipReferDate, Boolean privateEntry, String officeAction, String officeNotes, Boolean toFile, String target, String targetByWhen, AcademicYear academicYear) {
        this.id = id;
        this.student = student;
        this.type = type;
        this.courseGroup = courseGroup;
        this.staff = staff;
        this.discussion = discussion;
        this.interviewDate = interviewDate;
        this.interviewTime = interviewTime;
        this.referLip = referLip;
        this.lipReferDate = lipReferDate;
        this.privateEntry = privateEntry;
        this.officeAction = officeAction;
        this.officeNotes= officeNotes;
        this.toFile = toFile;
        this.target = target;
        this.targetByWhen = targetByWhen;
        this.year = academicYear;
    }
    
    ILPInterview(Student student, ILPInterviewType type, CourseGroup courseGroup, Staff staff, String discussion, Date interviewDate, Date interviewTime, Boolean referLip, Date lipReferDate, Boolean privateEntry, String officeAction, String officeNotes, Boolean toFile, String target, String targetByWhen, AcademicYear academicYear) {
        this(null, student,  type, courseGroup, staff, discussion, interviewDate,  interviewTime,  referLip,  lipReferDate,  privateEntry,  officeAction,  officeNotes,  toFile , target , targetByWhen, academicYear)
    }
    
    String toString(){
        return student.id;
    }
}