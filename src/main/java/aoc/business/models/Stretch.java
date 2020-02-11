package aoc.business.models;

import aoc.dal.models.StretchDAO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Stretch {
    private Long id;
    private Surface surface;
    private int difficulty;

    public static Stretch from(StretchDAO stretchDAO){
        Stretch stretch = new Stretch();

        stretch.setId(stretchDAO.getId());
        stretch.setDifficulty(stretchDAO.getDifficulty());
        stretch.setSurface(Surface.from(stretchDAO.getSurface()));

        return stretch;
    }
}
