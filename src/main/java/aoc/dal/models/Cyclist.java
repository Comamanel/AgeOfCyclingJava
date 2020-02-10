package aoc.dal.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(of = { "firstName", "lastName", "country", "weight", "height", "age" })
@EqualsAndHashCode(of = { "id", "firstName", "lastName", "country", "weight", "height", "age" })
public class Cyclist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cyclist_id")
    private Long id;

    private String firstName;
    private String lastName;
    private String country;
    private Double weight;
    private Double height;


    @Embedded
    private Age age;

    @OneToMany(targetEntity = Skillset.class, mappedBy = "cyclist")
    private List<Skillset> skillsetList;
}
