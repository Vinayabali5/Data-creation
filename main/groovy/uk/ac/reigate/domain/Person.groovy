package uk.ac.reigate.domain

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Inheritance
import javax.persistence.InheritanceType
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.validation.constraints.NotNull

import com.fasterxml.jackson.annotation.JsonIgnore

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

import uk.ac.reigate.domain.academic.Student
import uk.ac.reigate.domain.lookup.Gender
import uk.ac.reigate.domain.lookup.Title
import uk.ac.reigate.domain.security.Role

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "person_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includes = ['firstName', 'surname', 'middleNames', 'preferredName', 'previousSurname', 'dob'])
class Person extends BaseEntity implements UserDetails {
    
    @OneToOne
    @JoinColumn(name='title_id')
    Title title
    
    @Column(name="first_name")
    String firstName
    
    @Column(name="preferred_name")
    String preferredName
    
    @Column(name="middle_names")
    String middleNames
    
    @Column(name="surname")
    @NotNull
    String surname
    
    @Column(name="legal_surname")
    String legalSurname
    
    @Column(name="previous_surname")
    String previousSurname
    
    @Column(name="dob")
    Date dob
    
    @OneToOne
    @JoinColumn(name='gender_id')
    Gender gender
    
    @OneToOne(cascade=[CascadeType.PERSIST, CascadeType.MERGE])
    @JoinColumn(name='address_id')
    Address address
    
    @Column(name="home")
    String home
    
    @Column(name="mobile")
    String mobile
    
    @Column(name="work")
    String work
    
    @Column(name="email")
    String email
    
    @Column(name="username", columnDefinition = "nvarchar")
    String username
    
    @Column(name="password", columnDefinition = "nvarchar")
    String password
    
    @Column(name="enabled")
    Boolean enabled
    
    @OneToMany(mappedBy="person", cascade=[CascadeType.PERSIST, CascadeType.MERGE], fetch=FetchType.LAZY)
    Set<Contact> contacts
    
    @OneToMany(mappedBy='person', cascade=[CascadeType.PERSIST, CascadeType.MERGE], fetch=FetchType.EAGER)
    Set<Note> notes
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name='person_role',
    joinColumns=@JoinColumn(name="person_id", referencedColumnName="person_id"),
    inverseJoinColumns=@JoinColumn(name="role_id", referencedColumnName="role_id")
    )
    Set<Role> roles
    
    @JsonIgnore
    @OneToOne(mappedBy="person", fetch=FetchType.LAZY)
    Staff staff
    
    @JsonIgnore
    @OneToOne(mappedBy="person", fetch=FetchType.LAZY)
    Student student
    
    /**
     * No Args Constructor    
     */
    Person() {}
    
    Person(Integer id, Title title, String firstName, String preferredName, String surname, String legalSurname, String middleNames, String previousSurname, Date dob, Gender gender, Address address, String home, String mobile, String work, String email, Boolean enabled, Set<Role> roles, String username){
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.legalSurname = legalSurname;
        this.preferredName = preferredName;
        this.middleNames = middleNames;
        this.previousSurname = previousSurname;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.email = email;
        this.enabled = enabled;
        this.roles = roles;
        this.username = username;
    }
    
    Person(Title title, String firstName, String preferredName, String surname, String legalSurname, String middleNames, String previousSurname, Date dob, Gender gender, Address address, String home, String mobile, String work, String email, Boolean enabled, Set<Role> roles, String username){
        this(null, title, firstName, preferredName, surname, legalSurname, middleNames, previousSurname, dob, gender, address, home, mobile, work, email, enabled, roles, username)
    }
    
    String toString() {
        return this.surname + ', ' + this.firstName + (this.middleNames != null ? ' ' + this.middleNames : '')
    }
    
    
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.collect { role ->
            new SimpleGrantedAuthority(role.roleName)
        };
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return !enabled;
    }
    
    @Override
    public boolean isAccountNonLocked() {
        return !enabled;
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        return !enabled;
    }
    
    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
