package aoc.dal.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = { "id", "surface", "difficulty", "race" })
@ToString
@Table(name = "stretch")
public class StretchDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stretch_id")
    private Long id;

    @JoinColumn(name="surface_id")
    @ManyToOne(targetEntity = SurfaceDAO.class)
    private SurfaceDAO surface;

    @Min(1)
    @Max(3)
    private int difficulty;

    @Min(-50)
    @Max(50)
    @Column(precision = 1)
    private double slope;

    @Min(0)
    @Column(precision = 2)
    private double length;

    @JoinColumn(name="race_id")
    @ManyToOne(targetEntity = RaceDAO.class)
    private RaceDAO race;
}
