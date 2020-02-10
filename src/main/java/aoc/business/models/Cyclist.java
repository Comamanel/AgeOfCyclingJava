package aoc.business.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
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

    private Set<Skill> skillset;
    //endregion

}
