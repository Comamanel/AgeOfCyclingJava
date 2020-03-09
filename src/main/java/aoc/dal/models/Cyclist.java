package aoc.dal.models;


import aoc.front.dto.CyclistForm;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString(of = { "firstName", "lastName", "country", "weight", "height", "age" })
@EqualsAndHashCode(of = { "id", "firstName", "lastName", "country", "weight", "height", "age" })
@Table(name = "cyclist")
@AllArgsConstructor
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

    @OneToMany(targetEntity = SkillSet.class, mappedBy = "cyclist")
    private List<SkillSet> skillSetList;

    @JoinColumn(name="user_id")
    @ManyToOne(targetEntity = User.class)
    private User user;


    public Cyclist(){
        skillSetList = new ArrayList<>();
    }



    public Cyclist(CyclistForm cyclistRegister) {
        this.setAge(new Age(cyclistRegister.getAge()));
        this.setCountry(cyclistRegister.getCountry());
        this.setFirstName(cyclistRegister.getFirstName());
        this.setLastName(cyclistRegister.getLastName());
        this.setWeight(cyclistRegister.getWeight());
        this.setHeight(cyclistRegister.getHeight());
    }
    public Cyclist(CyclistForm cyclistRegister, User user) {
        this.setAge(new Age(cyclistRegister.getAge()));
        this.setCountry(cyclistRegister.getCountry());
        this.setFirstName(cyclistRegister.getFirstName());
        this.setLastName(cyclistRegister.getLastName());
        this.setWeight(cyclistRegister.getWeight());
        this.setHeight(cyclistRegister.getHeight());
        this.setUser(user);
    }
}
