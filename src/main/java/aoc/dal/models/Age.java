package aoc.dal.models;

import aoc.front.dto.CyclistListAge;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Age implements Serializable {
    @Column(name = "age_years")
    @Min(15)
    @Max(150)
    private int years;
    @Min(0)
    @Max(12)
    @Column(name = "age_month")
    private int month;
    @Min(0)
    @Max(31)
    @Column(name = "age_days")
    private int days;


    public static Age from(aoc.bll.models.Age age){
        Age adao = new Age();
        adao.setDays(age.getDays());
        adao.setMonth(age.getMonth());
        adao.setYears(age.getYears());

        return adao;
    }

    public static Age from(CyclistListAge age) {
        Age adao = new Age();
        adao.setDays(age.getDays());
        adao.setMonth(age.getMonth());
        adao.setYears(age.getYears());

        return adao;
    }
}
