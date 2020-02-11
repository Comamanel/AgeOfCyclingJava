package aoc.dal.models;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

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
public class SkillSetDAO implements Serializable {

    @JoinColumn(name = "cyclist_id")
    @Id
    @ManyToOne(targetEntity = CyclistDAO.class)
//    @JsonIgnore
    private CyclistDAO cyclist;
    @JoinColumn(name = "skill_id")
    @Id
    @ManyToOne(targetEntity = SkillDAO.class)
    private SkillDAO skill;

    private Integer value;
}
