package aoc.front.dto;


import aoc.dal.models.Race;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class RaceList {
    private String name;
    private Float length;
    private Integer nbLaps;

    private List<RaceListSection> sections;

    public RaceList() {
        this.sections = new ArrayList<>();
    }

    public RaceList(Race race){
        this();
        this.setName(race.getName());
        this.setLength(race.getLength());
        this.setNbLaps(race.getNbLaps());

        if(race.getSections() != null)
            race.getSections().forEach(s ->
                this.sections.add(new RaceListSection(s))
            );
    }
}
