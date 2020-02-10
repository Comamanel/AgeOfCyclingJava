package aoc.dal.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Check;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = { "id", "surface", "difficulty" })
@ToString
public class Stretch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stretch_id")
    private Long id;

    @ManyToOne(targetEntity = Surface.class)
    private Surface surface;
    @Min(1)
    @Max(3)
    private int difficulty;

    @ManyToOne(targetEntity = Race.class)
    private Race race;
}
