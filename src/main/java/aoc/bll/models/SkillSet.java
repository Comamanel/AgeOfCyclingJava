package aoc.bll.models;

import aoc.dal.models.CrossSkill;
import aoc.dal.models.RoadSkill;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SkillSet {
//    private Cyclist cyclist;
    private Skill skill;
    private Double value;

    public static SkillSet from(aoc.dal.models.SkillSet skillSet){
        SkillSet ss = new SkillSet();
//        ss.setCyclist(Cyclist.from(skillSetDAO.getCyclist()));
        ss.setValue(skillSet.getValue());

        if(skillSet.getSkill() instanceof RoadSkill)
            ss.setSkill(aoc.bll.models.RoadSkill.from((RoadSkill) skillSet.getSkill()));
        else
            ss.setSkill(aoc.bll.models.CrossSkill.from((CrossSkill) skillSet.getSkill()));

        return ss;
    }
}
