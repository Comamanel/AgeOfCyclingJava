package aoc.dal.models;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Skill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;
}
