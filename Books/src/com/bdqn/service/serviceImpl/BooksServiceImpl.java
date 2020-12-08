package com.bdqn.service.serviceImpl;

import com.bdqn.entity.Books;
import com.bdqn.mapper.BooksMapper;
import com.bdqn.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 利哥
 * @Date: 2020/12/08 9:30
 * @Description:
 */


@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksMapper booksMapper;
    @Override
    public List<Books> getBooksList(String type, String des) {
        return booksMapper.getBooksList(type, des);
    }

    @Override
    public int insertBook(Books books) {
        return booksMapper.insertBook(books);
    }
}
