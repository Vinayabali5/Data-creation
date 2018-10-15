package uk.ac.reigate.domain.security

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import uk.ac.reigate.domain.BaseEntity
import uk.ac.reigate.domain.Person

import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "role_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
class Role extends BaseEntity {
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
    name='person_role',
    joinColumns=@JoinColumn(name="role_id", referencedColumnName="role_id"),
    inverseJoinColumns=@JoinColumn(name="person_id", referencedColumnName="person_id")
    )
    @JsonIgnore
    Set<Person> users
    
    @Column(name='role_name')
    String roleName
    
    /**
     * No Args constructor, required for Spring Data JPA
     */
    Role() {}
    
    Role(Integer id, String roleName){
        this.id = id;
        this.roleName = roleName;
    }
    /**
     * Constructor to create a new role with the roleName.
     * 
     * @param roleName the name of the new role.
     */
    Role(String roleName) {
        this(null, roleName)
    }
    
    String toString() {
        return roleName
    }
}
