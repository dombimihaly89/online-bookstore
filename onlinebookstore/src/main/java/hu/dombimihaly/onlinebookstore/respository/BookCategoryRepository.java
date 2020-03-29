package hu.dombimihaly.onlinebookstore.respository;

import hu.dombimihaly.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
