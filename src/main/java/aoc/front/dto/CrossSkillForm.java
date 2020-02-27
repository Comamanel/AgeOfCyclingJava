package aoc.front.dto;

import aoc.dal.models.CrossSkill;

public class CrossSkillForm extends SkillList {
    public CrossSkillForm(CrossSkill skill) {
        this.setLabel(skill.getLabel());
    }
}
