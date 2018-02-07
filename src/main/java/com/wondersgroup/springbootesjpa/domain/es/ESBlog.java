package com.wondersgroup.springbootesjpa.domain.es;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

@Document(indexName = "blog",type = "bog")
public class ESBlog implements Serializable {
    @Id
    private  String id;

    private  String title;

    private  String author;

    private  String context;

    @CreatedDate
    private Date creatTime;
    @LastModifiedDate
    private  Date updatTime;

    protected ESBlog() {
    }

    public ESBlog(String title,String author, String context) {
        this.context = context;
        this.author = author;
        this.title = title;
    }
}
