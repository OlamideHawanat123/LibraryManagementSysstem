package olamide.hawanat.librarymanagementsystem.Data.Models;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private UserRole role;
    private String phoneNumber;
    private LocalDate dateJoined;
    private boolean isActive;

}
