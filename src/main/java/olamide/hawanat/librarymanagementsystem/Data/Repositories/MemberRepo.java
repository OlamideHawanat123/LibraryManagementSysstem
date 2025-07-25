package olamide.hawanat.librarymanagementsystem.Data.Repositories;

import olamide.hawanat.librarymanagementsystem.Data.Models.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepo extends MongoRepository<Member,String> {
}
