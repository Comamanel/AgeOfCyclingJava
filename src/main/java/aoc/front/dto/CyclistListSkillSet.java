package aoc.front.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CyclistListSkillSet {
    private CyclistListSkill skill;
    private Double value;

    public static CyclistListSkillSet from(SkillSet skillSet){
        CyclistListSkillSet clss = new CyclistListSkillSet();
        clss.setSkill(CyclistListSkill.from(skillSet.getSkill()));
        clss.setValue(skillSet.getValue());
        return clss;
    }
}
