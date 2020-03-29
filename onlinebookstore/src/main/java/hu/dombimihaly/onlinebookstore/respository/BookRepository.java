package hu.dombimihaly.onlinebookstore.respository;

import hu.dombimihaly.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
