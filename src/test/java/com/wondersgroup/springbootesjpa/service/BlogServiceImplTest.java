package com.wondersgroup.springbootesjpa.service;

import com.wondersgroup.springbootesjpa.domain.es.ESBlog;
import com.wondersgroup.springbootesjpa.repository.BlogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogServiceImplTest {

    @Autowired
    private  BlogService blogService;
    @Autowired
    private BlogRepository blogRepository;

    public  void setUp(){
        List<ESBlog> esBlogs=new ArrayList<>();
        esBlogs.add(new ESBlog("Author","java基础","java基础实战"));
        esBlogs.add(new ESBlog("js","js基础","javascript"));
        esBlogs.add(new ESBlog(".net","c#",".net实战"));
        esBlogs.add(new ESBlog("doubl","doubl","doubl"));
        blogRepository.save(esBlogs);
    }

    @Test
    public  void TestFindPage(){
        Pageable pageable=new PageRequest(0,5);
        Sort sort=new Sort("title");
        blogService.findPage("java","js","基础",pageable,sort);

    }

}