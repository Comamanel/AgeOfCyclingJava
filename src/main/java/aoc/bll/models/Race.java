package aoc.bll.models;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Race {
    private Integer id;
    private String name;
    private Float length;
    private Integer nbLaps;

    private List<Stretch> stretches;

    public Race(){
        this.stretches = new ArrayList<>();
    }

    public static Race from(aoc.dal.models.Race r){
        Race race = new Race();
        race.setId(r.getId());
        race.setLength(r.getLength());
        race.setName(r.getName());
        race.setNbLaps(r.getNbLaps());

        r.getSections().forEach(s -> race.getStretches().add(Stretch.from(s)));

        return race;
    }
}
