package aoc.dal.models;

import lombok.*;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class Age {
    private int years;
    private int month;
    private int days;

}
