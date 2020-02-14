package aoc.bll.models;

import aoc.dal.models.RoadSkillDAO;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RoadSkill extends Skill {
    public static RoadSkill from(RoadSkillDAO roadSkillDAO) {
        return (RoadSkill) from(roadSkillDAO, new RoadSkill());
    }
}
