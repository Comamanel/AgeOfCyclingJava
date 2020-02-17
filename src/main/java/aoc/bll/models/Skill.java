package aoc.bll.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Skill {
    private Integer id;
    private String label;


    protected static Skill from(aoc.dal.models.Skill skillDAO, Skill skill){
        skill.setId(skillDAO.getId());
        skill.setLabel(skillDAO.getLabel());
        return skill;
    }
}
