package com.bdqn.mapper;

import com.bdqn.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 利哥
 * @Date: 2020/12/08 9:03
 * @Description:
 */
public interface BooksMapper {
    List<Books> getBooksList(@Param("type") String type, @Param("des") String des);

    int insertBook(Books books);
}
