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

    public CyclistList(Cyclist cyclist){
        this.setId(cyclist.getId());
        this.setFirstName(cyclist.getFirstName());
        this.setLastName(cyclist.getLastName());
        this.setCountry(cyclist.getCountry());
        this.setWeight(cyclist.getWeight());
        this.setHeight(cyclist.getHeight());
        this.setAge(new CyclistListAge(cyclist.getAge()));
        this.skillSetList = new ArrayList<>();


        if(cyclist.getSkillSetList() != null){
            cyclist.getSkillSetList()
                    .forEach(s -> this.getSkillSetList().add(new CyclistListSkillSet(s)));
        }
    }
}
