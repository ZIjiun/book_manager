package com.Kent.dao;

import com.Kent.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {

    /**
     * 根據 ID 查詢
     * @param id
     * @return
     */
    @Select("select * from tbl_book where id = #{id}")
    Book selectById(Integer id);

    /**
     * 新增
     * @param book
     */
    @Insert("insert into tbl_book (type, name, description) values (#{type}, #{name}, #{description});")
    int add(Book book);

    /**
     * 修改
     * @param book
     */
    int update(Book book);

    /**
     * 刪除
     * @param id
     */
    @Delete("delete from tbl_book where id = #{id};")
    int delete(int id);

    /**
     * 查詢全部
     * @return
     */
    @Select("select * from tbl_book")
    List<Book> selectAll();

    /**
     * 分頁查詢
     * @param begin
     * @param size
     * @return
     */
    @Select("select  * from tbl_book limit #{begin} , #{size}")
    List<Book> selectByPage(@Param("begin") int begin,@Param("size") int size);

    /**
     * 條件分頁查詢
     * @param begin
     * @param size
     * @param book
     * @return
     */
    List<Book> selectByPageAndCondition(@Param("begin") int begin, @Param("size") int size, @Param("book") Book book);
}
