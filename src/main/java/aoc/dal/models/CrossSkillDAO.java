package aoc.dal.models;

import aoc.business.models.Skill;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "cross_skill")
public class CrossSkillDAO extends SkillDAO {

    public static CrossSkillDAO from(Skill skill){
        CrossSkillDAO crossSkillDAO = new CrossSkillDAO();
        return (CrossSkillDAO)from(skill, crossSkillDAO);
    }
}
