package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode;

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Transient

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.exam.ExamBoard
import uk.ac.reigate.domain.lookup.Level
import uk.ac.reigate.domain.lookup.Subject

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "course_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Course extends BaseEntity {
    
    /**
     * This is the Level of the Course being offer. For example AS Level, A Level, or BTEC L3 Certificate. 
     */
    @OneToOne
    @JoinColumn(name='level_id')
    Level level
    
    /**
     * This is the Subject description for the Course. 
     */
    @OneToOne
    @JoinColumn(name='subject_id')
    Subject subject
    
    /**
     * This is a field for guidance on the Guided Learning Hour
     */
    @Column(name = "glh")
    Integer glh
    
    /**
     * This is the ILR field Learning Delivery > Learning Aim Reference 
     */
    @Column(name = "learning_aim_reference")
    String learningAimReference
    
    /**
     * This is the Exam Board that offers this Course
     */
    @OneToOne
    @JoinColumn(name="exam_board_id")
    ExamBoard examBoard
    
    /**
     * This is the syllabus code or BTEC award code for this Course
     */
    @Column(name = "syllabus_code")
    String syllabusCode
    
    /**
     * This is the first year that this Course has been offered. 
     */
    @OneToOne
    @JoinColumn(name="valid_from_year_id")
    AcademicYear validFrom
    
    /**
     * This is the last year that this Course was offered. This will be null if the course is currently valid.
     */
    @OneToOne
    @JoinColumn(name="valid_to_year_id")
    AcademicYear validTo
    
    /**
     * This is the ILR field Learning Delivery > Delivery Location Postcode
     */
    @Column(name = "location_postcode")
    String locationPostcode
    
    /**
     * The Subject Sector Area that this Course belongs to.   
     */
    @Column(name = "subject_sector_area")
    String subjectSectorArea
    
    /**
     * This is a notes field to be used to provided details about the Course.
     */
    @Column(name = "notes")
    String notes
    
    /**
     * This field is to record the course summary information about a course
     */
    @Column(name = "course_summary")
    String courseSummary
    
    /**
     * This field is used to record the entry requirements of a specific course
     */
    @Column(name = "entry_requirements")
    String entryRequirements
    
    /**
     * This fields is used to record an external link for further information regard a specified course
     */
    @Column(name = "external_link")
    String externalLink
    
    /**
     * This fields is used to record if this course is to be published to various public facing systems
     */
    @Column(name = "published")
    Boolean published
    
    /**
     * This is the course specification code for the Course
     */
    @Column(name = "COURSESPEC", updatable = false, insertable = false, columnDefinition = "nvarchar")
    String spec
    
    /**
     * Default noArgs constructor
     */
    Course(){}
    
    @Deprecated
    Course(Integer id, Level level, Subject subject, Integer glh, String learningAimReference, ExamBoard examBoard, String syllabusCode, AcademicYear validFrom, AcademicYear validTo, String locationPostcode, String subjectSectorArea, String notes, String spec){
        this.id = id;
        this.level = level;
        this.subject = subject;
        this.glh = glh;
        this.learningAimReference = learningAimReference;
        this.examBoard = examBoard;
        this.syllabusCode = syllabusCode;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.locationPostcode = locationPostcode;
        this.subjectSectorArea = subjectSectorArea;
        this.notes = notes;
        this.spec = spec;
    }
    
    @Deprecated
    Course(Level level, Subject subject, Integer glh, String learningAimReference, ExamBoard examBoard, String syllabusCode, AcademicYear validFrom, AcademicYear validTo, String locationPostcode, String subjectSectorArea, String notes, String spec){
        this(null, level, subject, glh, learningAimReference, examBoard, syllabusCode, validFrom, validTo, locationPostcode, subjectSectorArea, notes, spec)
    }
    
    /**
     * The toString function for the Course object returns the Spec as specified by the getSpec method.
     */
    String toString() {
        return spec
    }
    
    /**
     * The getSpec method returns a string containing the subject code and the level code.
     * 
     * @return subject code + level code 
     */
    @Transient
    String getDescription() {
        return this.level.description + ' ' + this.subject.description
    }
}
