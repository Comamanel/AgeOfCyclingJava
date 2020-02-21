package aoc.front.dto;

public class CrossSkillForm extends SkillList {
    public static CrossSkillForm from(CrossSkill skill) {
        CrossSkillForm csf = new CrossSkillForm();
        csf.setLabel(skill.getLabel());
        return csf;
    }
}
