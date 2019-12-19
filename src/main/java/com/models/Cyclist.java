package com.models;

public class Cyclist {
    //region attributes
    private String firstName;
    private String lastName;
    private Age age;
    private String country;
    private double weight;
    private double stamina;
    private double resistance;
    private double flat;
    private double mountain;
    private double hill;
    private double cobble;
    private double descent;
    private double sprint;
    private double punch;
    private double agility;
    //endregion

    //region getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getFlat() {
        return flat;
    }

    public void setFlat(double flat) {
        this.flat = flat;
    }

    public double getMountain() {
        return mountain;
    }

    public void setMountain(double mountain) {
        this.mountain = mountain;
    }

    public double getHill() {
        return hill;
    }

    public void setHill(double hill) {
        this.hill = hill;
    }

    public double getCobble() {
        return cobble;
    }

    public void setCobble(double cobble) {
        this.cobble = cobble;
    }

    public double getDescent() {
        return descent;
    }

    public void setDescent(double descent) {
        this.descent = descent;
    }

    public double getSprint() {
        return sprint;
    }

    public void setSprint(double sprint) {
        this.sprint = sprint;
    }

    public double getPunch() {
        return punch;
    }

    public void setPunch(double punch) {
        this.punch = punch;
    }

    public double getAgility() {
        return agility;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }
    //endregion


    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " - " + getAge().toString() + " ans";
    }
}
