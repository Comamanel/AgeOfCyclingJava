package aoc.business.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Age {
    private int years;
    private int month;
    private int days;

    public Age() {
        years = 0;
        month = 0;
        days = 0;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return getYears() + " ans, " + getMonth() + " mois et " + getDays();
    }
}
