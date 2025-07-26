package olamide.hawanat.librarymanagementsystem.Data.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "Users")
@Data
public class User {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String password;
    private UserRole role;
    private String phoneNumber;
    private LocalDateTime dateJoined;
    private boolean isActive;

}
