package aoc.front.dto;

import aoc.dal.models.RoadSkill;

public class RoadSkillForm extends SkillList {
    public RoadSkillForm(RoadSkill skill){
        this.setLabel(skill.getLabel());
    }
}
