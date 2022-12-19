package com.dailycodechallenge.Spring.Boot.First.Approach.controller;

import com.michael.libraryservice.api.LibraryApi;
import com.michael.libraryservice.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        Book b1 = new Book();
        b1.setName("CS");
        b1.setBookAuthor("Author1");

        Book b2 = new Book();
        b2.setName("DS");
        b2.setBookAuthor("Author2");

        Book b3 = new Book();
        b3.setName("DBMS");
        b3.setBookAuthor("Author3");

        List<Book> books = List.of(b1,b2,b3);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
