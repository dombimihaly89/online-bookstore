package hu.dombimihaly.onlinebookstore.respository;

import hu.dombimihaly.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

}
