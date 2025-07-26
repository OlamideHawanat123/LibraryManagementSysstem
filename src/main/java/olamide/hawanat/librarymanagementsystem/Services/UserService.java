package olamide.hawanat.librarymanagementsystem.Services;

import olamide.hawanat.librarymanagementsystem.DTOs.Requests.RegisterUserRequest;
import olamide.hawanat.librarymanagementsystem.DTOs.Responses.RegisterUserResponse;
import org.springframework.stereotype.Service;

public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest request);
}
