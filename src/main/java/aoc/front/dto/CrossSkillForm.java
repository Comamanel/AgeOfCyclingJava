package aoc.front.dto;

import aoc.bll.models.CrossSkill;

public class CrossSkillForm extends SkillList {
    public static CrossSkillForm from(CrossSkill skill) {
        CrossSkillForm csf = new CrossSkillForm();
        csf.setLabel(skill.getLabel());
        return csf;
    }
}
