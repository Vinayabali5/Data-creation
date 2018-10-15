package uk.ac.reigate.domain.exam

import java.io.Serializable;

import java.util.logging.Logger

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table;;


@Entity
@Table(name = "option_component", catalog = "CID", schema = "Exams")
@IdClass(OptionComponentPk.class)
class OptionComponent implements Serializable {
    private final static Logger log = Logger.getLogger(OptionComponent.class.getName())
    
    @Id
    @Column(name = "exam_option_id")
    Integer examOptionId
    
    @Id
    @Column(name = "exam_component_id")
    Integer examComponentId
    
    
    @ManyToOne
    //@PrimaryKeyJoinColumn(name = "option_id", referencedColumnName = "option_id")
    @JoinColumn(name = "exam_option_id", updatable = false, insertable = false, referencedColumnName = "exam_option_id")
    ExamOption examOption
    
    @ManyToOne
    //@PrimaryKeyJoinColumn(name = "component_id", referencedColumnName = "component_id")
    @JoinColumn(name = "exam_component_id", updatable = false, insertable = false, referencedColumnName = "exam_component_id")
    ExamComponent examComponent
    
    public OptionComponent() {
        log.info("****** OptionComponent()");
    }
    
    public OptionComponent(ExamOption examOption, ExamComponent examComponent) {
        this.examOption = examOption;
        this.examOptionId = examOption.examOptionId;
        this.examComponent = examComponent;
        this.examComponentId = examComponent.examComponentId;
    }
    
    public OptionComponent(Integer examOptionId, Integer examComponentId) {
        this.examOptionId = examOptionId;
        this.examOption.examOptionId = examOptionId;
        this.examComponentId = examComponentId;
        this.examComponent.examComponentId = examComponentId;
    }
}
