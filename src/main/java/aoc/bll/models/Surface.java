package aoc.bll.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Surface {
    private Long id;
    private String label;

    public static Surface from(aoc.dal.models.Surface surfaceDAO){
        Surface surface = new Surface();

        surface.setId(surfaceDAO.getId());
        surface.setLabel((surfaceDAO.getLabel()));

        return surface;
    }
}
