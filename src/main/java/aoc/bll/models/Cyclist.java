package aoc.bll.models;


import aoc.dal.models.CyclistDAO;
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

    public Cyclist(){
        skillSetList = new ArrayList<>();
    }

    private List<SkillSet> skillSetList;
    //endregion

    public static Cyclist from(CyclistDAO cyclistDAO){
        Cyclist c = new Cyclist();

        c.setFirstName(cyclistDAO.getFirstName());
        c.setLastName(cyclistDAO.getLastName());
        c.setCountry(cyclistDAO.getCountry());
        c.setWeight(cyclistDAO.getWeight());
        c.setHeight(cyclistDAO.getHeight());
        c.setAge(Age.from(cyclistDAO.getAge()));

        if(cyclistDAO.getSkillSetList() != null){
            cyclistDAO.getSkillSetList().stream()
                    .forEach(s -> c.getSkillSetList().add(SkillSet.from(s)));
        }
        return c;
    }
}
