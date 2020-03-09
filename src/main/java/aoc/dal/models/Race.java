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
@Table(name = "race")
public class Race implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Float length;
    private Integer nbLaps;

    @JoinTable(name="race_inscriptions",
            joinColumns = @JoinColumn(name ="race_id"),
            inverseJoinColumns = @JoinColumn(name="cyclist_id"))
    @ManyToMany(targetEntity = Cyclist.class)
    private List<Cyclist> inscriptions;

    @OneToMany(targetEntity = Stretch.class, mappedBy = "race")
    private List<Stretch> sections;

    @OneToMany(targetEntity = RaceResult.class, mappedBy = "race")
    @Column(name="result_race")
    private Set<RaceResult> result;
}
