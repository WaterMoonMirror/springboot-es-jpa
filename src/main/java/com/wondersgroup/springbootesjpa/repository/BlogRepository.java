package com.wondersgroup.springbootesjpa.repository;

import com.wondersgroup.springbootesjpa.domain.es.ESBlog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BlogRepository extends ElasticsearchRepository<ESBlog,String> {
    public List<ESBlog> findDistinctByTitleLikeOrAuthorLikeOrContextLike(String title, String author, String context, Pageable pageable,Sort sort);
}
