package aoc.front.dto;

import aoc.bll.models.SkillSet;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CyclistListSkillSet {
    private CyclistListSkill skill;
    private Integer value;

    public static CyclistListSkillSet from(SkillSet skillSet){
        CyclistListSkillSet clss = new CyclistListSkillSet();
        clss.setSkill(CyclistListSkill.from(skillSet.getSkill()));
        clss.setValue(skillSet.getValue());
        return clss;
    }
}
