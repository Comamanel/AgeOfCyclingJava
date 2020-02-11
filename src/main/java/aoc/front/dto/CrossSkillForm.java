package aoc.front.dto;

import aoc.business.models.CrossSkill;

public class CrossSkillForm extends SkillList {
    public static CrossSkillForm from(CrossSkill skill) {
        CrossSkillForm csf = new CrossSkillForm();
        csf.setLabel(skill.getLabel());
        return csf;
    }
}
