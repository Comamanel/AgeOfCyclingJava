package aoc.front.dto;

import aoc.dal.models.Age;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CyclistListAge {
    private int years;
    private double days;

    public CyclistListAge(Age age){
        this.setDays(age.getDays());
        this.setYears(age.getYears());
    }
}
