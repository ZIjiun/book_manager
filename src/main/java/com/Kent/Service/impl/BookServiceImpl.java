package com.Kent.Service.impl;

import com.Kent.Service.BookService;
import com.Kent.dao.BookDao;
import com.Kent.domain.Book;
import com.Kent.domain.PageBean;
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
        return bookDao.update(book) > 0;
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

    @Override
    public PageBean<Book> getByPageAndCondition(int currentPage, int pageSize, Book book) {
        int begin = (currentPage - 1) * pageSize;

        // 如果傳過來的分頁參數，begin + 1 的值大於資料總數，就直接將查詢頁數調成第一頁
        int totalCount = bookDao.selectTotalCountByCondition(book);

        if (begin + 1 > totalCount ) {
            begin = 0;
        }

        List<Book> rows = bookDao.selectByPageAndCondition(begin, pageSize, book);
        PageBean<Book> pageBean = new PageBean<>();

        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);

        return pageBean;
    }
}
