package aoc.dal.models;


import aoc.bll.models.Skill;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class SkillDAO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @NotNull
    private String label;


    protected static SkillDAO from(Skill skill, SkillDAO skillDAO){
        skillDAO.setId(skill.getId());
        skillDAO.setLabel(skill.getLabel());
        return skillDAO;
    }
}
