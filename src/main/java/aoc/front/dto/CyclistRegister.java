package aoc.front.dto;

import aoc.bll.models.Age;
import aoc.bll.models.Cyclist;
import aoc.bll.models.SkillSet;
import aoc.bll.models.User;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CyclistRegister {
    private String firstName;
    private String lastName;
    private String country;
    private Double weight;
    private Double height;

    private Long user;

    private CyclistListAge age;

    private List<CyclistListSkillSet> skillSetList;

    /*public static Cyclist from(CyclistRegister cyclistRegister){
        Cyclist cyclist = new Cyclist();
        cyclist.setFirstName(cyclistRegister.getFirstName());
        cyclist.setLastName(cyclistRegister.getLastName());
        cyclist.setCountry(cyclistRegister.getCountry());
        cyclist.setWeight(cyclistRegister.getWeight());
        cyclist.setHeight(cyclistRegister.getHeight());
        cyclist.setAge(Age.from(cyclistRegister.getAge()));
        cyclist.setSkillSetList(new ArrayList<>());

        cyclist.setUser(cyclistRegister.getUser());

//        if(cyclist.getSkillSetList() != null){
//            cyclist.getSkillSetList()
//                    .stream()
//                    .forEach(s -> cyclist.getSkillSetList().add(SkillSet.from(s)));
//        }

        return cyclist;
    }*/
}
