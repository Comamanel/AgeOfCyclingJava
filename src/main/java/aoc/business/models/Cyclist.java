package aoc.business.models;

import lombok.Data;

import java.util.Set;

@Data
public class Cyclist {
    //region attributes
    private String firstName;
    private String lastName;
    private Age age;
    private String country;
    private Double weight;

    private Set<Skill> skillset;
    //endregion

}
