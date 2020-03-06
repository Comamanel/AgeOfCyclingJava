package aoc.front.dto;

import aoc.dal.models.SkillSet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class CyclistListSkillSet {
    private CyclistListSkill skill;
    @DecimalMax("99.99")
    @DecimalMin("0.00")
    private Double value;

    public CyclistListSkillSet(SkillSet skillSet){
        this.setSkill(new CyclistListSkill(skillSet.getSkill()));
        this.setValue(skillSet.getValue());
    }
}
