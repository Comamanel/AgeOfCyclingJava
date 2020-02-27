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
public class CyclistForm {
    private String firstName;
    private String lastName;
    private String country;
    private Double weight;
    private Double height;

    private Long user;

    private CyclistListAge age;

    private List<CyclistListSkillSet> skillSetList;


}
