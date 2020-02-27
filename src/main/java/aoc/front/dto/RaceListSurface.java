package aoc.front.dto;

import aoc.dal.models.Surface;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RaceListSurface {
    private String label;

    public RaceListSurface(Surface surface){
        this.setLabel(surface.getLabel());
    }
}
