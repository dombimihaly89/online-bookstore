package hu.dombimihaly.onlinebookstore.respository;

import hu.dombimihaly.onlinebookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategories", path = "book-categories")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
