package com.bdqn.controller;

import com.bdqn.entity.Books;
import com.bdqn.service.BooksService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 利哥
 * @Date: 2020/12/08 9:30
 * @Description:
 */

@Controller
@RequestMapping("book")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @RequestMapping("getBooksList")
    public String getBooksList(@RequestParam(value = "type",required = false) String type, @RequestParam(value = "des",required = false) String des, Model model,@RequestParam(value = "pageNo",required = false,defaultValue = "1") int pageNo){
        System.out.println("type = " + type);

        PageHelper.startPage(pageNo,2);

        List<Books> list = booksService.getBooksList(type, des);
        list.forEach(Books-> System.out.println(Books));
        PageInfo<Books> booksPageInfo = new PageInfo<>(list);
        model.addAttribute("list",booksPageInfo);
        return "bookList";
    }

    @RequestMapping("toBookAdd")
    public String toBookAdd(){
        return "bookAdd";
    }

    @ResponseBody
    @RequestMapping("doBookAdd")
    public Object doBookAdd(Books books){
        return  booksService.insertBook(books);
    }


}
