package aoc.business.models;


import aoc.dal.models.AgeDAO;
import lombok.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Getter
@Setter
@AllArgsConstructor
@ToString(of={ "years", "month", "days" })
public class Age {
    private int years;
    private int month;
    private int days;

    public Age() {
        years = 15;
        month = 0;
        days = 0;
    }

    public static Age from(AgeDAO ageDAO){
        Age age = new Age();
        age.setDays(ageDAO.getDays());
        age.setMonth(ageDAO.getMonth());
        age.setYears(ageDAO.getYears());
        return age;
    }
}
