package aoc.dal.models;

import java.io.Serializable;

public class CompositionId implements Serializable {

    private Integer skill;
    private Long cyclist;

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public Long getCyclist() {
        return cyclist;
    }

    public void setCyclist(Long cyclist) {
        this.cyclist = cyclist;
    }
}
