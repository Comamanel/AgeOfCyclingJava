package aoc.front.dto;

import aoc.bll.models.Skill;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CyclistListSkill {
    private String label;

    public static CyclistListSkill from(Skill skill){
        CyclistListSkill cls = new CyclistListSkill();
        cls.setLabel(skill.getLabel());
        return cls;
    }
}
