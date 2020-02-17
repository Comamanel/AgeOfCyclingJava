package aoc.bll.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Cyclist {
    //region attributes
    private Long Id;
    private String firstName;
    private String lastName;
    private Age age;
    private String country;
    private Double weight;
    private Double height;
    private User user;

    public Cyclist() {
        skillSetList = new ArrayList<>();
    }

    private List<SkillSet> skillSetList;
    //endregion

    public static Cyclist from(aoc.dal.models.Cyclist cyclist) {
        Cyclist c = new Cyclist();

        c.setId(cyclist.getId());
        c.setFirstName(cyclist.getFirstName());
        c.setLastName(cyclist.getLastName());
        c.setCountry(cyclist.getCountry());
        c.setWeight(cyclist.getWeight());
        c.setHeight(cyclist.getHeight());
        c.setAge(Age.from(cyclist.getAge()));
        if (cyclist.getUser() != null) {
            c.setUser(User.from(cyclist.getUser()));
        }
        cyclist.getSkillSetList().forEach(s -> c.getSkillSetList().add(SkillSet.from(s)));

        return c;
    }
}
