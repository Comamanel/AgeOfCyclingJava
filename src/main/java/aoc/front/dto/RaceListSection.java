package aoc.front.dto;


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

    public static RaceListSection from(Stretch stretch){
        RaceListSection rls = new RaceListSection();
        rls.setSurface(RaceListSurface.from(stretch.getSurface()));
        rls.setDifficulty(stretch.getDifficulty());
        rls.setLength(stretch.getLength());
        rls.setSlope(stretch.getSlope());
        return rls;
    }
}
