package com.Kent.dao;

import com.Kent.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        System.out.println(bookDao.getById(2));
    }

    @Test
    void testAdd() {
        Book book = new Book();
        book.setType("test1");
        book.setName("test2");
        book.setDescription("test3");
        bookDao.add(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(79);
        book.setType("1");
        book.setName("2");
        book.setDescription("3");
        bookDao.update(book);
    }

    @Test
    void testDelete() {
        bookDao.delete(79);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectAll());
    }
}