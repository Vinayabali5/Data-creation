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

import uk.ac.reigate.domain.BaseEntity

@Deprecated
@Entity
@Table(name="TILPTARGETS", catalog = "CID", schema = "ILP")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "TARGETID"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Target extends BaseEntity {
    
    @Column(name = "TARGET", columnDefinition = "nvarchar")
    String target
    
    @Column(name = "BYWHEN", columnDefinition = "nvarchar")
    String byWhen
    
    @OneToOne
    @JoinColumn(name = "INTERVIEWID")
    ILPInterview interview
    
    @Column(name = "SENDLETTER")
    Boolean sendLetter
    
    Target() {}
    
    Target(Integer id, String target, String byWhen, ILPInterview interview, Boolean sendLetter) {
        this.id = id;
        this.target = target;
        this.byWhen = byWhen;
        this.interview = interview;
        this.sendLetter = sendLetter;
    }
    
    Target(String target, String byWhen, ILPInterview interview, Boolean sendLetter){
        this(null, target, byWhen, interview, sendLetter)
    }
    
    String toString(){
        return target;
    }
}
