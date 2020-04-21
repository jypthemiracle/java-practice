package com.datajdbc.manytomany;

import java.util.Set;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Long> {

  @Query("SELECT b.* from book b join book_author ba on b.id = ba.book where ba.author = :id")
  Set<Book> findByAuthorId(@Param("id") Long id);
}
