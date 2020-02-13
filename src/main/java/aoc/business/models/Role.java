package aoc.business.models;

import aoc.dal.models.UserDAO;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class Role {
    private Long id;
    private String label;
}
