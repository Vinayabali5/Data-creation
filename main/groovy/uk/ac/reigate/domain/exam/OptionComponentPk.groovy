package uk.ac.reigate.domain.exam


class OptionComponentPk implements Serializable {
    Integer examOptionId;
    Integer examComponentId;
    
    public OptionComponentPk() {}
    
    public OptionComponentPk(Integer examOptionId, Integer examComponentId) {
        this.examOptionId = examOptionId;
        this.examComponentId = examComponentId;
    }
    
    public int hashCode() {
        return (int)(examOptionId + examComponentId);
    }
    
    public boolean equals(Object object) {
        if (object instanceof OptionComponentPk) {
            OptionComponentPk optionComponentPk = (OptionComponentPk) object;
            return (optionComponentPk.examOptionId == this.examOptionId) && (optionComponentPk.examComponentId == this.examComponentId);
        }
        return false;
    }
}
