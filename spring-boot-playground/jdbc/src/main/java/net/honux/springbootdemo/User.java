package net.honux.springbootdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Embedded.Nullable;

public class User {

    @Id
    private Long id;
    private String email;
    private List<Game> Games = new ArrayList<>();

    public User(String email) {
        this.email = email;
    }

    public void addGame(String title) {
        Games.add(new Game(title));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Game> getGames() {
        return Games;
    }

    public void setGames(List<Game> games) {
        Games = games;
    }

    public void clearGames() {
        Games.clear();
    }
}
