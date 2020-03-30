package net.honux.springbootdemo;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    //이 쿼리를 정상 동작하게 만드려면 어떻게 해야 할까?
    //* 는 쓰지 말고 필요한 필드가 다 있으면 일일이 쓰도록 하자.
    //as를 통해 테이블을 지정한다.
    //그러니까 USER u LEFT OUTER JOIN GITHUB g - Github 없는 사용자도 가져오기 위해서
    //g 필드도 일일이 지정을 해줘야 한다
    //나의 의도와 상관없이 N+1개의 쿼리가 나타난다. 우리가 직접 짤 것이 아니면 무시하도록 하자.
    @Query("SELECT u.id, u.email, g.id as github_id, g.github_id as github_github_id from"
        + " USER u LEFT OUTER JOIN GITHUB g"
    + " WHERE email = :email")
    //@Query("Select * from user where email = :email")
    Optional<User> findUserByEmail(String email);
}
