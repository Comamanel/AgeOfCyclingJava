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
public class RaceResult implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = Race.class)
    private Race race;

    @JoinTable(name="race_result_cyclist",
            joinColumns = @JoinColumn(name ="race_result_id"),
            inverseJoinColumns = @JoinColumn(name="cyclist_id"))
    @ManyToMany(targetEntity = Cyclist.class)
    private Set<Cyclist> cyclists;

    @ManyToOne(targetEntity = CustomDate.class)
    private CustomDate date;
}
