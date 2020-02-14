package aoc.bll.models;

import aoc.dal.models.CrossSkillDAO;
import aoc.dal.models.RoadSkillDAO;
import aoc.dal.models.SkillSetDAO;
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
    private Integer value;

    public static SkillSet from(SkillSetDAO skillSetDAO){
        SkillSet ss = new SkillSet();
//        ss.setCyclist(Cyclist.from(skillSetDAO.getCyclist()));
        ss.setValue(skillSetDAO.getValue());

        if(skillSetDAO.getSkill() instanceof RoadSkillDAO)
            ss.setSkill(RoadSkill.from((RoadSkillDAO)skillSetDAO.getSkill()));
        else
            ss.setSkill(CrossSkill.from((CrossSkillDAO)skillSetDAO.getSkill()));

        return ss;
    }
}
