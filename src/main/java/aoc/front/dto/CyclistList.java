package aoc.front.dto;

import aoc.dal.models.Cyclist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CyclistList {
    private Long id;
    private String firstName;
    private String lastName;
    private String country;
    private Double weight;
    private Double height;

    private CyclistListAge age;

    private List<CyclistListSkillSet> skillSetList;

    public static CyclistList from(Cyclist cyclist){
        CyclistList cyclistList = new CyclistList();
        cyclistList.setId(cyclist.getId());
        cyclistList.setFirstName(cyclist.getFirstName());
        cyclistList.setLastName(cyclist.getLastName());
        cyclistList.setCountry(cyclist.getCountry());
        cyclistList.setWeight(cyclist.getWeight());
        cyclistList.setHeight(cyclist.getHeight());
        cyclistList.setAge(CyclistListAge.from(cyclist.getAge()));
        cyclistList.skillSetList = new ArrayList<>();


        if(cyclist.getSkillSetList() != null){
            cyclist.getSkillSetList()
                    .forEach(s -> cyclistList.getSkillSetList().add(CyclistListSkillSet.from(s)));
        }

        return cyclistList;
    }
}
