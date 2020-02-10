package aoc.dal.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Skillset implements Serializable {
    @Id
    @ManyToOne(targetEntity = Cyclist.class)
    private Cyclist cyclist;
    @Id
    @ManyToOne(targetEntity = Skill.class)
    private Skill skill;

    private Integer value;
}
