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

@Entity
@Table(name="TILPCORRESPONDENCETYPE", catalog = "CID", schema = "ILP")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "CORRESPONDENCETYPEID"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class CorrespondenceType extends BaseEntity {
    
    
    @Column(name = "CORRESPONDENCETYPE", columnDefinition = "nvarchar")
    String type
    
    CorrespondenceType() {}
    
    CorrespondenceType(Integer id, String type){
        this.id = id;
        this.type = type;
    }
    
    CorrespondenceType(String type){
        this(null, type)
    }
    
    String toString(){
        return type;
    }
}
