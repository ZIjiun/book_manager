package com.Kent.service;

import com.Kent.Service.BookService;
import com.Kent.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("1test");
        book.setName("2test");
        book.setDescription("3test");
        System.out.println(bookService.save(book));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(80);
        book.setType("4");
        book.setName("5");
        book.setDescription("6");
        bookService.update(book);
    }

    @Test
    void testDelete() {
        bookService.delete(86);
    }

    @Test
    void testGetByID() {
        System.out.println(bookService.getById(80));
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage() {
        System.out.println(bookService.getPage(1, 5));
    }

}
