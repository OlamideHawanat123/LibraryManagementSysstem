package olamide.hawanat.librarymanagementsystem.Data.Repositories;

import olamide.hawanat.librarymanagementsystem.Data.Models.Author;
import olamide.hawanat.librarymanagementsystem.Data.Models.Books;
import olamide.hawanat.librarymanagementsystem.Data.Models.Category;
import olamide.hawanat.librarymanagementsystem.Data.Models.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepo extends MongoRepository<Books,String> {
    List<Books> findByAuthor(Author author);
    List<Books> findByCategory(Category category);
    List<Books> findByTitle(String title);
    List<Books> findByPublisher(Publisher publisher);
}
