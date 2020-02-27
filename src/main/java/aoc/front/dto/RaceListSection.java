package aoc.front.dto;


import aoc.dal.models.Stretch;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RaceListSection {
    private RaceListSurface surface;
    private int difficulty;
    private double length;
    private double slope;

    public RaceListSection(Stretch stretch){
        this.setSurface(new RaceListSurface(stretch.getSurface()));
        this.setDifficulty(stretch.getDifficulty());
        this.setLength(stretch.getLength());
        this.setSlope(stretch.getSlope());
    }
}
