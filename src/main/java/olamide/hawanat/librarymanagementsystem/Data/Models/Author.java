package olamide.hawanat.librarymanagementsystem.Data.Models;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Author {
    @Id
    private String id;
    private String fullName;
    private String nationality;
    private LocalDate birthDate;
}
