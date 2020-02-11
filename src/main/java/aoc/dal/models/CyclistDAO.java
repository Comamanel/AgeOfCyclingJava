package aoc.dal.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(of = { "firstName", "lastName", "country", "weight", "height", "age" })
@EqualsAndHashCode(of = { "id", "firstName", "lastName", "country", "weight", "height", "age" })
@Table(name = "cyclist")
public class CyclistDAO implements Serializable {
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
    private AgeDAO age;

    @OneToMany(targetEntity = SkillSetDAO.class, mappedBy = "cyclist")
    private List<SkillSetDAO> skillSetList;
}
