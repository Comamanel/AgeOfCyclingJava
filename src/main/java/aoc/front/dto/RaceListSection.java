package aoc.front.dto;


import aoc.business.models.Stretch;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RaceListSection {
    private RaceListSurface surface;
    private int difficulty;

    public static RaceListSection from(Stretch stretch){
        RaceListSection rls = new RaceListSection();
        rls.setSurface(RaceListSurface.from(stretch.getSurface()));
        rls.setDifficulty(stretch.getDifficulty());
        return rls;
    }
}
