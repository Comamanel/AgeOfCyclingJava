package aoc.dal.models;

import aoc.front.dto.CyclistListAge;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Age implements Serializable {
    @Column(name = "age_years")
    @Min(15)
    @Max(150)
    private int years;
    @Min(0)
    @Max(365)
    @Column(name = "age_days")
    private double days;


    public Age(CyclistListAge age) {
        this.setDays(age.getDays());
        this.setYears(age.getYears());
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }
}
