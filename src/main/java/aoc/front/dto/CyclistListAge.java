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
    private int month;
    private int days;

    public CyclistListAge(Age age){
        this.setDays(age.getDays());
        this.setMonth(age.getMonth());
        this.setYears(age.getYears());
    }
}
