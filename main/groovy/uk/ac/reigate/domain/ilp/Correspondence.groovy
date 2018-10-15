package uk.ac.reigate.domain.ilp

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity;
import uk.ac.reigate.domain.academic.CourseGroup
import uk.ac.reigate.domain.academic.Student

@Entity
@Table(name="TILPCORRESPONDENCE", catalog = "CID", schema = "ILP")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "CORRESPONDENCEID"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Correspondence extends BaseEntity {
    
    
    
    @OneToOne
    @JoinColumn(name="ADMISSIONNUMBER")
    Student student
    
    @OneToOne
    @JoinColumn(name="COURSEID")
    CourseGroup course
    
    @Column(name = "Correspondence", columnDefinition="nvarchar")
    String correspondence
    
    @Column(name = "MESSAGETITLE", columnDefinition="nvarchar")
    String title
    
    @Column(name = "CORRESPONDENCEDATE")
    Date date
    
    @Column(name = "CORRESPONDENCEFROM", columnDefinition="nvarchar")
    String from
    
    @Column(name = "CORRESPONDENCETO", columnDefinition="nvarchar")
    String to
    
    @OneToOne
    @JoinColumn(name = "LetterID")
    Letter letter
    
    @Column(name = "STAFFADVISED")
    Date staffAdvised
    
    @OneToOne
    @JoinColumn(name = "CORRESPONDENCETYPEID")
    CorrespondenceType type
    
    @Column(name = "PRODUCEDBY", columnDefinition="nchar")
    String producedBy
    
    @Column(name = "Private")
    Boolean privateEntry
    
    @Column(name = "PROCESSSTAGE", columnDefinition="tinyint")
    Integer processStage
    
    @Column(name = "ATTACHMENTSSENT", columnDefinition="nvarchar")
    String attachmentsSent
    
    Correspondence(){}
    
    Correspondence(Integer id, Student student, CourseGroup course, String correspondence, String title, Date date, String from, String to, Letter letter, Date staffAdvised, CorrespondenceType type, String producedBy, Boolean privateEntry, Integer processStage, String attachmentsSent){
        this.id = id;
        this.student = student;
        this.course = course;
        this.correspondence = correspondence;
        this.title = title;
        this.date = date;
        this.from = from;
        this.to = to;
        this.letter = letter;
        this.staffAdvised = staffAdvised;
        this.type = type;
        this.producedBy = producedBy;
        this.privateEntry = privateEntry;
        this.processStage = processStage;
        this.attachmentsSent = attachmentsSent;
    }
    
    Correspondence(Student student, CourseGroup course, String correspondence, String title, Date date, String from, String to, Letter letter, Date staffAdvised, CorrespondenceType type, String producedBy, Boolean privateEntry, Integer processStage, String attachmentsSent){
        this(null, student, course, correspondence, title, date, from, to, letter, staffAdvised, type, producedBy, privateEntry, processStage,  attachmentsSent)
    }
    
    String toString(){
        return student.id;
    }
}
