package aoc.business.models;

import lombok.Data;

import java.util.Set;

@Data
public class RaceResult {
    private Race race;
    private Set<Cyclist> result;
}
