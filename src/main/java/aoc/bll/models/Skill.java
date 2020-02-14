package aoc.bll.models;

import aoc.dal.models.SkillDAO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Skill {
    private Integer id;
    private String label;


    protected static Skill from(SkillDAO skillDAO, Skill skill){
        skill.setId(skillDAO.getId());
        skill.setLabel(skillDAO.getLabel());
        return skill;
    }
}
