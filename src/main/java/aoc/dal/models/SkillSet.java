package aoc.dal.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "skill_set")
@IdClass(value = CompositionId.class)
public class SkillSet implements Serializable {

    @JoinColumn(name = "cyclist_id")
    @Id
    @ManyToOne(targetEntity = Cyclist.class)
//    @JsonIgnore
    private Cyclist cyclist;

    @Id
    @ManyToOne(targetEntity = Skill.class)
    private Skill skill;

    @DecimalMin("0.00")
    @DecimalMax("99.99")
    private Double value;

}
