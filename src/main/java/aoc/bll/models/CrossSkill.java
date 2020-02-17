package aoc.bll.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CrossSkill extends Skill {
    public static CrossSkill from(aoc.dal.models.CrossSkill crossSkill){
        return (CrossSkill)from(crossSkill, new CrossSkill());
    }
}
