package aoc.front.dto;

import aoc.dal.models.SkillSet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CyclistListSkillSet {
    private CyclistListSkill skill;
    private Double value;

    public CyclistListSkillSet(SkillSet skillSet){
        this.setSkill(new CyclistListSkill(skillSet.getSkill()));
        this.setValue(skillSet.getValue());
    }
}
