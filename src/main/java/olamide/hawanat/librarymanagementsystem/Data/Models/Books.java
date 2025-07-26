package olamide.hawanat.librarymanagementsystem.Data.Models;

import org.springframework.data.annotation.Id;

public class Books {
    @Id
    private String id;
    private String title;
    private String isbn;
    private Author author;
    private Publisher publisher;
    private Category category;
    private int totalCopies;
    private int availableCopies;
    private String imageUrl;

}
