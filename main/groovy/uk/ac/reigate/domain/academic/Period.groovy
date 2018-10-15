package uk.ac.reigate.domain.academic

import java.sql.Time

import javax.persistence.AttributeOverride
import javax.persistence.AttributeOverrides
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

import groovy.transform.EqualsAndHashCode;
import uk.ac.reigate.domain.CodedEntity
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate


@Entity
@AttributeOverrides([
    @AttributeOverride(name = "id", column = @Column(name = "period_id"))
])
@DynamicInsert(true)
@DynamicUpdate(true)
@EqualsAndHashCode(includeFields=true)
class Period extends CodedEntity{
    
    @OneToOne
    @JoinColumn(name='block_id')
    Block block
    
    @Column(name="start_time")
    Date startTime
    
    @Column(name="end_time")
    Date endTime
    
    @Column(name="day")
    Integer day
    
    @Column(name="day_period")
    Integer dayPeriod
    
    @Column(name="box_no")
    Integer boxNo
    
    @Column(name="cristal_period")
    Integer cristalPeriod
    
    @Column(name="length", insertable=false, updatable=false)
    Integer length
    
    @Column(name="default_period_text")
    String defaultPeriodText
    
    /**
     * Default No Args constructor
     */
    Period(){}
    
    /**
     * 
     * @param id
     * @param code
     * @param description
     * @param block
     * @param startTime
     * @param endTime
     * @param day
     * @param dayPeriod
     */
    Period(Integer id, String code, String description, Block block, Date startTime, Date endTime, Integer day, Integer dayPeriod, Integer boxNo, Integer cristalPeriod) {
        this.id = id;
        this.code = code;
        this.description = description;
        this.block = block;
        this.startTime = startTime;
        this.endTime = endTime;
        this.day = day;
        this.dayPeriod = dayPeriod;
        this.boxNo = boxNo;
        this.cristalPeriod = cristalPeriod;
    }
    
    Period(String code, String description, Block block, Date startTime, Date endTime, Integer day, Integer dayPeriod, Integer boxNo, Integer cristalPeriod) {
        this(null, code, description, block, startTime, endTime, day, dayPeriod, boxNo, cristalPeriod)
    }
    
    String toString() {
        return description
    }
}
