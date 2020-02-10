package aoc.dal.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(of="name", callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class CrossSkill extends Skill {
    @Column(name="cross_skill_name")
    private CrossSkillName name;
}
