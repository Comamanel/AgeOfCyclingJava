package aoc.dal.models;

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
public class RoadSkill extends Skill {

    public static RoadSkill from(aoc.bll.models.Skill skill){
        RoadSkill roadSkill = new RoadSkill();
        return (RoadSkill)from(skill, roadSkill);
    }
}
