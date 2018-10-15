package uk.ac.reigate.domain.academic

import groovy.transform.EqualsAndHashCode;

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull
import javax.xml.bind.annotation.XmlRootElement

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.lookup.SchoolPriority
import uk.ac.reigate.domain.lookup.SchoolType

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "school_id"))
])
@XmlRootElement(name="school")
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class School extends BaseEntity implements Serializable {
    
    /**
     * The name of the school
     */
    @Column(name="name")
    @NotNull
    String name
    
    /**
     * The type of school
     */
    @NotNull
    @OneToOne
    @JoinColumn(name='school_type_id')
    SchoolType type
    
    /**
     * The schools unique reference number
     */
    @Column(name="urn")
    String urn
    
    /**
     * The admissions priority of the school
     */
    @NotNull
    @OneToOne
    @JoinColumn(name='school_priority_id')
    SchoolPriority priority
    
    /**
     * The Address of the school
     */
    @Column(name="line1")
    String line1
    
    @Column(name="line2")
    String line2
    
    @Column(name="line3")
    String line3
    
    @Column(name="postcode")
    String postcode
    
    @Column(name= "telephone")
    String telephone
    
    @Column(name= "head_title")
    String headTitle
    
    @Column(name = "head_first_name")
    String headFirstName
    
    @Column(name = "head_surname")
    String headSurname
    
    @Column(name = "contact_title")
    String contactTitle
    
    @Column(name = "contact_first_name")
    String contactFirstName
    
    @Column(name = "contact_surname")
    String contactSurname
    
    
    School(){}
    
    School(Integer id, String name, SchoolType type, SchoolPriority priority, String urn, String line1, String line2, String line3, String postcode, String telephone, String headTitle, String headFirstName, String headSurname, String contactTitle, String contactFirstName, String contactSurname){
        this.id = id;
        this.name = name;
        this.type = type;
        this.priority = priority;
        this.urn = urn;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.postcode = postcode;
        this.telephone =  telephone;
        this.headTitle = headTitle;
        this.headFirstName = headFirstName;
        this.headSurname = headSurname;
        this.contactTitle = contactTitle;
        this.contactFirstName = contactFirstName;
        this.contactSurname = contactSurname;
    }
    
    School(String name, SchoolType type, SchoolPriority priority, String urn, String line1, String line2, String line3, String postcode,String telephone, String headTitle, String headFirstName, String headSurname, String contactTitle, String contactFirstName, String contactSurname){
        this(null, name, type, priority, urn, line1, line2, line3, postcode, telephone, headTitle, headFirstName, headSurname, contactTitle, contactFirstName, contactSurname);
    }
    /**
     * toString method that returns the "name (type)" of the School
     */
    String toString() {
        return name + ' (' + type + ')'
    }
}
