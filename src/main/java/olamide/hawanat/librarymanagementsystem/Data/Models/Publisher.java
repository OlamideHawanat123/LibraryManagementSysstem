package olamide.hawanat.librarymanagementsystem.Data.Models;

import org.springframework.data.annotation.Id;

public class Publisher {
    @Id
    private String id;
    private String fullName;
    private String email;
}
