package aoc.front.dto;

import aoc.dal.models.Skill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillList {
    private String label;

    public SkillList(Skill skill){
        this.setLabel(skill.getLabel());
    }
}
