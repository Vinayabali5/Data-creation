package uk.ac.reigate.domain.exam

import java.io.Serializable;

import javax.persistence.Embeddable

import groovy.transform.Canonical
import uk.ac.reigate.domain.academic.Course;;;;

//@Embeddable
@Canonical
class CourseComponentPk implements Serializable { //extends CourseOptionPk {
    
    Integer courseId;
    Integer examOptionId;
    
    //	CourseOptionPk courseOption;
    
    Integer examComponentId;
    
    public CourseComponentPk() {}
    
    public CourseComponentPk(Integer courseId, Integer examOptionId, Integer examComponentId) {
        super();
        this.courseId = courseId;
        this.examOptionId = examOptionId;
        this.examComponentId = examComponentId;
    }
    
    public CourseComponentPk(CourseOption courseOption, Integer examComponentId) {
        super();
        //        this.courseOption.course = courseOptionPk.courseId;
        //        this.courseOption.option = courseOptionPk.optionId;
        this.courseId = courseOption.course.id
        this.examOptionId = courseOption.examOption.examOptionId
        this.examComponentId = examComponentId;
    }
    
    public CourseComponentPk(Course course, ExamOption examOption, ExamComponent examComponent) {
        super();
        //		this.courseOption.course = course.id;
        //		this.courseOption.option = option.optionId;
        this.courseId = course.id;
        this.examOptionId = examOption.examOptionId;
        this.examComponentId = examComponent.examComponentId;
        
    }
}
