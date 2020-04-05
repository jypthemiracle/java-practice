package net.honux.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private UserRepository userRepo;

	private Logger logger = LoggerFactory.getLogger(SpringBootDemoApplicationTests.class);

	@Test
	void contextLoads() {
		assertThat(ctx).isNotNull();
		logger.debug("ApplicationContext is not null");
	}

	@Test
	void LoggerNotNull() {
		assertThat(logger).isNotNull();
		logger.debug("Logger OK");
	}

	@Test
	void userRepo_FindById() {
		User user = userRepo.findById(1L).get();
		assertThat(user).isNotNull();
		logger.debug("Find user with Id 1: {}", user);
	}

//	@Test
//	void newUser() {
//		User user = new User("hophfg@yahoo.co.kr", null);
//		userRepo.save(user);
//		assertThat(user.getId()).isNotNull();
//		logger.debug("Find user with Id 1: {}", user);
//		user.setGithub(new Github("jypthemiracle"));
//		userRepo.save(user); //github이 아니라 user만 저장하고 있음
//		//2020-03-30 16:14:42.310 DEBUG 13352 --- [    Test worker] o.s.jdbc.core.JdbcTemplate               : Executing prepared SQL statement [DELETE FROM github WHERE github.user = ?]
//		//DELETE 관계니까 일단 지우고 본다.
//		//2020-03-30 16:14:42.335 DEBUG 13352 --- [    Test worker] o.s.jdbc.core.JdbcTemplate               : Executing prepared SQL statement [SELECT user.id AS id, user.email AS email, github.id AS github_id, github.github_id AS github_github_id FROM user LEFT OUTER JOIN github AS github ON github.user = user.id WHERE user.id = ?]
//		//findById만 했을 뿐인데. user.id AS id라고 하는데 user.id를 id라고 넣는다.
//		//github.github_id AS github_github_id 깃헙 객체에 들어가는 깃헙 아이디
//		//FROM user LEFT OUTER JOIN: 과목이랑 교수랑 매핑할 때. 교수 JOIN 과목 하면 가르치는 과목 없는 교수는 출력되지 않는다. (교집합이니까 ^^)
//		//만약 교수가 가르치는 과목이 없어도 출력하고 싶다고 하자. LEFT OUTER JOIN : 교수는 과목이 없어도 무조건 출력한다. (A LEFT OUTER JOIN B는 A의 여집합도 출력한다)
//
//		User fUser = userRepo.findById(user.getId()).get();
//		assertThat(fUser.getGithub()).isNotNull();
//		logger.debug("after save {}", fUser.getGithub());
//	}

	@Test
	void addGame() {
		User user = userRepo.findById(1L).get();
		user.addGame(new Game("FF7"));
		user.addGame(new Game("DQ5"));
		userRepo.save(user);
		assertThat(userRepo.countGameforUser(user.getId())).isEqualTo(2);
		user.getGames().forEach(game ->
			logger.debug("After save user and game: {}", game));
	}

	@Test
	void userRepo_FindByEmail() {
		String email = "honux@gmail.com";
		User user = userRepo.findUserByEmail(email).get();
		assertThat(user).isNotNull();
		logger.debug("Find user by Email {}: {}", email, user);
		user.addGame(new Game("FF7"));
		user.addGame(new Game("DQ5"));
		userRepo.save(user);

		user = userRepo.findUserByEmail(email).get();
		assertThat(userRepo.countGameforUser(user.getId())).isEqualTo(2);
		user.getGames().forEach(game ->
			logger.debug("After save user and game: {}", game));

	}


	@AfterEach
	void tearItDown() {
		String email = "honux@gmail.com";
		User user = userRepo.findUserByEmail(email).get(); // 매 테스트 지날 때마다 호출이 되서 게임을 지운다.
		user.clearGames();
		userRepo.save(user);
	}

//	@Test
//	void userRepo_FindByEmail() {
//		String email = "honux@gmail.com"; //data.sql
//		User user = userRepo.findUserByEmail(email).get();
//		assertThat(user).isNotNull();
//		logger.debug("Find user by Email {}: {}", email, user);
//		user.setGithub(new Github("SigridRabbe"));
//		userRepo.save(user);
//		user = userRepo.findUserByEmail(email).get();
//		logger.debug("find by user email {}: {} ", email, user);
//	}
}
