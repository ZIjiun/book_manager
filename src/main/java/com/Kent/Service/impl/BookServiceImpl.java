package com.Kent.Service.impl;

import com.Kent.Service.BookService;
import com.Kent.dao.BookDao;
import com.Kent.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public Boolean save(Book book) {
        return bookDao.add(book) > 0;
    }

    @Override
    public Boolean update(Book book) {
        return bookDao.add(book) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectAll();
    }

    @Override
    public List<Book> getPage(Integer begin, Integer size) {
        return bookDao.selectByPage(begin, size);
    }
}
