package com.Kent.dao;

import com.Kent.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao {

    /**
     * 根據 ID 查詢
     * @param id
     * @return
     */
    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

    /**
     * 新增
     * @param book
     */
    @Insert("insert into tbl_book (type, name, description) values (#{type}, #{name}, #{description});")
    void add(Book book);

    /**
     * 修改
     * @param book
     */
    void update(Book book);

    /**
     * 刪除
     * @param id
     */
    @Delete("delete from tbl_book where id = #{id};")
    void delete(int id);

    /**
     * 查詢全部
     * @return
     */
    @Select("select * from tbl_book")
    List<Book> selectAll();
}