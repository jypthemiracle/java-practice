package net.honux.springbootdemo;

import java.util.HashSet;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Embedded.Nullable;

public class User {

    @Id
    private Long id;
    private String email;
    private Set<Game> Games = new HashSet<>();

    public User(String email) {
        this.email = email;
    }

    public void addGame(Game game) {
        Games.add(game);
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

    public Set<Game> getGames() {
        return Games;
    }

    public void setGames(Set<Game> games) {
        Games = games;
    }

    public void clearGames() {
        Games.clear();
    }
}
