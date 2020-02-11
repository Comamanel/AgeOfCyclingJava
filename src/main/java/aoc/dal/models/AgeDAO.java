package aoc.dal.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class AgeDAO {
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

}
