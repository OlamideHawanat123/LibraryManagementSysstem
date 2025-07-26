package olamide.hawanat.librarymanagementsystem.DTOs.Responses;

import olamide.hawanat.librarymanagementsystem.Data.Models.User;
import olamide.hawanat.librarymanagementsystem.Data.Models.UserRole;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class RegisterUserResponse {
    private String id;
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDateTime dateJoined;
    private UserRole role;
    private String message;


    public RegisterUserResponse(User user) {
        this.id = user.getId();
        this.fullName = user.getFullName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.phoneNumber = user.getPhoneNumber();
        this.role = user.getRole();
        this.dateJoined = now();
    }
}
