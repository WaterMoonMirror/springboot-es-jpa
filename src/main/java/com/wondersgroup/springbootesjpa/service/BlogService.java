package com.wondersgroup.springbootesjpa.service;

import com.wondersgroup.springbootesjpa.domain.es.ESBlog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BlogService {
    /**
     * 模糊匹配  、 分页 、排序
     * @param t
     * @param a
     * @param c
     * @param p
     * @param s
     * @return
     */
    List<ESBlog> findPage(String t, String a, String c, Pageable p, Sort s);
}
