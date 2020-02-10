package aoc.front.dto;

import aoc.business.models.Cyclist;
import aoc.dal.models.Age;
import aoc.dal.models.Skillset;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CyclistList {
    private String firstName;
    private String lastName;
    private String country;
    private Double weight;
    private Double height;

    private CyclistListAge age;

    private List<Skillset> skillsetList;

    public static CyclistList from(Cyclist cyclist){
        CyclistList cyclistList = new CyclistList();
        cyclistList.setFirstName(cyclist.getFirstName());
        cyclistList.setLastName(cyclist.getLastName());
        cyclistList.setCountry(cyclist.getCountry());
        cyclistList.setWeight(cyclist.getWeight());
        cyclistList.setHeight(cyclist.getHeight());
        cyclistList.setAge(CyclistListAge.from(cyclist.getAge()));

        //TODO: faire le set SkillSetList, même si c'chiant
    }
}
