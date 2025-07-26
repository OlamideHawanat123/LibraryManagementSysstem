package olamide.hawanat.librarymanagementsystem.Services;

import olamide.hawanat.librarymanagementsystem.DTOs.Requests.RegisterUserRequest;
import olamide.hawanat.librarymanagementsystem.DTOs.Responses.RegisterUserResponse;
import olamide.hawanat.librarymanagementsystem.Data.Models.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceImplementationTest {

    @Autowired
    private UserService userService;
    @Test
    public void testThatUserCanRegister(){
        RegisterUserRequest request = new RegisterUserRequest();
        request.setFullName("Olamide olamide");
        request.setEmail("Olamide@gmail.com");
        request.setPassword("Password");
        request.setPhoneNumber("09123456789");
        request.setRole(UserRole.ADMIN);

        RegisterUserResponse response = userService.registerUser(request);
        assertNotNull(response);
        assertEquals("User registered successfully", response.getMessage());

    }




}