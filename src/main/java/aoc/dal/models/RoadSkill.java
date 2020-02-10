package aoc.dal.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "name", callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class RoadSkill extends Skill{
    @Column(name="road_skill_name")
    private RoadSkillName name;
}
