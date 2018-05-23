package crown.springframework.springwebapp.repositories;

import crown.springframework.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
