package olamide.hawanat.librarymanagementsystem.Data.Repositories;

import olamide.hawanat.librarymanagementsystem.Data.Models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends MongoRepository<Admin,String> {
}
