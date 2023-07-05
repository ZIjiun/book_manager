package com.Kent.controller;

import com.Kent.Service.BookService;
import com.Kent.controller.utils.R;
import com.Kent.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
    public R getAll() {
        return new R(true, bookService.getAll());
    }

    /**
     * 增加
     * @param book
     * @return
     */
    @PostMapping
    public R save(@RequestBody Book book) {
        return new R(bookService.save(book));
    }

    /**
     * 修改
     * @param book
     * @return
     */
    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.update(book));
    }

    /**
     * 根據 id 刪除
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.delete(id));    }

    /**
     * 根據 id 查詢
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }

    /**
     * 分頁查詢
     * @param begin
     * @param size
     * @return
     */
    @GetMapping("{begin}/{size}")
    public R getByPage(@PathVariable int begin, @PathVariable int size){
        return new R(true, bookService.getPage(begin, size));
    }
}
