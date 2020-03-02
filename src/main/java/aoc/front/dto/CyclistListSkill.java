package aoc.front.dto;

import aoc.dal.models.Skill;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class CyclistListSkill {
    private String label;

    public CyclistListSkill(Skill skill){
        this.setLabel(skill.getLabel());
    }
}
