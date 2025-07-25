package olamide.hawanat.librarymanagementsystem.Data.Repositories;

import olamide.hawanat.librarymanagementsystem.Data.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
}
