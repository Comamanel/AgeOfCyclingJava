package aoc.front.dto;


import aoc.business.models.Race;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RaceList {
    private String name;
    private Float length;
    private Integer nbLaps;

    private List<RaceListSection> sections;

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
