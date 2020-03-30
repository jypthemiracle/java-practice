package net.honux.springbootdemo;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class User {

    @Id
    private Long id;
    private String email;
    //NULL이 있으면 인식을 못해서 오류가 난다.
    private Github github; //One To One

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", email='" + email + '\'' +
            ", github=" + github +
            '}';
    }

    public void setGithub(Github github) {
        this.github = github;
    }

    public String getEmail() {
        return email;
    }

    public Github getGithub() {
        return github;
    }

    public Long getId() {
        return id;
    }

    public User(String email, Github github) {
        this.email = email;
        this.github = github;
    }


}
