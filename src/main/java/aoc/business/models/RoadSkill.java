package aoc.business.models;

import aoc.dal.models.RoadSkillDAO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RoadSkill extends Skill {
    public static RoadSkill from(RoadSkillDAO roadSkillDAO) {
        return (RoadSkill) from(roadSkillDAO, new RoadSkill());
    }
}
