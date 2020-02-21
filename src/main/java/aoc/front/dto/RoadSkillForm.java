package aoc.front.dto;

import aoc.dal.models.RoadSkill;

public class RoadSkillForm extends SkillList {
    public static RoadSkillForm from(RoadSkill skill){
        RoadSkillForm rsf = new RoadSkillForm();
        rsf.setLabel(skill.getLabel());
        return rsf;
    }
}
