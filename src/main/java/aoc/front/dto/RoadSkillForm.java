package aoc.front.dto;

public class RoadSkillForm extends SkillList {
    public static RoadSkillForm from(RoadSkill skill){
        RoadSkillForm rsf = new RoadSkillForm();
        rsf.setLabel(skill.getLabel());
        return rsf;
    }
}
