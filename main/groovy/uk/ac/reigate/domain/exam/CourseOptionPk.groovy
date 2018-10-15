package uk.ac.reigate.domain.exam

import java.io.Serializable

import javax.persistence.Embeddable

import groovy.transform.Canonical
import uk.ac.reigate.domain.academic.Course;;;;

@Embeddable
@Canonical
class CourseOptionPk implements Serializable {
    
    Integer course;
    Integer examOption;
    
    public CourseOptionPk() {}
    
    public CourseOptionPk(Integer courseId, Integer examOptionId) {
        this.course = courseId;
        this.examOption = examOptionId;
    }
    
    public CourseOptionPk(Course course, ExamOption examOption) {
        this.course = course.id;
        this.examOption = examOption.examOptionId;
    }
    
    //	public int hashCode() {
    //		return (int)(course + option);
    //	}
    //
    //	public boolean equals(Object object) {
    //		if (Object instanceof CourseOptionPk) {
    //			CourseOptionPk courseOptionPk = (CourseOptionPk) object;
    //			return (courseOptionPk.course == this.course) && (courseOptionPk.option == this.option);
    //		}
    //		return false;
    //	}
}
