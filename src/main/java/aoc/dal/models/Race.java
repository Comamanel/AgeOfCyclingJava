package aoc.dal.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString(of = { "name", "length" })
@EqualsAndHashCode(of = { "id", "name", "length", "nbLaps" })
@NoArgsConstructor
public class Race implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Float length;
    private Integer nbLaps;

    @OneToMany(targetEntity = Stretch.class, mappedBy = "race")
    private List<Stretch> sections;

    @OneToMany(targetEntity = RaceResult.class, mappedBy = "race")
    @Column(name="result_race")
    private Set<RaceResult> result;
}
