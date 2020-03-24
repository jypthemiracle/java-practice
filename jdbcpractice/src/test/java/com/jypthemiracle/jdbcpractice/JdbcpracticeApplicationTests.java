package com.jypthemiracle.jdbcpractice;

import static org.junit.Assert.assertNotNull;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JdbcpracticeApplicationTests {

	@Autowired
	private MovieRepository movieRepository;

	@Test
	void Movie가_저장된다() {
		List<Rental> rentals = new ArrayList<>();
		rentals.add(new Rental(Duration.ofDays(1), 2));
		rentals.add(new Rental(Duration.ofDays(7), 10));
		Movie movie = new Movie(null, "Matrix", "...", rentals);

		movieRepository.save(movie);
		Movie newMovie = movieRepository.findByMovieID("Matrix");
		newMovie.getRental().stream().forEach(m -> System.out.println(m.getPrice()));
	}
}