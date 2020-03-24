package com.jypthemiracle.jdbcpractice;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends CrudRepository<Movie, Long> {
  @Query("SELECT * FROM MOVIE m where m.title = :title")
  Movie findByMovieID(@Param("title") String title);
}
