package aoc.front.dto;

import lombok.*;

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

    private String user;

    private CyclistListAge age;

    private List<CyclistListSkillSet> skillSetList;


}
