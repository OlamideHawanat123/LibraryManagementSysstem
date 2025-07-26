package olamide.hawanat.librarymanagementsystem.DTOs.Requests;

import lombok.Data;
import olamide.hawanat.librarymanagementsystem.Data.Models.UserRole;

import java.time.LocalDateTime;

@Data
public class RegisterUserRequest {
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private UserRole role;
}
