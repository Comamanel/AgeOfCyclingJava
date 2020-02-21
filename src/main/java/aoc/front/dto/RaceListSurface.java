package aoc.front.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RaceListSurface {
    private String label;

    public static RaceListSurface from(Surface surface){
        RaceListSurface rls = new RaceListSurface();
        rls.setLabel(surface.getLabel());
        return rls;
    }
}
