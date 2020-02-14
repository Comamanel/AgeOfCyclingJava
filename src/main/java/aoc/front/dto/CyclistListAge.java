package aoc.front.dto;

import aoc.bll.models.Age;
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
    private int month;
    private int days;

    public static CyclistListAge from(Age age){
        CyclistListAge clAge = new CyclistListAge();
        clAge.setDays(age.getDays());
        clAge.setMonth(age.getMonth());
        clAge.setYears(age.getYears());
        return clAge;
    }
}
