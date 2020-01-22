package aoc.business.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Float length;
    private Integer nbLaps;

    @ManyToMany(targetEntity = Section.class)
    private List<Section> sections;
}
