package aoc.dal.models;


import aoc.bll.services.skillservices.SkillService;
import aoc.bll.services.skillservices.SkillServiceImpl;
import aoc.front.dto.CyclistRegister;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public static Cyclist from(aoc.bll.models.Cyclist cyclist){
        Cyclist cdao = new Cyclist();
        cdao.setAge(Age.from(cyclist.getAge()));
        cdao.setCountry(cyclist.getCountry());
        cdao.setFirstName(cyclist.getFirstName());
        cdao.setLastName(cyclist.getLastName());
        cdao.setWeight(cyclist.getWeight());
        cdao.setHeight(cyclist.getHeight());
        cdao.setId(cyclist.getId());
        cdao.getSkillSetList().addAll(cyclist.getSkillSetList().stream().map(SkillSet::from).collect(Collectors.toList()));


        return cdao;
    }

    public static Cyclist from(CyclistRegister cyclistRegister) {
        Cyclist cdao = new Cyclist();
        cdao.setAge(Age.from(cyclistRegister.getAge()));
        cdao.setCountry(cyclistRegister.getCountry());
        cdao.setFirstName(cyclistRegister.getFirstName());
        cdao.setLastName(cyclistRegister.getLastName());
        cdao.setWeight(cyclistRegister.getWeight());
        cdao.setHeight(cyclistRegister.getHeight());
        User user = new User();
        user.setId(cyclistRegister.getUser());
        cdao.setUser(user);

        return cdao;
    }
}
