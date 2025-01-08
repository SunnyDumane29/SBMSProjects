package in.sunnyit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import in.sunnyit.entity.Book;

@RepositoryRestResource (path ="book")
public interface  BookRepository extends JpaRepository<Book, Integer>{

}
