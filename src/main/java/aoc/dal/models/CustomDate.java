package aoc.dal.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@ToString(of = { "years", "days" })
@EqualsAndHashCode(of = { "days", "years" })
@Table(name = "aoc_date")
@Entity
public class CustomDate implements Serializable {
    @Id
    private long date;

    private int years;
    private double days;
}
