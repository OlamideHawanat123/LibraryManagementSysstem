package olamide.hawanat.librarymanagementsystem.Services;

import olamide.hawanat.librarymanagementsystem.DTOs.Requests.RegisterUserRequest;
import olamide.hawanat.librarymanagementsystem.DTOs.Responses.RegisterUserResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService{
    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        return null;
    }
}
