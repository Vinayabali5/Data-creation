package uk.ac.reigate.domain.academic

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.NamedEntity
import uk.ac.reigate.domain.Staff
import uk.ac.reigate.domain.academic.Faculty
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "department_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Department extends NamedEntity {
    
    @OneToOne
    @JoinColumn(name='faculty_id')
    Faculty faculty
    
    /**
     * The hod is the Head Of Department
     */
    @OneToOne
    @JoinColumn(name='hod_id')
    Staff hod
    
    @OneToOne
    @JoinColumn(name='hod_2_id')
    Staff hod2
    
    @Column(name="academic")
    private Boolean academic;
    
    Department(){}
    
    Department(Integer id, String name, String description, Faculty faculty, Staff hod, Staff hod2, Boolean academic) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.faculty = faculty;
        this.hod = hod;
        this.hod2 = hod2;
        this.academic = academic
    }
    
    Department(String name, String description, Faculty faculty, Staff hod, Staff hod2, Boolean academic ) {
        this(null, name, description, faculty, hod, hod2, academic)
    }
    
    String toString() {
        return description
    }
}
