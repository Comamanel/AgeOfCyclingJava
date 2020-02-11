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
public class RaceDAO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Float length;
    private Integer nbLaps;

    @OneToMany(targetEntity = StretchDAO.class, mappedBy = "race")
    private List<StretchDAO> sections;

    @OneToMany(targetEntity = RaceResultDAO.class, mappedBy = "race")
    @Column(name="result_race")
    private Set<RaceResultDAO> result;
}
