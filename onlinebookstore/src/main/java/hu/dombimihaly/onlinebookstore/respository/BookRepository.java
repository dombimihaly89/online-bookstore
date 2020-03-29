package hu.dombimihaly.onlinebookstore.respository;

import hu.dombimihaly.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface BookRepository extends JpaRepository<Book, Long> {

}
