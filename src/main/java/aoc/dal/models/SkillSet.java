package aoc.dal.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "skill_set")
public class SkillSet implements Serializable {

    @JoinColumn(name = "cyclist_id")
    @Id
    @ManyToOne(targetEntity = Cyclist.class)
//    @JsonIgnore
    private Cyclist cyclist;
    @JoinColumn(name = "skill_id")
    @Id
    @ManyToOne(targetEntity = Skill.class)
    private Skill skill;

    private Double value;

}
