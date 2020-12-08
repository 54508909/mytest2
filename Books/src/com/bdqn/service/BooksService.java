package com.bdqn.service;

import com.bdqn.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 利哥
 * @Date: 2020/12/08 9:30
 * @Description:
 */
public interface BooksService {

    List<Books> getBooksList(@Param("type") String type, @Param("des") String des);

    int insertBook(Books books);
}
