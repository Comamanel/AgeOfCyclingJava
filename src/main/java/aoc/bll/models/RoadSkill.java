package aoc.bll.models;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RoadSkill extends Skill {
    public static RoadSkill from(aoc.dal.models.RoadSkill roadSkill) {
        return (RoadSkill) from(roadSkill, new RoadSkill());
    }
}
