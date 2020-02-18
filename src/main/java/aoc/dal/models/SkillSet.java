package aoc.dal.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "skill_set")
public class SkillSet implements Serializable {

    @JoinColumn(name = "cyclist_id")
    @Id
    @ManyToOne(targetEntity = Cyclist.class)
//    @JsonIgnore
    private Cyclist cyclist;
    @JoinColumn(name = "skill_id")
    @Id
    @ManyToOne(targetEntity = Skill.class)
    private Skill skill;

    private Double value;

    public static SkillSet from(aoc.bll.models.SkillSet skillSet){
        SkillSet ssdao = new SkillSet();
        aoc.bll.models.Skill s = skillSet.getSkill();
        if(s instanceof aoc.bll.models.CrossSkill){
            ssdao.setSkill(CrossSkill.from(skillSet.getSkill()));
        }
        else{
            ssdao.setSkill(RoadSkill.from(skillSet.getSkill()));
        }

        ssdao.setValue(skillSet.getValue());

        return ssdao;
    }
}
