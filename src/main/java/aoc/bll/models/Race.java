package aoc.bll.models;


import aoc.dal.models.RaceDAO;
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

    public static Race from(RaceDAO raceDAO){
        Race race = new Race();
        race.setId(raceDAO.getId());
        race.setLength(raceDAO.getLength());
        race.setName(raceDAO.getName());
        race.setNbLaps(raceDAO.getNbLaps());

        raceDAO.getSections().forEach(s -> race.getStretches().add(Stretch.from(s)));

        return race;
    }
}
