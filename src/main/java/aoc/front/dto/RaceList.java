package aoc.front.dto;


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

    public static RaceList from(Race race){
        RaceList rl = new RaceList();
        rl.setName(race.getName());
        rl.setLength(race.getLength());
        rl.setNbLaps(race.getNbLaps());

        race.getStretches().forEach(s ->
                rl.getSections().add(RaceListSection.from(s))
        );
        return rl;
    }
}
