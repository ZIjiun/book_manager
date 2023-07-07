package com.Kent.Service;

import com.Kent.domain.Book;
import com.Kent.domain.PageBean;

import java.util.List;

public interface BookService {

    /**
     * 新增
     * @param book
     * @return
     */
    Boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    Boolean update(Book book);

    /**
     * 刪除
     * @param id
     * @return
     */
    Boolean delete(Integer id);

    /**
     * 根據 ID 查詢
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查詢所有
     * @return
     */
    List<Book> getAll();

    /**
     * 分頁查詢
     * @param begin
     * @param size
     * @return
     */
    List<Book> getPage(Integer begin, Integer size);

    /**
     * 條件分頁查詢
     * @param currentPage
     * @param pageSize
     * @param Book
     * @return
     */
    PageBean<Book> getByPageAndCondition(int currentPage, int pageSize, Book Book);
}
