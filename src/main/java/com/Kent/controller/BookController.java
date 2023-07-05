package com.Kent.controller;

import com.Kent.Service.BookService;
import com.Kent.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * 取得全部資料
     * @return
     */
    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    /**
     * 增加
     * @param book
     * @return
     */
    @PostMapping
    public Boolean save(@RequestBody Book book) {
        return bookService.save(book);
    }

    /**
     * 修改
     * @param book
     * @return
     */
    @PutMapping
    public Boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    /**
     * 根據 id 刪除
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    /**
     * 根據 id 查詢
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    /**
     * 分頁查詢
     * @param begin
     * @param size
     * @return
     */
    @GetMapping("{begin}/{size}")
    public List<Book> getByPage(@PathVariable int begin, @PathVariable int size){
        return bookService.getPage(begin, size);
    }
}
