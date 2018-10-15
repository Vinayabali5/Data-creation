package uk.ac.reigate.domain.exam

import groovy.transform.EqualsAndHashCode

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Embeddable
import javax.persistence.Entity
import javax.persistence.Transient
import javax.persistence.Table

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import uk.ac.reigate.domain.CodedEntityNoIdentity
import uk.ac.reigate.domain.NamedEntity
import uk.ac.reigate.domain.NamedEntityNoIdentity
//import uk.ac.reigate.domain.NamedEntity

@Entity
@Table(name = "exam_board", catalog = "CID", schema = "Exams")
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "exam_board_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
@Embeddable
class ExamBoard extends NamedEntityNoIdentity{
    
    /**
     * The text representation of the Boards internally used code
     */
    @Column(name = "board_code")
    String boardCode
    
    /**
     * The text representation of the provdier's centre number for the exam board
     */
    @Column(name = "board_centre_number")
    String boardCentreNumber
    
    /**
     * The text representation of the Boards externally used identifier
     */
    @Column(name = "board_identifier")
    String boardIdentifier
    
    /**
     * The text representation of the Boards contact telephone number
     */
    @Column(name = "telephone_no")
    String telephoneNo
    
    // #TODO add address
    
    public static class Builder {
        private Integer id;
        private String name;
        private String description;
        private String boardCode;
        private String boardCentreNumber;
        private String boardIdentifier;
        private String telephoneNo;
        public Builder() {}
        public Builder id(Integer id) {this.id = id; return this;}
        public Builder name(String name) {this.name = name; return this;}
        public Builder description(String description) {this.description = description; return this;}
        public Builder boardCode(String boardCode) {this.boardCode = boardCode; return this;}
        public Builder boardCentreNumber(String boardCentreNumber) {this.boardCentreNumber= boardCentreNumber; return this;}
        public Builder boardIdentifier(String boardIdentifier) {this.boardIdentifier = boardIdentifier; return this;}
        public Builder telephoneNo(String telephoneNo) {this.telephoneNo = telephoneNo; return this;}
        public ExamBoard build() {return new ExamBoard(this);}
    }
    
    ExamBoard(){}
    
    ExamBoard(Integer id, String name, String description, String boardCode, String boardCentreNumber, String boardIdentifier, String telephoneNo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.boardCode = boardCode;
        this.boardCentreNumber = boardCentreNumber;
        this.boardIdentifier = boardIdentifier;
        this.telephoneNo = telephoneNo;
    }
    
    ExamBoard(String name, String description, String boardCode, String boardCentreNumber, String boardIdentifier, String telephoneNo) {
        this(null, name, description, boardCode, boardCentreNumber, boardIdentifier, telephoneNo);
    }
    
    private ExamBoard(Builder builder) {
        if (builder.id != null) this.id = builder.id;
        if (builder.name != null) this.name = builder.name;
        if (builder.description != null) this.description = builder.description;
        if (builder.boardCode != null) this.boardCode = builder.boardCode;
        if (builder.boardCentreNumber != null) this.boardCentreNumber = builder.boardCentreNumber;
        if (builder.boardIdentifier != null) this.boardIdentifier = builder.boardIdentifier;
        if (builder.telephoneNo != null) this.telephoneNo = builder.telephoneNo;
    }
    
    @Transient
    public Integer getExamBoardId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "ExamBoard [examBoardId: " + String.valueOf(id) +
                ", name: " + name +
                ", description: " + description +
                ", boardCode: " + boardCode +
                ", boardCentreNumber: " + boardCentreNumber +
                ", boardIdentifier: " + boardIdentifier +
                ", telephoneNo: " +telephoneNo +
                "]";
    }
}
