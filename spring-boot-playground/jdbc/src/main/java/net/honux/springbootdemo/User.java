package net.honux.springbootdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.data.relational.core.mapping.Embedded.Nullable;

public class User {

    @Id
    private Long id;
    @Nullable
    private String email;

    public User(String email, Github github) {
        this.email = email;
        this.github = github;
    }

    //NULL이 있으면 인식을 못해서 오류가 난다.
    @Embedded.Nullable //두 개의 객체를 하나의 테이블로 합치는 어노테이션이다.
    private Github github; //One To One

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

    public Github getGithub() {
        return github;
    }

    public void setGithub(Github github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", email='" + email + '\'' +
            ", github=" + github +
            '}';
    }
}
