package aoc.dal.models;

import aoc.bll.models.Skill;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "road_skill")
public class RoadSkillDAO extends SkillDAO {

    public static RoadSkillDAO from(Skill skill){
        RoadSkillDAO roadSkillDAO = new RoadSkillDAO();
        return (RoadSkillDAO)from(skill, roadSkillDAO);
    }
}
