package aoc.dal.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "race_year_result")
public class RaceResultDAO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = RaceDAO.class)
    private RaceDAO race;

    @JoinTable(name="race_result_cyclist",
            joinColumns = @JoinColumn(name ="race_result_id"),
            inverseJoinColumns = @JoinColumn(name="cyclist_id"))
    @ManyToMany(targetEntity = CyclistDAO.class)
    private Set<CyclistDAO> cyclists;

    private int year;
}
