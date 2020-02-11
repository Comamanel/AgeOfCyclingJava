package aoc.business.models;

import aoc.dal.models.CrossSkillDAO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CrossSkill extends Skill {
    public static CrossSkill from(CrossSkillDAO crossSkillDAO){
        return (CrossSkill)from(crossSkillDAO, new CrossSkill());
    }
}
