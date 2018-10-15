package uk.ac.reigate.domain.exam

import java.io.Serializable;

class CourseSyllabusPk implements Serializable {
    Integer courseId;
    Integer syllabusId;
    
    public CourseSyllabusPk() {}
    
    public CourseSyllabusPk(Integer courseId, Integer syllabusId) {
        this.courseId = courseId;
        this.syllabusId = syllabusId;
    }
    
    public int hashCode() {
        return (int)(courseId + syllabusId);
    }
    
    public boolean equals(Object object) {
        if (Object instanceof CourseSyllabusPk) {
            CourseSyllabusPk courseSyllabusPk = (CourseSyllabusPk) object;
            return (courseSyllabusPk.courseId == this.courseId) && (courseSyllabusPk.syllabusId == this.syllabusId);
        }
        return false;
    }
}
