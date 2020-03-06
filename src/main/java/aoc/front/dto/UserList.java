package aoc.front.dto;

import aoc.dal.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserList {
    private Long id;
    private String username;

    public UserList(User user){
        this.id = user.getId();
        this.username = user.getUsername();
    }
}
