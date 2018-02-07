package com.wondersgroup.springbootesjpa.service;

import com.wondersgroup.springbootesjpa.domain.es.ESBlog;
import com.wondersgroup.springbootesjpa.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements  BlogService {
    @Autowired
    private BlogRepository blogRepository;


    @Override
    public List<ESBlog> findPage(String t, String a, String c, Pageable p, Sort s) {
        return blogRepository.findDistinctByTitleLikeOrAuthorLikeOrContextLike(t,a,c, p,s);
    }
}
